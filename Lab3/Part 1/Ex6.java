import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ex6 {
    public static void main(String args[]) throws IOException {
        writefile(4, "./ex6.txt");
    }

    public static void writefile(int n, String filename) throws IOException {
        FileWriter writehandle = new FileWriter(filename);
        BufferedWriter bw = new BufferedWriter(writehandle);

        for (int i = 1; i <= n; i++) {
            bw.write(i + ": " + String.format("%1." + i + "f", Math.sqrt(i)));
            bw.newLine();
        }

        bw.close();
        writehandle.close();
    }
}
