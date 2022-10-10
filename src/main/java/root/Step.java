package root;

public class Step extends Root{

    public static void main(String[] args) {
        Component1 component1 = new Component1("com #1");
        Component2 component2 = new Component2(22);
        Component3 component3 = new Component3(33f);
        
        System.out.println(component3);
        System.out.println(component2);
        System.out.println(component1);
    }
}
