
public class ArrayProgram {

    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}};

        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                System.out.println("number[" + row + "][" + col + "] = " + numbers[row][col]);
            }
        }

        // System.out.println("Rows : "+numbers.length);
        // System.out.println(numbers[0].length);
        // System.out.println(numbers[1].length);
        // System.out.println(numbers[0][0]);
        // System.out.println(numbers[0][1]);
        // System.out.println(numbers[0][2]);
        // System.out.println(numbers[1][0]);
        // numbers[1][0]=15;
        // System.out.println(numbers[1][0]);
        //     System.out.println(numbers[1][1]);
        //     System.out.println(numbers[1][2]);
    }

}
