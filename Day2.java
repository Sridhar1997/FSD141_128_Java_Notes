
class Day2 {

    public static void main(String args[]) {
        // Add 5 Numbers - > Total, Avg 
        // int T=90;
        // int E=80;
        // int M=90;
        // int S=100;
        // int SS=100;

        // int total=T+E+M+S+SS;
        // System.out.println("Total - "+total);
        // double avg=total/5;
        // System.out.println("Avg - "+avg);
        // int C = 10;
        // double F = (C * 9 / 5) + 32;
        // System.out.println(F);
        // int CY=2025;
        // int DOB=1997;
        // int Answer=CY-DOB;
        // System.out.println(Answer);
        // int PA = 500000;
        // int RI = 7;
        // int TP = 5;

        // int SI = (PA * RI * TP) / 100;
        // // System.out.println(SI);

        // System.out.println("PA - " + PA);
        // System.out.println("SI - " + SI);
        // int answer=PA+SI;
        // System.out.println("TA - " + answer);

        int a=5;
        int b=10; 

        System.out.println("Before Swapping...");
        System.out.println("A = > "+a);
        System.out.println("B = > "+b);

        a=a+b; // a=5,b=10   15=5+10  a=15
        b=a-b; // a=15,b=10     5=15-10  b=5 
        a=a-b;  // a=15,b=5      10=15-5 a=10

        System.out.println("After Swapping...");
        System.out.println("A = > "+a);
        System.out.println("B = > "+b);
     }
}
