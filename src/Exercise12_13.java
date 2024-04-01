
import java.io.File;
import java.util.Scanner;

public class Exercise12_13 {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println("Usage: java Exercise12_13 file");
            System.exit(1);
        }

        String filename = args[0];
        String inputLine = null;
        int chars = 0;
        int words = 0;
        int lines = 0;

        File inputSource = new File(filename);
        if (!inputSource.exists()) {
            System.out.println("Source file " + filename + " does not exist");
            System.exit(2);
        }

        try (Scanner input = new Scanner(inputSource);) {
            while (input.hasNext()) {
                inputLine = input.nextLine();
                lines++;
                chars += inputLine.length();
                words += inputLine.split(" ").length;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("File " + filename.toLowerCase() + " has");
            System.out.println(chars + " characters");
            System.out.println(words + " words");
            System.out.println(lines + " lines");
        }
    }
}
