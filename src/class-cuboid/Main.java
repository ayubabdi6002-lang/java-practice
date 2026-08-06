// we start by creating the Rectangle class
class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // getting and setting the length and width
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // area
    public double getArea() {
        return length * width;
    }
}

// Cuboid class where by we are inheriting Rectangle properties and methods to Cuboid class
class Cuboid extends Rectangle {
    private double height;

    // Constructor for our formula for getting the volume of a cuboid is length * width * height, so we need to get the length and width from the Rectangle class and then multiply it with the height to get the volume of the cuboid
    public Cuboid(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    // Getting and setting the height for the cuboid which is not present in the Rectangle class so need to be defined in the Cuboid class
    public double getHeight() {
        return height;
    }

    // Setter
    public void setHeight(double height) {
        this.height = height;
    }

    // Calculate volume
    public double getVolume() {
        return getArea() * height;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Cuboid box = new Cuboid(5, 4, 3);

        System.out.println("Length: " + box.getLength());
        System.out.println("Width: " + box.getWidth());
        System.out.println("Height: " + box.getHeight());
        System.out.println("Area: " + box.getArea());
        System.out.println("Volume: " + box.getVolume());
    }
}
