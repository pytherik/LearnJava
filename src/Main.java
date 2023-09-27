import java.io.File;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // file = an abstract representation of file and directory pathnames

        File file = new File("./secret_message.txt");
        
        if (file.exists()) {
            System.out.println("ich existiere!");
        }
    }
}
