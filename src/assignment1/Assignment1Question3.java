/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 *
 * @author Roy
 */
import java.util.Scanner;

public class Assignment1Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Phone[] p = new Phone[4];

        for (int i = 0; i < p.length; i++) {
            p[i] = new Phone();
        }

        p[0].setNameAndPrice(1, "HTC One              = $", 650.00);
        p[1].setNameAndPrice(2, "Blackberry Z10       = $", 670.00);
        p[2].setNameAndPrice(3, "Nokia Lumia 820      = $", 400.00);
        p[3].setNameAndPrice(4, "Apple iPhone 4S 16GB = $", 475.00);

        int counter, choice;
        String confirm;
        Scanner myScan = new Scanner(System.in);
        
        while (1 == 1) {
            System.out.println("\n\n\n\n\n\n\nAvailable Phones for Sale:");
            counter = 0;
            for (int i = 0; i < p.length; i++) {
                if (p[i].available == true) {
                    counter++;
                    p[i].number = counter;
                    System.out.println(p[i].number + ". " + p[i].name + p[i].price + "0");
                }
            }
            if (counter == 0) {
                System.out.println("All phones are SOLD OUT!!!\nHAVE A NICE DAY!!!");
                break;
            }
            System.out.print("\nPlease enter the NUMBER of your choice (1-" + counter + " only) : ");
            choice = myScan.nextInt();
            if (choice > counter || choice < 1) {
                System.out.println("Invalid selection.\n\n");
                continue;
            } else {
                for (int i = 0; i < p.length; i++) {
                    if (p[i].number == choice) {
                        System.out.print("\n\n\n\n\n\n\n\n\n\nYou selected " + p[i].name + p[i].price);
                        System.out.print("\n\nDo you want to continue (Y/N)?");
                        confirm = myScan.next();
                        if (confirm.toUpperCase().trim().compareTo("Y") == 0) {
                            p[i].sell();
                        }
                        break;
                    }
                }
            }
        }
    }
}
