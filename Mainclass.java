import java.io.FileWriter;
import java.io.IOException;

public class Mainclass {
    public static void main(String[] args) {

        try{
            FileWriter fw = new FileWriter("output.txt"); 
            fw.write("Hello World");
            fw.close();


        }
        catch (IOExeception e) {
            System.out.println("SOmething has happened");
        }
    }
}