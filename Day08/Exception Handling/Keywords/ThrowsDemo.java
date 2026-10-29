import java.io.FileReader;
import java.io.IOException;

public class ThrowsDemo {
    static void readFile() throws IOException {
        FileReader file = new FileReader("data.text");
        System.out.println("File Opened");
        file.close();
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("could not find the file");
        }
    }
}

