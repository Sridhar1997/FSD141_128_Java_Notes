// String - String are used for storing text
// A String variable contains a collections of characters surrounded by double quotes

public class StringProgram {

    public static void main(String[] args) {

        String check="Java Programming is Good, Java is PowerFull, I Love Java";
        System.out.println(check.indexOf("Java"));
        System.out.println(check.lastIndexOf("Java"));

        // String answer="10";
        // System.out.println(answer.toString());

        // String check="Call Cat Cut";
        // String regex="Call";
        // System.out.println(check.replaceFirst(regex, "Ball"));
        // System.out.println(check.replace("C", "B"));

        // String check = "Sridhar Raj P";
        // String check1="";
        // System.out.println(check.isEmpty());
        // System.out.println(check1.isEmpty());
        // System.out.println(check.startsWith("S"));
        // System.out.println(check.endsWith("J"));
        // System.out.println(check.contains("Raj"));

        // String FName="Sridhar";
        // String LName="Raj P";
        // System.out.println(FName+LName);
        // System.out.println(FName.concat(LName));
        // compareTo() - Compares two strings - INT 0 - Equal
        // String txt1 = "Credo";
        // String txt2 = "Sri";
        // System.out.println(txt1.compareTo(txt2));
        // System.out.println(txt1.compareToIgnoreCase(txt2));
        // Returns An INT Value - 0 if the String is equal to the other string
        // <0 - if the String is lexicographically less than the other String 
        // >0 - if the String is lexicographically greater than the other String (more characters)
        // String txt = "      Credo Systemz     ";
        // System.out.println(txt);
        // System.out.println(txt.trim());
        // String PWD1 = "Sridhar@123";
        // String PWD2 = "Credo@123";
        // String PWD3 = "Credo@123";
        // System.out.println(PWD1.equals(PWD2));
        // System.out.println(PWD2.equals(PWD3));
        // String Name = "Credo Systemz";
        // System.out.println(Name.indexOf("o"));
        // System.out.println(Name.charAt(4));
        // System.out.println(Name);
        // System.out.println(Name.length());
        // // 0 - Index / Position, 1 - Length
        // System.out.println(Name.toUpperCase());
        // System.out.println(Name.toLowerCase());
    }
}
