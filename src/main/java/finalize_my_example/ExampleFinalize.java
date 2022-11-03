package finalize_my_example;

import javax.swing.*;

public class ExampleFinalize extends JFrame {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void finalize() {
        System.out.println("Method 'finalize' called, when there is no object reference." + "\n" +
                "He can used one times or not used at all.");
    }

}