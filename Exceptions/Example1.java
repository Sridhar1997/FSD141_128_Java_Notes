
public class Example1 {

    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access Defined");
        } else {
            System.out.println("Access Granted");
        }
    }

    public static void main(String args[]) {
        // try{
        //     int answer=10/2;
        //     System.out.println(answer);
        // }
        // catch(ArithmeticException e){
        //     System.out.println("Error - Division by Zero is not allowed!");
        // }

        // int answer=10/0;
        // System.out.println(answer);
        // try{
        //     int[] arr={1,2,3};
        //     System.out.println(arr[12]);
        // }
        // catch(ArrayIndexOutOfBoundsException e){
        //     System.out.println("Error - Invalid Array Index!!");
        // }
        // int[] arr={1,2,3};
        // System.out.println(arr[12]);
        // try {
        //     String str="CSZ";
        //     System.out.println(str.length());
        // } catch (NullPointerException e) {
        //     System.out.println("Error - Null Object cannot be accessed!!!");
        // }
        // finally{
        //     System.out.println("Output Done");
        // }
        try {
            checkAge(15);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
