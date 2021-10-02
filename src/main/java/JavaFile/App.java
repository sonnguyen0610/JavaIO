package JavaFile;

import java.io.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //In noi dung vao tap tin JavaIO.txt
        //Start
//        try {//try catch bat loi ngoai ý muốn
////            FileOutputStream fos=new FileOutputStream("JavaIO.txt");//ghi đè lên tập tin cũ
//            FileOutputStream fos=new FileOutputStream("JavaIO.txt",true);//ghi  them
//
//            PrintWriter writer=new PrintWriter(fos);
//            writer.print("1/4");
//            writer.flush();//day tat ca con lai trong stream xuong file
//            writer.close();//dong stream
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
        //End
        //Doc file
        //Start
//        try {
//            FileInputStream fis = new FileInputStream("JavaIO.txt");
//            InputStreamReader isr = new InputStreamReader(fis);
//            BufferedReader reader = new BufferedReader(isr);
//            String line = reader.readLine();
//            while (line != null) {
//                System.out.println(line);
//                line = reader.readLine();
//            }
//            reader.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();//Catch cho readLine
//        }
        //End
        //Doc file
        //Start
        try {
            FileInputStream fis=new FileInputStream("JavaIO.txt");
            Scanner scanner=new Scanner(fis);
            while (scanner.hasNextLine()){
                String line=scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        //End
        //BT: Ghép nội dung 2 tập tin sang tập tin khác
        //Thông tin 3 tập tin thì đc cung cấp bởi user

    }
}
