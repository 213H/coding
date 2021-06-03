// test16
import java.io.*;
public class file{
    public static void main(String[] args){
        InputStreamReader reader;
        OutputStreamWriter writer;
        String a = "a.txt";
        String b = "b.txt";
        int ch;
        try{
            reader = new InputStreamReader(new FileInputStream(a));
            writer = new OutputStreamWriter(new FileOutputStream(b));
            while((ch = reader.read()) != -1){
                writer.write(ch);
            }
            writer.close();
            reader.close();
        }
        catch(FileNotFoundException e){

        }
        catch(IOException e){
            
        }
    }
}