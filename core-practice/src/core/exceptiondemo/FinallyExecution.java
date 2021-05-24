package core.exceptiondemo;

public class FinallyExecution {
    public static void main(String[] args) {
        try {
            FinallyExecution.divide(100, 0);
        } catch (Exception e) {
            System.out.println("catch of main");
        } finally {
            System.out.println("finally in main");
        }
    }

    public static void divide(int n, int div) {
        try {
            int ans = n / div;
        } catch (Exception e) {
            System.out.println("catch of divide");
            throw e;
        } finally {
            System.out.println("finally of divide");
        }
    }
}
