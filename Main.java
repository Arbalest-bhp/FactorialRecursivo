import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args)throws IOException {
        CalculoFactorial programa = new CalculoFactorial();
        int n;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        do{
            System.out.print("Introduzca numero n: ");
            n = Integer.parseInt(entrada.readLine());
        }
        while (n < 0);
        System.out.println("\n \t" + n + "!=" + programa.factorial(n));
    }
}
