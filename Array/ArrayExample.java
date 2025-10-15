// Arrays are used to store multiple values in a single variable

public class ArrayExample {

    public static void main(String args[]) {
        // int marks[] = {10, 20, 30, 40, 50, 60};
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // int[] marks={50,60,70,80,90};
        // System.out.println(marks[0]);
        // String topics[] = {"HTML", "CSS", "BS", "JS", "React JS", "Redux", "Java", "Spring Boot"};
        // Array Length
        // System.out.println(topics.length);
        // System.out.println(topics[0]);
        // Change an Array Element
        // topics[0] = "XML & HTML";
        // System.out.println(topics[0]);

        // new Keyword
        // String topics[] = new String[4];
        // topics[0] = "HTML, CSS, BS";
        // topics[1] = "JS, React JS, Redux";
        // topics[2] = "Java";
        // topics[3] = "Spring Boot";
        // System.out.println(topics[0]);
        // System.out.println(topics[3]);
        // String topics[] = {"HTML", "CSS", "BS", "JS", "React JS", "Redux", "Java", "Spring Boot"};
        // for (int i = 0; i < topics.length; i++) {
        //     System.out.println(i + " - " + topics[i]);
        // }
        // Calculate the Sum of Elements
        int marks[] = {80, 90, 99, 80, 88, 99, 99, 80, 70};
        int sum = 0;
        float avg;
        int length = marks.length;
        System.out.println("Length - " + length);
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
            // sum=sum+marks[i]
            System.out.println("SUM - " + sum);
        }
        System.out.println("Answer - " + sum);
        avg = sum / length;
        System.out.println("Avg - " + avg);
        // String topics[] = {"HTML", "CSS", "BS", "JS", "React JS", "Redux", "Java", "Spring Boot"};

        // for(type varisable:arrayname){
        // Code Block to be Executed
        // }
        // for (String i : topics) {
        //     System.out.println(i);
        // }
    }
}
