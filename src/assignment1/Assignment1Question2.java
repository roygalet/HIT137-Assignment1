package assignment1;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roy
 */
public class Assignment1Question2 {

    public static void main(String[] args) {
        String word = "There really should be a few regular rapid rabbits around";
        while (1 == 1) {
            if (word.indexOf('r') > 0) {
                word = word.substring(0, word.indexOf('r')) + "s" + word.substring(word.indexOf('r') + 1);
            } else {
                break;
            }
        }
        System.out.println(word);
    }
}
