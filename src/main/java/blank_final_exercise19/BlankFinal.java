/**
 * Exercise 19: Create a class with a blank final reference to an object. Perform the
 * initialization of the blank final inside all constructors. Demonstrate the guarantee that the
 * final must be initialized before use, and that it cannot be changed once initialized.
 */

package blank_final_exercise19;

public class BlankFinal {
    final CupOfCoffee cup;

    public BlankFinal() {
        cup = new CupOfCoffee("Is this correct form ?");
    }

     class CupOfCoffee {
        String s;

        public CupOfCoffee(String s) {
            this.s = s;
        }
    }

    public static void main(String[] args) {
        System.out.println(new BlankFinal().cup.s);
    }
}
