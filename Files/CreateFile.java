
import java.io.File;
import java.io.IOException;

public class CreateFile {

    public static void main(String args[]) {
        // try {
        //     File answer = new File("CSZ.txt");
        //     if (answer.createNewFile()) {
        //         System.out.println("File Created");
        //     } else {
        //         System.out.println("File Already Exists");
        //     }
        // } catch (IOException e) {
        //     System.out.println("Error");
        // }

        File answer=new File("CSZ.txt");
        if(answer.exists()){
            System.out.println(answer.getName());
            System.out.println(answer.getAbsolutePath());
            System.out.println(answer.length());
            System.out.println(answer.canRead());
            System.out.println(answer.canWrite());
        }
        else{
            System.out.println("File does not exist");
        }

    }
}
