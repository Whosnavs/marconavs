import java.util.Scanner;

public class Main {

    // Function to calculate the area of a circle
    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Function to calculate the area of a rectangle
    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    // Function to calculate the area of a triangle
    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    // Function to calculate the volume of a sphere
    public static double calculateSphereVolume(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    // Function to calculate the volume of a cylinder
    public static double calculateCylinderVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    // Function to calculate the volume of a rectangular prism
    public static double calculatePrismVolume(double length, double width, double height) {
        return length * width * height;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Area calculations
        System.out.println("Choose a shape to calculate area:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        int areaChoice = input.nextInt();

        switch (areaChoice) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                double circleRadius = input.nextDouble();
                double circleArea = calculateCircleArea(circleRadius);
                System.out.printf("The area of the circle is: %.2f%n", circleArea);
                break;
            case 2:
                System.out.print("Enter the length of the rectangle: ");
                double rectangleLength = input.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double rectangleWidth = input.nextDouble();
                double rectangleArea = calculateRectangleArea(rectangleLength, rectangleWidth);
                System.out.printf("The area of the rectangle is: %.2f%n", rectangleArea);
                break;
            case 3:
                System.out.print("Enter the base of the triangle: ");
                double triangleBase = input.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double triangleHeight = input.nextDouble();
                double triangleArea = calculateTriangleArea(triangleBase, triangleHeight);
                System.out.printf("The area of the triangle is: %.2f%n", triangleArea);
                break;
            default:
                System.out.println("Invalid choice for area calculation.");
        }

        // Volume calculations
        System.out.println("Choose a solid to calculate volume:");
        System.out.println("1. Sphere");
        System.out.println("2. Cylinder");
        System.out.println("3. Rectangular Prism");
        int volumeChoice = input.nextInt();

        switch (volumeChoice) {
            case 1:
                System.out.print("Enter the radius of the sphere: ");
                double sphereRadius = input.nextDouble();
                double sphereVolume = calculateSphereVolume(sphereRadius);
                System.out.printf("The volume of the sphere is: %.2f%n", sphereVolume);
                break;
            case 2:
                System.out.print("Enter the radius of the cylinder: ");
                double cylinderRadius = input.nextDouble();
                System.out.print("Enter the height of the cylinder: ");
                double cylinderHeight = input.nextDouble();
                double cylinderVolume = calculateCylinderVolume(cylinderRadius, cylinderHeight);
                System.out.printf("The volume of the cylinder is: %.2f%n", cylinderVolume);
                break;
            case 3:
                System.out.print("Enter the length of the rectangular prism: ");
                double prismLength = input.nextDouble();
                System.out.print("Enter the width of the rectangular prism: ");
                double prismWidth = input.nextDouble();
                System.out.print("Enter the height of the rectangular prism: ");
                double prismHeight = input.nextDouble();
                double prismVolume = calculatePrismVolume(prismLength, prismWidth, prismHeight);
                System.out.printf("The volume of the rectangular prism is: %.2f%n", prismVolume);
                break;
            default:
                System.out.println("Invalid choice for volume calculation.");
        }

        input.close();
    }
}
