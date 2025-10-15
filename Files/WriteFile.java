import java.io.FileWriter;
import java.io.IOException;
public class WriteFile {

    public static void main(String[] args) {
        try{
            FileWriter answer=new FileWriter("CSZ.txt");
            answer.write("Welcome to Credo Systemz");
            answer.close();
            System.out.println("Successfull Done");
        }
        catch(IOException e){
            System.out.println("Error");
        }
    }
    
}
