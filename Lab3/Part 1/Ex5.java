import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex5 {
    public static void main(String[] args) throws IOException {

        try {
            FileReader fr = new FileReader("./Part 1/the art of flying.txt");
            BufferedReader br = new BufferedReader(fr);

            String line = null;
            Integer count = 0;
            while ((line = br.readLine()) != null) {
                count += line.split(" ").length;
            }

            System.out.println(count);

            fr.close();
            br.close();
        } catch (IOException e) {
            System.out.println("File not found.");
        }

    }
}
