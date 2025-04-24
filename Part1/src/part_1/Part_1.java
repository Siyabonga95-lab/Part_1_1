/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package part_1;

/**
 *Student Name:Siyabonga Msimango
 *Student Number:ST10488360
 *Assignment  Part 1
 */
public class Part_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Registration registration = new Registration();
         Login login = new Login(registration);
        login.setVisible(true);
                
    }
    
}
