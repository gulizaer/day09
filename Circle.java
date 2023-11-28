import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner circle = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double num = circle.nextDouble();

        circle.close();

        double area = num*num*3.14;
        double perimeter = 2 * num * 3.14;

        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);







        /*
         Create a class named Circle:
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius
         */
    }
}
