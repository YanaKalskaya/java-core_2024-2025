package lr13.examples;

public class Example7 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (NullPointerException e) {
            try {
                System.out.println("1");
                throw new ArithmeticException();
            } catch (ArithmeticException e1) {
                System.out.println("Исключение " + e1);
            }
        } catch (ArithmeticException e) {
            System.out.println("2");
        }
        System.out.println("3");
    }
}

//Нельзя перехватить брошенное исключение с помощью чужого catch
//public class Example7 {
//    public static void main(String[] args) {
//        try {
//            System.out.println("0");
//            throw new NullPointerException("ошибка");
//        } catch (NullPointerException e) {
//            System.out.println("1");
//            throw new ArithmeticException();
//        } catch (ArithmeticException e) {
//            System.out.println("2");
//        }
//        System.out.println("3");
//    }
//}
