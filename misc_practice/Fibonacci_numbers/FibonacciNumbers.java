public class FibonacciNumbers {
    
    static int sol2n1 = 0, sol2n2 = 1, sol2n3 = 0;
    static void Fibonacci(int count) {
        if (count > 0) {
            sol2n3 = sol2n1 + sol2n2;
            sol2n1 = sol2n2;
            sol2n2 = sol2n3;
            System.out.print(sol2n3 + " ");
            Fibonacci(count - 1);
        }
    }

    static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    static int fib2(int n) {
        int f[] = new int[n+2];
        int i;

        f[0] = 0;
        f[1] = 1;

        for (i = 2; i <= n; i++) {
            f[i] = f[i-1] + f[i-2];
        }
        return f[n];
    }

    public static void main(String[] args) {
        // https://www.geeksforgeeks.org/program-for-nth-fibonacci-number/

        // sol 1.
        int n1 = 0;
        int n2 = 1;
        int n3;
        int count = 10;
        System.out.print(n1 + " " + n2 + " ");
        
        for (int i = 2; i < count; i++) {
            n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }

        System.out.println();

        // sol 2.
        int count2 = 15;
        System.out.print(sol2n1 + " " + sol2n2 + " ");
        Fibonacci(count2);

        System.out.println();

        // sol 3.
        int count3 = 9;
        System.out.println(fib(count3));

        // sol 4.
        System.out.println(fib2(count3));

        
    }
}
