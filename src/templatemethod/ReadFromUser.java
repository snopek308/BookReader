package templatemethod;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asnopek
 */
public class ReadFromUser extends BookReader{
    String linesFromText;
    
    @Override
    void initialize() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("User, enter lines from the text: ");
        linesFromText = keyboard.nextLine();
    }

    @Override
    void startReading() {
        System.out.println(linesFromText);
      
    }

    @Override
    void stopReading() {
        
    }
    
    
    
}
