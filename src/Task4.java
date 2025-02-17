import java.util.ArrayList;
import java.util.List;

public class Task4 {


    static public boolean fibonacci(int n, int goal) {
        List<Integer> fib = new ArrayList<Integer>();
        fib.add(1);
        fib.add(1);
        for (int i = 0; i < n; i++) {
            if (fib.getLast() == goal) {
                return true;
            } else if (fib.getLast() < goal){
                fib.add(fib.get(i) + fib.get(i+1));
                if (fib.getLast() < 0) throw new RuntimeException("Число " + goal + " выше допустимого лимита");
            } else {
                break;
            }
        }
        return false;

    }
}


