import java.util.Scanner;

public class UserColor {
    public static String getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select your favourite color (B-blue, R-red, G-green, Y-yellow):");
            String giveColor = scanner.nextLine().trim().toUpperCase();
            switch (giveColor) {
                case "B":
                    return "blue";
                case "R":
                    return "red";
                case "G":
                    return "green";
                case "Y":
                    return "yellow    ";
                default:
                    System.out.println("Wrong color. Try again.");
            }
        }
    }
}
