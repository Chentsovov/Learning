package SevenModule;

public class Rectangle implements PrintName {
    private String name ;
    public Rectangle(String name) {

        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println("Shape name is " + name);
    }
}