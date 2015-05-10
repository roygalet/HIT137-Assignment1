/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 *
 * @author Roy
 */
class Phone {

    int number;
    String name;
    double price;
    boolean available = true;

    void Phone() {
    }

    public void setNameAndPrice(int pNumber, String pName, double pPrice) {
        number = pNumber;
        name = pName;
        price = pPrice;
    }

    public void sell() {
        number=0;
        available = false;
    }
}
