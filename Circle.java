package SevenModule;

public class Circle implements PrintName {
    private String name ;
    public Circle(String name) {

    this.name = name;
    }

    @Override
    public void printName() {
        System.out.println("Shape nsme is " + name);
    }
}