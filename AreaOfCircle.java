import java.util.Scanner;
public class AreaOfCircle{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);      
        System.out.print("Enter the radius of the circle- ");  
        int radius = sc.nextInt();
        double area = 3.14 * radius * radius;
        double perimeter = 3.14 * radius;
        System.out.println("Area of the circle is - " + area);
        System.out.println("    ");
        System.out.println("Perimeter of the circle- " + perimeter);
    }
}