import java.io.File;

public class Ex3 {
    public static void main(String[] args) {
        {
            String dir_name = "/Users/asobirov/Desktop";
            File dir = new File(dir_name);
            File[] dir_list = dir.listFiles();
            for (File file : dir_list) {
                String file_name = file.getName();
                if (file.isDirectory() || !file_name.endsWith(".txt")) {
                    System.out.println((file.isDirectory() ? "DIR -> " : "FILE -> ") + file_name);
                }
            }
        }
    }
}
