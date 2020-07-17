import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.io.File;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;

public class ReadFile {

    public static void main(String[] args) {


        String file = args[0];
        File f = new File(file);
        String searchFor = args[1];
        System.out.printf("Number of times %s has been mentioned in file %s: \n", args[1], args[0]);
        File fout = new File("writeout.txt");
        Scanner scan = null;
        PrintWriter pw = null;

        try {
            scan = new Scanner(f);
            pw = new PrintWriter(fout);

            int lineCount = 0;
            pw.printf("Scanned results for %s:\n", searchFor);

            while(scan.hasNextLine()) {
                String current = scan.nextLine();
                if(current.toLowerCase().contains(searchFor.toLowerCase())) {
                    pw.printf("Line %d: %s\n", lineCount, current);
                    System.out.printf("Line %d\n", lineCount);
                }
                lineCount++;
            }

        } catch(FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {

            if (scan != null) {
                scan.close();
            }
            if(pw != null) {
                pw.close();
            }
        }

    }


}