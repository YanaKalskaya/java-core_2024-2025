package lr10.task4;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelParserMod {
    public static void main(String[] args) {
        String filePath = "src/lr10/task4/example5.xlsx";
        FileInputStream inputStream = null;
        XSSFWorkbook workbook = null;

        try {
            inputStream = new FileInputStream(filePath);
            workbook = new XSSFWorkbook(inputStream);
            XSSFSheet sheet = workbook.getSheet("Товары");
            if (sheet == null) {
                throw new IllegalArgumentException("Лист 'Товары' не найден в файле");
            }
            for (Row row : sheet) {
                for (Cell cell : row) {
                    System.out.print(cell.toString() + "\t");
                }
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println("Ошибка при работе с файлом: " + e.getMessage());
            System.out.println("Убедитесь, что файл существует по пути: " + filePath);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка в структуре файла: " + e.getMessage());
            System.out.println("Проверьте, что файл содержит лист с названием 'Товары'");
        } catch (Exception e) {
            System.out.println("Непредвиденная ошибка: " + e.getMessage());
        } finally {
            try {
                if (workbook != null) {
                    workbook.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                System.out.println("Ошибка при закрытии ресурсов: " + e.getMessage());
            }
        }
    }
}
