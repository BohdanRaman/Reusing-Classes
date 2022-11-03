package finalize_my_example;

public class ExampleFinalize {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void dispose() {
        System.out.println("dispose method");

    }

    public void finalize() {
        System.out.println("Method 'finalize' called, when there is no object reference." + "\n" +
                "He can used one times or not used at all.");
    }

}