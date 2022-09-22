import java.util.Scanner;

public class Exercice12 {

    public static void main(String[] args) {
        int x, y;

        Scanner input= new Scanner(System.in);
        System.out.println("Write a number:");
        x = input.nextInt();
        System.out.println("Write a other number:");
        y = input.nextInt();

        if (x >= y) {
            System.out.println("The biggest number is: " + x);
        } else {
            System.out.println("The biggest number is: " + y);
        }

    }
}
