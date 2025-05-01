package lr13.examples;

public class Example8 {
    public static int m() {
        try {
            System.out.println("0");
            throw new RuntimeException();
        } finally {
            System.out.println("1");
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println(m());
        } catch (Exception e) {
            System.out.println("Исключение из метода m: " + e);
        }
    }
}

//Перехват брошенного исключения catch не производится. Секция finally выполняется всегда.
//public class Example8 {
//    public static int m() {
//        try {
//            System.out.println("0");
//            throw new RuntimeException();
//        } finally {
//            System.out.println("1");
//        }
//    }
//
//    public static void main(String[] args) {
//        System.out.println(m());
//    }
//}
