import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        File f = new File("D:\\Workspace For Java Core\\JavaIO");
        //liet ke cac file trong thu muc
        listFileInDir(f);
        System.out.println("===================");
        //Liet ke cay thu muc
        listTreeDir(f,0);

    }

    private static void listFileInDir(File dir) {
        File[] listFiles = dir.listFiles();
        for (File file : listFiles) {
            if (file.isFile()) {
                if (file.getName().compareTo("JavaIO") != 0)
                    System.out.println("File: " + file.getName());
            } else {
                listFileInDir(file);
            }
        }

    }

    private static void listTreeDir(File file, int level) {
        if (file.isDirectory()) { // Dừng nếu là tập tin
            System.out.println( getPadding(level)+" - " + file.getName());
            File[] children = file.listFiles();
            for (File child : children) {
                listTreeDir(child, level + 1); // Gọi đệ quy
            }
        } else {
            System.out.println( getPadding(level)+" + " + file.getName());
        }
    }
    private static String getPadding(int level) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= level; i++) {
            sb.append("    "); // Thêm dấu tab.
        }
        return sb.toString();
    }

}
