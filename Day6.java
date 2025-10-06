
class Day6 {

    public static void main(String args[]) {
        // for (int i = 1; i <= 10; i++) {
        //     // System.out.println(i);
        //     if (i == 5) {
        //         // break;
        //         continue;
        //     }
        //     System.out.println(i);
        // }

        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=5;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=5;j++){
        //         System.out.print(i);
        //     }
        //     System.out.println("");
        // }
        // for (int i = 1; i <= 5; i++) {
        //     for (int j = 1; j <= 5; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println("");
        // }
        // for (int i = 5; i >= 1; i--) {
        //     for (int j = 1; j <= 5; j++) {
        //         System.out.print(i);
        //     }
        //     System.out.println("");
        // }
        // for(int i=5;i>=1;i--){
        //     for(int j=5;j>=1;j--){
        //         System.out.print(j);
        //     }
        //     System.out.println("");
        // }
        int k = 1;
        // for (int i = 1; i <= 5; i++) {
        //     for (int j = 1; j <= 5; j++) {
        //         System.out.print(k+" ");
        //         k++;
        //     }
        //     System.out.println("");
        // }

        // for (int i = 1; i <= 5; i++) {
        //     for (int j = 1; j <= 5; j++) {
        //         System.out.print(k+" ");
        //         k+=2;
        //     }
        //     System.out.println("");
        // }
        // for(char i='A';i<='E';i++){
        //     for(char j='A';j<='E';j++){
        //         System.out.print(i);
        //     }
        //     System.out.println("");
        // }
        // for (char i = 'A'; i <= 'E'; i++) {
        //     for (char j = 'A'; j <= 'E'; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println("");
        // }
        // for (int i = 1; i <= 5; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }
        // for (int i = 1; i <= 5; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(i);
        //     }
        //     System.out.println("");
        // }
        // for (int i = 1; i <= 5; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println("");
        // }

         for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
