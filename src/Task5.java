import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task5 {

    static public List<Integer> prime(int a) {
//      Scanner sc = new Scanner(System.in);
//      int a = sc.nextInt();
        List<Integer> pr = new ArrayList<Integer>();
        pr.add(1);
        for (int i = 2; i <= a; i++) {
            while (a % i == 0) {
                a /= i;
                pr.add(i);
            }
        }
        return pr;
    }
}
