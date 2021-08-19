import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class nested {
    public static void main(String[] args) {
        System.out.print("Input your age: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int age = Integer.parseInt(s);

        if (age >= 18) {
            System.out.println("You can drive");
            System.out.print("Input your fav food: ");
            String food = sc.nextLine();

            if (food.equals("pizza")){
                System.out.println("Mine too");
            }
        }
        else {
            System.out.println("You can't drive");

        }
    }
}
