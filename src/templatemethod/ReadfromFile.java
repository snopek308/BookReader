package templatemethod;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadfromFile extends BookReader {
    
    File file;
    BufferedReader in = null;
    

    @Override
    void initialize() {
        // Modify this method to open the file prideprejudice.txt (included with project)
        System.out.println("Open an input file");
        file = new File("prideprejudice.txt");
    }

    
    @Override
    void startReading() {
        // Modify this method to read lines from the file and print each line to standard output
        System.out.println("Loop writing out each record");
        String line;
        try {
            while((line = in.readLine())!=null)
            {
                System.out.println(line);
            }
        } catch (IOException ex) {
            Logger.getLogger(ReadfromFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    void stopReading() {
        // Modify this method to close the file
        System.out.println("Close input file");
        
        try {
            in.close();
        } catch (IOException ex) {
            Logger.getLogger(ReadfromFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
