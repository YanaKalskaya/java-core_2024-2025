package lr13.examples;

public class Example5 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1");
        } catch (RuntimeException e) {
            System.out.println("Исключение " + e);
        }
        System.out.println("2");
    }
}

// Исключение не перехвачено
//public class Example5 {
//    public static void main(String[] args) {
//        try {
//            System.out.println("0");
//            throw new RuntimeException("ошибка");
//        } catch (NullPointerException e) {
//            System.out.println("1");
//        }
//        System.out.println("2");
//    }
//}
