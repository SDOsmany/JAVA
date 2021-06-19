import java.io.IOException;
import java.io.File;

public class Main {

    public static void main(String[] args) throws IOException {
        File dir = new File("DIRECTORY PATH");
        listRecursive(dir);


    }

    public static void listRecursive(File dir) {
        if (dir.isDirectory()) {
            File[] f = dir.listFiles();
            for (File i : f) {
                if (i.isFile()) {
                    System.out.println("\tFile:" + i.getAbsoluteFile());
                }else {
                    System.out.println("Directory: "+i.getName());
                    listRecursive(i);
                }
            }
        }
    }
}
