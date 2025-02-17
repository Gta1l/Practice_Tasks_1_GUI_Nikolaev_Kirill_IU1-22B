public class Task6 {
    double A;
    double B;
    double C;
    double H;
    Task6(double a, double b, double c, double h) {
        this.A = a;
        this.B = b;
        this.C = c;
        this.H = h;
    }

    public double SidesSquare() {
        return (A+B+C) * H;
    }

    public double V() {
        double p = (A + B + C) / 2;
        return H * Math.sqrt(p*(p-A)*(p-B)*(p-C));
    }


}
