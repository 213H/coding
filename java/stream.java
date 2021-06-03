// test15
import java.io.*;
public class stream{
    public static void main(String[] args){
        FileInputStream fin;
        FileOutputStream fout;
        String a = "a.txt";
        String b = "b.txt";
        int ch;
        try{
            fin = new FileInputStream(a);
            fout = new FileOutputStream(b);
            while((ch = fin.read()) != -1){
                fout.write(ch);
            }
            fout.close();
            fin.close();
            System.out.println("Sucessful");
        }
        catch(FileNotFoundException e){

        }
        catch(IOException e){

        }
    }
}