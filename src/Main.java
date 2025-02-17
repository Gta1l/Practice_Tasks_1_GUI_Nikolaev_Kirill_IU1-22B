import java.net.SocketOption;

public class Main {




    public static void main(String[] args) {
    System.out.println("Happy ticket: " + Task1.HappyTicketCount());
    System.out.println("Square: " + Task2.square(0, 10, 0.000001, Task2::func));
    System.out.println("Root: " + Task3.root(-10, 10, Task2::func));
    System.out.println("Number in Fibonacci: " + Task4.fibonacci(50, 144));
    System.out.println("Number in Fibonacci: " + Task4.fibonacci(50, 7));
//    System.out.println(Task4.fibonacci(50, 2100000000));
    System.out.println("Prime multipliers: " + 1000000000 + " : " + Task5.prime(1000000000));
    Task6 triangle = new Task6(3, 4, 5, 10);
    System.out.println("Square of sides: " + triangle.SidesSquare());
    System.out.println("Voulume: " + triangle.V());
    }
}