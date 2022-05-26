package SevenModule;

public class Shape implements PrintName {
    private int xStart;
    private int yStart;
    private int xEnd;
    private int yEnd;

    public Shape(int xStart, int yStart, int xEnd, int yEnd) {
        this.xStart = xStart;
        this.xEnd = xEnd;
        this.yStart = yStart;
        this.yEnd = yEnd;
    }

    public int getxStart() {
        return xStart;
    }

    public void setxStart(int xStart) {
        this.xStart = xStart;
    }

    public int getyStart() {
        return yStart;
    }

    public void setyStart(int yStart) {
        this.yStart = yStart;
    }

    public int getxEnd() {
        return xEnd;
    }

    public void setxEnd(int xEnd) {
        this.xEnd = xEnd;
    }

    public int getyEnd() {
        return yEnd;
    }

    public void setyEnd(int yEnd) {
        this.yEnd = yEnd;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "xStart=" + xStart +
                ", yStart=" + yStart +
                ", xEnd=" + xEnd +
                ", yEnd=" + yEnd +
                '}';
    }


    @Override
    public void printName() {
        System.out.println("Shape name is " + toString());
    }
}
