import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;

            do { System.out.println("Type a number: ");
               x = sc.nextInt();
        }while (x != 10);
    }
}
