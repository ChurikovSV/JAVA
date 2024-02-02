import java.util.Scanner;

public class LS1Task_01 {
    public static void main(String[] args) {
        System.out.println("Hello ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);
        scanner.close();

    }

}