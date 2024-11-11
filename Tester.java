package TugasInheritance;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Select What You Want :");
        System.out.println("1. Rectangle\n2. Circle\n3. Cube");
        int pilihan = s.nextInt();
        s.nextLine();

        if (pilihan == 1) {
            System.out.println("Rectangle");
            System.out.println("Name :");
            String name = s.nextLine();
            System.out.println("Color :");
            String color = s.nextLine();
            System.out.println("Length :");
            int length = s.nextInt();
            System.out.println("Width :");
            int width = s.nextInt();
            Rectangle z = new Rectangle(name, color, length, width);
            z.print();
            System.out.println("Area : " + length * width);
        } else if (pilihan == 2) {
            double phi = 3.14;
            System.out.println("Circle");
            System.out.println("Name :");
            String name = s.nextLine();
            System.out.println("Color :");
            String color = s.nextLine();
            System.out.println("Radius :");
            int radius = s.nextInt();
            Circle p = new Circle(name, color, radius);
            p.print();
            System.out.println("Area : " + radius * radius * phi);
        } else if (pilihan == 3) {
            System.out.println("Cube");
            System.out.println("Name :");
            String name = s.nextLine();
            System.out.println("Color :");
            String color = s.nextLine();
            System.out.println("Length :");
            int length = s.nextInt();
            System.out.println("Width :");
            int width = s.nextInt();
            System.out.println("Height :");
            int height = s.nextInt();
            Cube k = new Cube(name, color, length, width, height);
            k.print();
            System.out.println("Area : " + length * width * height);
        }s.close();
    }
}
