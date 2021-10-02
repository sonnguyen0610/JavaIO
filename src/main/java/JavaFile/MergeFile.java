package JavaFile;

import java.io.*;

public class MergeFile {
    public static void main(String[] args) {
        try {
            FileInputStream fis1 = new FileInputStream("Text1.txt");
            FileInputStream fis2 = new FileInputStream("Text2.txt");

            FileOutputStream fos = new FileOutputStream("JavaIO.txt");
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fos));
            //Doc& ghi file 1
            InputStreamReader isr1 = new InputStreamReader(fis1);
            BufferedReader reader1 = new BufferedReader(isr1);
            String line1 = reader1.readLine();
            while (line1 != null) {
                writer.write(line1);
                line1 = reader1.readLine();
            }
            //Doc & ghi file 2
            InputStreamReader isr2 = new InputStreamReader(fis2);
            BufferedReader reader2 = new BufferedReader(isr2);
            String line2 = reader2.readLine();
            while (line2 != null) {
                writer.write(line2);
                line2 = reader2.readLine();
            }

            writer.flush();
            //Dong file
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
    }

}