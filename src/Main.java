import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class Main {

    public static void main(String[] args) {
        Main html = new Main();
    }

    public Main() {

        try {
            System.out.println();
            System.out.print("hello \n");
            URL url = new URL("https://en.wikipedia.org/wiki/Main_Page");
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(url.openStream())
            );
            String line;

            while ( (line = reader.readLine()) != null ) {
                if(line.contains("/wiki/")) {
                    System.out.println(line);
                }
            }
            reader.close();
        } catch(Exception ex) {
            System.out.println(ex);
        }

    }

}