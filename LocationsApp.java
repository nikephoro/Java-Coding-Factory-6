package gr.aueb.cf.ch9;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class LocationsApp {

    public static void main(String[] args) throws IOException {

        File fd = new File("C:/tmp/locationsraw.txt");
        PrintStream ps = new PrintStream("C:/tmp/locationsformatted.txt");
        String line;
        String[] tokens;

        try (Scanner in = new Scanner(fd)) {
            while (in.hasNextLine()) {
                line = in.nextLine();
                tokens = line.split(",");

                for (int i = 0 ; i <= tokens.length -3 ; i++) {
                    if (tokens[i].equals("Location")) continue; // Ignores the first line in the original file
                    ps.printf("{ location: '%s' , latitude: %s , longitude: %s }\n", tokens[i], tokens[i+1] , tokens[i+2]);

                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
