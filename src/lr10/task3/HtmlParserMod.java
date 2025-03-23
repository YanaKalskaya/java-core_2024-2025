package lr10.task3;

import java.io.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class HtmlParserMod {
    public static void main(String[] args) throws IOException {
        String url = "https://itlearn.ru/first-steps";
        BufferedWriter bw = null;
        Document doc = null;

        int maxAttempts = 4;
        int currentAttempt = 1;

        try {
            while (currentAttempt <= maxAttempts && doc == null) {
                try {
                    doc = Jsoup.connect(url).timeout(5000).get();
                } catch (IOException e) {
                    if (currentAttempt < maxAttempts) {
                        System.out.println("Попытка " + currentAttempt + " не удалась. Повторное подключение...");
                        currentAttempt++;
                        Thread.sleep(2000);
                    } else {
                        System.out.println("Не удалось подключиться к сайту после " + (maxAttempts - 1) + " попыток.");
                        throw e;
                    }
                }
            }
            Elements links = doc.select("a[href]");

            File f1 = new File("src/lr10/task3/text.txt");
            f1.createNewFile();

            bw = new BufferedWriter(new FileWriter(f1.getAbsolutePath()));

            for (Element link : links) {
                bw.write(link.attr("abs:href"));
                bw.newLine();
                System.out.println(link.attr("abs:href"));
            }
        } catch (IOException | InterruptedException e) {
            System.out.println("Произошла ошибка при работе с сайтом или файлом: " + e.getMessage());
            e.printStackTrace();
        } finally {
            if (bw != null) {
                bw.flush();
                bw.close();
            }
        }
    }
}
