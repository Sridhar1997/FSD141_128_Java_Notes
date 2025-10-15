// Whats is SStringBuffer in Java? 

// StringBuffer is a mutable sequence of characters (like StringBuilder)
// but it is thread safe - meaning its synchronized and can be safely used by multiple threads
// simultanously
// its used when you need to modify strings frequently(append, insert, delete, etc) in a multi-
// threaded enviroment
// Why use StringBuffer?
// 1. String is immutable -> Creates  new Objects for every modification
// StringBuffer is mutable -> modifies the existing object
// its Synchronized -> safe for use in multi-threaded applications 
// Syntax
// 1. Empty Buffer
// StringBuffer sb=new StringBuffer();
// 2. Initialize with Value
// StringBuffer sb=new StringBuffer("Hello")
// With Specific capacity
// StringBuffer sb=new StringBuffer(50)
public class Example2 {

    public static void main(String[] args) {
        // StringBuffer sb = new StringBuffer("Hello");
        // System.out.println(sb);
        // sb.append(" Java");
        // System.out.println(sb);

        //  StringBuffer sb = new StringBuffer("Programming");
        //  sb.insert(11, " in Java");
        //  System.out.println(sb);

        //  StringBuffer sb = new StringBuffer("Hello World");
        //  sb.replace(6, 11, "Java");
        //  System.out.println(sb);

        //  StringBuffer sb = new StringBuffer("Computer");
        //  sb.delete(3, 6);
        // //  3<6 - 3,4,5
        // System.out.println(sb);

         StringBuffer sb = new StringBuffer("Java");
         sb.reverse();
         System.out.println(sb);
         System.out.println(sb.length());
    }
}
