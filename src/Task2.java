public class Task2 {
    static public double func(double x) {
        return Math.pow(x, 3) + x + 1;
    }

    static public double square(double a, double b, double delta, function foo) {
        double square = 0;
        for (; a <= b; a += delta) {
            square += Math.abs((foo.DO(a) + foo.DO(a + delta)) * delta / 2);
        }
        return square;
    }
}
