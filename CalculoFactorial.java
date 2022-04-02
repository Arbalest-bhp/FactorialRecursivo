
//Numero Factorial Recursivo

public class CalculoFactorial{
    static long factorial (int n){
        long resultado;

        if (n <= 1) {
            System.out.println("Factorial de " + n + " = 1");
            return 1;
        }
        else {
            //resultado = n * factorial(n - 1);;
            resultado = factorial(n - 1);

            resultado = n * resultado;
            System.out.println("Factorial de " + n + " = " + resultado);
        }
            return resultado;

    }
}