import java.util.Arrays;

public class Suma {
    public static void main(String[] args) {
        int resultado = suma(4, 5, 6);
        System.out.println("La suma es de: " + resultado);
    }
    public static int suma(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    }
}
