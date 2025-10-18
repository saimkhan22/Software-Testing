import java.util.Scanner;

public class TriangleClassifier {

    public static boolean isValidTriangle(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public static String classifyBySides(double a, double b, double c) {
        if (a == b && b == c) {
            return "Equilateral";
        } else if (a == b || b == c || a == c) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }

    public static String classifyByAngles(double a, double b, double c) {
        double[] sides = {a, b, c};
        java.util.Arrays.sort(sides);

        double side1 = sides[0];
        double side2 = sides[1];
        double hypotenuse = sides[2];

        double sumOfSquares = side1 * side1 + side2 * side2;
        double hypotenuseSquare = hypotenuse * hypotenuse;

        if (sumOfSquares == hypotenuseSquare) {
            return "Right-angled";
        } else if (sumOfSquares > hypotenuseSquare) {
            return "Acute-angled";
        } else {
            return "Obtuse-angled";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three sides of the triangle:");

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (isValidTriangle(a, b, c)) {
            String sideType = classifyBySides(a, b, c);
            String angleType = classifyByAngles(a, b, c);

            System.out.println("Triangle is valid.");
            System.out.println("Type by sides: " + sideType);
            System.out.println("Type by angles: " + angleType);
        } else {
            System.out.println("The given sides do not form a valid triangle.");
        }

        scanner.close();
    }
}
