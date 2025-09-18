import java.util.Scanner;

public class App {
    // reading input
    public static void main(String[] args) throws Exception {
        // to get inputs
        Scanner scanner = new Scanner(System.in);

        // for strings
        System.out.print("Entrer your full name ");
        String fullName = scanner.nextLine().trim();
        System.out.println(fullName);

        // numbers
        System.out.print("Give your Age ");
        byte age1 = scanner.nextByte();
        System.out.println("Give the age of your wife");
        byte age2 = scanner.nextByte();
        System.out.println("Your are " + age1 + " And your wife are " + age2);

        // for strings
        System.out.print("Entrer your name ");
        String name = scanner.next();
        System.out.println(name);

    }
}
