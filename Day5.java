
public class Day5 {

    public static void main(String args[]) {

        // Absoulte Value 
        // int num=-10;
        // int abs=(num>=0) ? num : -num;
        // // int abs=(-10>-0) ? num : -(-10)
        // System.out.println(abs);
        // int num=1;
        // String answer=(num%2==0) ? "Even" : "Odd";
        // System.out.println(num + " is "+answer);
        // int num=-10;
        // String answer=(num>0) ? "Positive Number" : "Negative Number";
        // System.out.println(answer);
        // if(num>0){
        //     System.out.println("+Ve");
        // }
        // else{
        //     System.out.println("-Ve");
        // }
        // int day=10;
        // switch(day){
        //     case 1:
        //     {
        //         System.out.println("Monday");
        //         break;
        //     }
        //     case 2:
        //     {
        //         System.out.println("Tuesday");
        //         break;
        //     }
        //     case 3:{
        //         System.out.println("Wednesday");
        //         break;
        //     }
        //     case 4:{
        //         System.out.println("Thursday");
        //         break;
        //     }
        //     case 5:{
        //         System.out.println("Friday");
        //         break;
        //     }
        //     case 6:{
        //         System.out.println("Saturday");
        //         break;
        //     }
        //     case 7:{
        //         System.out.println("Sunday");
        //         break;
        //     }
        //     default:
        //     {
        //         System.out.println("Invalid Day - (Please Enter the Value 1 to 7 Only)");
        //         break;
        //     }
        String Opr = "+";
        int num1 = 10;
        int num2 = 2;
        switch (Opr) {
            case "+": {
                int answer = num1 + num2;
                System.out.println(answer);
                break;
            }
            case "-": {
                int answer = num1 - num2;
                System.out.println(answer);
                break;
            }
            case "*": {
                int answer = num1 * num2;
                System.out.println(answer);
                break;
            }
            case "/": {
                int answer = num1 + num2;
                System.out.println(answer);
            }
            default: {
                System.out.println("Please Enter the Value +, -, *,/");
                break;
            }
        }
    }
}
