
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
/**
 *
 * @author Harry
 *
 */
public class Lab3 {
    /**
     * Retrieve contents from a URL and return them as a string.
     *
     * @param url url to retrieve contents from
     * @return the contents from the url as a string, or an empty string on error
     * @final rje
     * @String mfl
     */
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }
/**
 *
 * @param args kj
 */
    public static void main(final String[] args) {
        String text = urlToString("http://erdani.com/tdpl/hamlet.txt");
        int words = 0;
        String search = "prince";
        int searchNumber = 0;
        for (String text1: text.split("\\s+")) {
            System.out.println(text1);
            words = words + 1;
            System.out.println(words);
            if (text1.startsWith(search) || text1.startsWith("Prince")) {
                searchNumber = searchNumber + 1;
                System.out.println(searchNumber);
            }
         }
        System.out.println(searchNumber);
        //System.out.println(text);
        /*int totalChar = text.length();
        int count = 0;
        int words = 1;
        char prev = 'v';
        char current;
        boolean skip = false;
        char space = ' ';
        while (count < totalChar) {
            current = text.charAt(count);
            if (current == space && prev == space) {
                skip = true;
                System.out.println(skip);
            }
            if (current == space && !skip) {
                words = words + 1;
                System.out.println(skip);
                System.out.println("word count:" + words);
            }
            if (current != space) {
                skip = false;
            }
            count = count + 1;
            System.out.println(text.charAt(count - 1));
            prev = current;
        }
        System.out.print("word count:" + words);
        */
        String test = "";
        System.out.println(test.length());
    }

}
