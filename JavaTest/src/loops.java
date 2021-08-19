import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        int x =0;
        int[] arr = {2,3,4,5,6,7,8};
       String [] names = new String[5];
       Scanner sc = new Scanner(System.in);

       for (int i = 0; i < names.length; i++){
           System.out.println("Input: ");
           String input = sc.nextLine();
           names[i] = input;

        }
       for(String n:names) {
           System.out.println(n);
           if (n.equals("Jason")){
               break;
           }
       }
    }
}


/*public class loops {
    public static void main(String[] args) {
        int x =0;
        int[] arr = {2,3,4,5,6,7,8};
        int count = 0;

        for (int element : arr) {
            System.out.println(element + " " + count);
            count++;
        }
    }
}*/
