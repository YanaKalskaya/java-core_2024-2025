package lr10.task1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.util.*;
import javax.xml.parsers.*;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class XmlParserMod {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, TransformerException {
        Scanner in = new Scanner(System.in);
        System.out.println("Доступные действия: ");
        System.out.println("1 - Отобразить список дней рождений");
        System.out.println("2 - Добавить день рождения");
        System.out.println("3 - Найти день рождения по имени");
        System.out.println("4 - Найти человека по дню рождения");
        System.out.println("5 - Удалить день рождения");
        System.out.println("0 - Выйти");

        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(new File("src/lr10/task1/filexml.xml"));
        doc.getDocumentElement().normalize();

        while (true) {
            int action = in.nextInt();
            switch (action) {
                case 1:
                    showBirthdays(doc);
                    break;
                case 2:
                    addBirthday(doc);
                    break;
                case 3:
                    searchByName(doc);
                    break;
                case 4:
                    searchByDate(doc);
                    break;
                case 5:
                    deleteBirthday(doc);
                    break;
                case 0:
                    in.close();
                    System.exit(0);
                default:
                    break;
            }
        }
    }

    private static void showBirthdays(Document doc) {
        NodeList nodeList = doc.getElementsByTagName("birthday");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            System.out.println("\nЭлемент: " + node.getNodeName());
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                System.out.println("Имя: " + element.getElementsByTagName("name").item(0).getTextContent());
                System.out.println("День рождения: "+ element.getElementsByTagName("date").item(0).getTextContent());
            }
        }

    }

    private static void addBirthday(Document doc) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = in.nextLine();
        System.out.println("Введите дату рождения:");
        String date = in.nextLine();

        Element rootElement = doc.getDocumentElement();
        Element newBirthday = doc.createElement("birthday");

        Element nameElement = doc.createElement("name");
        nameElement.setTextContent(name);
        newBirthday.appendChild(nameElement);

        Element dateElement = doc.createElement("date");
        dateElement.setTextContent(date);
        newBirthday.appendChild(dateElement);

        rootElement.appendChild(newBirthday);

        saveChanges(doc);
        System.out.println("Новый день рождения добавлен!");
    }

    private static void searchByName(Document doc) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя (ФИО): ");
        String name = in.nextLine();
        NodeList nodeList = doc.getElementsByTagName("birthday");
        List<Element> filteredBirthdays = new ArrayList<>();

        for (int i = 0; i < nodeList.getLength(); i++) {
            Element birthday = (Element) nodeList.item(i);
            if (birthday.getElementsByTagName("name").item(0).getTextContent().equalsIgnoreCase(name)) {
                filteredBirthdays.add(birthday);
            }
        }

        if (filteredBirthdays.isEmpty()) {
            System.out.println("Не найден день рождения для: " + name);
        } else {
            for (Element birthday : filteredBirthdays) {
                System.out.println("Имя: " + birthday.getElementsByTagName("name").item(0).getTextContent());
                System.out.println("День рождения: " + birthday.getElementsByTagName("date").item(0).getTextContent());
                System.out.println();
            }
        }
    }

    private static void searchByDate(Document doc) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите дату (**.**.****): ");
        String date = in.nextLine();
        NodeList nodeList = doc.getElementsByTagName("birthday");
        List<Element> filteredBirthdays = new ArrayList<>();

        for (int i = 0; i < nodeList.getLength(); i++) {
            Element birthday = (Element) nodeList.item(i);
            if (birthday.getElementsByTagName("date").item(0).getTextContent().equalsIgnoreCase(date)) {
                filteredBirthdays.add(birthday);
            }
        }

        if (filteredBirthdays.isEmpty()) {
            System.out.println("Не найден человек с днем рождения: " + date);
        } else {
            for (Element birthday : filteredBirthdays) {
                System.out.println("Имя: " + birthday.getElementsByTagName("name").item(0).getTextContent());
                System.out.println("День рождения: " + birthday.getElementsByTagName("date").item(0).getTextContent());
                System.out.println();
            }
        }
    }

    private static void deleteBirthday(Document doc) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя человека, день рождения которого нужно удалить:");
        String name = scanner.nextLine();

        NodeList nodeList = doc.getElementsByTagName("birthday");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node birthday = nodeList.item(i);
            if (birthday.getNodeType() == Node.ELEMENT_NODE) {
                Element birthdayElement = (Element) birthday;
                String birthdayName = birthdayElement.getElementsByTagName("name").item(0).getTextContent();
                if (birthdayName.equals(name)) {
                    birthday.getParentNode().removeChild(birthday);
                    System.out.println("Человек " + name + " удален.");
                    saveChanges(doc);
                    return;
                }
            }
        }
        System.out.println("День рождения для " + name + " не найден.");
    }

    private static void saveChanges(Document doc) {
        try {
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("src/lr10/task1/filexml.xml"));
            transformer.transform(source, result);
            System.out.println("Изменения сохранены");
        } catch (TransformerException e) {
            System.out.println("Ошибка сохранения");
        }
    }
}
