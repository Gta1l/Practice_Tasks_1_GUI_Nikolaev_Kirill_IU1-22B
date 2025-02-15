public class Task3 {
    static int counter = 0;
    static double root(double a, double b, function foo) {
        double c = (a + b) / 2;
        if (counter < 100) {
            counter++;
            if (foo.DO(c) * foo.DO(b) < 0) {

                return root(c, b, foo);
            } else {
                return root(a, c, foo);
            }
        } else {
            return c;
        }

    }
}
