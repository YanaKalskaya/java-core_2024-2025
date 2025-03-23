package lr10.task2;

import java.io.*;
import java.util.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonParserMod {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner in = new Scanner(System.in);
        System.out.println("Доступные действия: ");
        System.out.println("1 - Отобразить список дней рождений");
        System.out.println("2 - Добавить день рождения");
        System.out.println("3 - Найти день рождения по имени");
        System.out.println("4 - Удалить день рождения");
        System.out.println("0 - Выйти");

        JSONParser parser = new JSONParser();
        Object obj = parser.parse(new FileReader("src/lr10/task2/filejson.json"));
        JSONObject jsonObject = (JSONObject) obj;

        while (true) {
            int action = in.nextInt();
            switch (action) {
                case 1:
                    showBirthdays(jsonObject);
                    break;
                case 2:
                    addBirthday(jsonObject);
                    break;
                case 3:
                    searchByName(jsonObject);
                    break;
                case 4:
                    deleteBirthday(jsonObject);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }

    private static void showBirthdays(JSONObject jsonObject) {
        JSONArray jsonArray = (JSONArray) jsonObject.get("birthdays");
        for (Object o : jsonArray) {
            JSONObject birthday = (JSONObject) o;
            System.out.println();
            System.out.println("Имя: " + birthday.get("name"));
            System.out.println("День рождения: " + birthday.get("date"));
        }
    }

    private static void addBirthday(JSONObject jsonObject) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = in.nextLine();
        System.out.println("Введите дату рождения:");
        String date = in.nextLine();

        JSONArray jsonArray = (JSONArray) jsonObject.get("birthdays");
        JSONObject newBook = new JSONObject();
        newBook.put("name", name);
        newBook.put("date", date);
        jsonArray.add(newBook);

        saveChanges(jsonObject);
        System.out.println("Новый день рождения добавлен!");
    }

    private static void searchByName(JSONObject jsonObject) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя (ФИО): ");
        String name = in.nextLine();

        JSONArray jsonArray = (JSONArray) jsonObject.get("birthdays");
        jsonArray.stream()
                .filter(birthday -> birthday instanceof JSONObject)
                .filter(birthday -> name.equals(((JSONObject) birthday).get("name")))
                .forEach(birthday -> {
                    System.out.println("Имя: " + ((JSONObject) birthday).get("name"));
                    System.out.println("День рождения: " + ((JSONObject) birthday).get("date"));
                });
        System.out.println("Поиск завершен");
    }

    private static void deleteBirthday(JSONObject jsonObject) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя человека, день рождения которого нужно удалить:");
        String name = scanner.nextLine();

        JSONArray jsonArray = (JSONArray) jsonObject.get("birthdays");
        Iterator iterator = jsonArray.iterator();
        while (iterator.hasNext()) {
            JSONObject birthday = (JSONObject) iterator.next();
            if (name.equals(birthday.get("name"))) {
                iterator.remove();
            }
        }
        saveChanges(jsonObject);
        System.out.println("День рождения для человека с именем " + name + " удален");
    }

    private static void saveChanges(JSONObject jsonObject) {
        try {
            FileWriter file = new FileWriter("src/lr10/task2/filejson.json");
            file.write(jsonObject.toJSONString());
            System.out.println("Изменения сохранены");
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
