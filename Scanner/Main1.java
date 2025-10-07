public class Main1 {

    static void checkAge(int age) {
        if (age > 18) {
            System.out.println("VE");
        } else {
            System.out.println("NVE");
        }
    }

    public static void main(String[] args) {
        checkAge(20);
        checkAge(15);
    }
}
