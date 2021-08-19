import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//unique numbers//

public class sets {
    public static void main(String[] args) {
        Set<Integer> t = new HashSet<Integer>();
        t.add(4);
        t.add(3);
        t.add(7);

        boolean x = t.contains(3);

        System.out.println(x);
    }
}
