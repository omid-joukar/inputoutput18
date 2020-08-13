import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by KPS on 8/13/2020.
 */
public class Main {
    public static void main(String[] args) {
        File path = new File("d:\\employee.txt");
        String[] words = new String[1024];
        try(FileReader reader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(reader)){
            String line = " ";
            String total = " ";
            while ((line=bufferedReader.readLine())!=null){
                total+=line+" "+"\t\n";
            }
            words = total.split(" ");
            System.out.println(maxM(words));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String maxM(String[] words){
        String max = "";
        int maxLength = 0;
        for (int  i = 0 ; i < words.length-1;i++){
            if (words[i].length()>maxLength){
                max = words[i];
                maxLength = words[i].length();
            }
        }
        return max;
    }
}
