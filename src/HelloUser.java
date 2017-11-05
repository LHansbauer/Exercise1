import java.util.Scanner;

public class HelloUser {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello ASE2017 - how are you? :)");
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello "+ name);

    }
}
