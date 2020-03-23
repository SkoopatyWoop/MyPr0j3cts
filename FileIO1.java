import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.io.IOException;
public class FileIO1 {
    public static void main(String[] args) throws IOException {
    List<String> lines = new ArrayList<>();
    File f1 = null;
    File f2 = null;



        try {
            String line = " ";
            f1 = new File("modme.txt");
            f2 = new File("done.txt");
            FileReader fr = new FileReader(f1);
            BufferedReader br = new BufferedReader(fr);
            int c = 0;

            while((line = br.readLine()) != null) {
                if (line.contains("Never gonna give you up"))
                    c++;
                    line = line.replace("Never gonna give you up", "Spotted");
                lines.add(line);
            }
            fr.close();
            br.close();

            FileWriter fw = new FileWriter(f2);
            BufferedWriter bw = new BufferedWriter(fw);
            for(String s : lines) {
                bw.write(s);
            }
            bw.close();
            System.out.println(" Spotted "+c+" times.");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


}
