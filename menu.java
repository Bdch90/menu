import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.println("Menu");
        System.out.println("1: Triangle");
        System.out.println("2: Square");
        System.out.println("3: Rectangle");
        System.out.println("0: Exit");
        System.out.println("Enter a choice :");
        choice = scanner.nextInt();

        while (choice != 0)
        {
            switch (choice)
            {
                case 1 :
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("*****");
                    System.out.println("*****");
                    System.out.println("*****");
                    System.out.println("*****");
                    System.out.println("*****");
                    break;
                case 3:
                    System.out.println("*****");
                    System.out.println("*****");
                    System.out.println("*****");
                    break;
                case 0:
                    System.exit(0);
                    default:
                        System.out.println("No choice");
            }
            System.out.println("Draw again ?");
            choice = scanner.nextInt();
        }
    }
}
