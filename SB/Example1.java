// What is StringBuilder in Java?

// StringBuilder is a mutable sequence of characters, meaning you can modify (append
// , insert, delete or reverse) a String without creating a new object
// Its faster and more efficient than String when performing multiple 
// string manipulations 
// Why use StringBuilder? 
// 1. String objects are immutable(can not be changed once created)
// 2. Each String modification creates a new object -> 
// Slower and memory consuming
// 3. StringBuilder allows in-place modification ->
// Faster and memory efficient 
// Syntax 
// Exmpy Builder 
// StringBuilder sb=new StringBuilder()
// Initialize with value
// StringBuilder sb=new StringBuilder("Credo")
public class Example1 {

    public static void main(String args[]) {
        // StringBuilder sb = new StringBuilder("Hello");
        // System.out.println(sb);
        // Adds text to the end - append()
        // sb.append(" World");
        // System.out.println(sb);

        // StringBuilder sb=new StringBuilder("Java");
        // sb.insert(4, " Programming");
        // System.out.println(sb);
        // StringBuilder sb=new StringBuilder("Hello Java");
        // System.out.println(sb);
        // sb.replace(6, 10, "World");
        // // 6<10 - 6,7,8,9
        // System.out.println(sb);
        // StringBuilder sb=new StringBuilder("Computer");
        // System.out.println(sb);
        // sb.delete(3, 6);
        // // 3<6 - 3,4,5
        // System.out.println(sb);
        // StringBuilder sb = new StringBuilder("Java");
        // System.out.println(sb);
        // sb.reverse();
        // System.out.println(sb);
        // System.out.println(sb.length());
        // StringBuilder sb = new StringBuilder("Java");
        // System.out.println(sb);
        // sb.setCharAt(0, 'K');
        // System.out.println(sb);
        // System.out.println(sb.charAt(1));
        // StringBuilder sb = new StringBuilder("Programming");
        // // System.out.println(sb.substring(0, 6));
        // // 0<6 - 0,1,2,3,4,5
        // System.out.println(sb.substring(3));

        StringBuilder sb=new StringBuilder("Java");
        String str=sb.toString();
        System.out.println(sb);
        System.out.println(str);

    }
}
