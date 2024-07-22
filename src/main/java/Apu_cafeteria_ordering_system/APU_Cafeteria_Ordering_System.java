/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Apu_cafeteria_ordering_system;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class APU_Cafeteria_Ordering_System {
    
    public static void main(String[] args) {
        Login L = new Login();
        L.setVisible(true);
    }
    
    int ln;
    int getData(){
        try {
            BufferedReader br = new BufferedReader(new FileReader("User.txt"));
            for(int i=0;br.readLine()!=null;i++){
                ln++;
            }
            br.close();
        }
        catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Countline filenotfound");
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Countline ioexp");
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return ln;
    }
}
