import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scan.nextInt();
        scan.close();
        int aux = 0;
        int fib = 1;
        boolean pertence = false;
        // While para rodar o programa enquanto não chega no número digitado
        while (fib <= num) {
            // int temp vai guardando o número atual
            int temp = fib;
            // fib soma o número anterior + atual
            fib = aux + fib;
            // aux registra o número que virá a ser o anterior
            aux = temp;
            // If para verificar se o número atual e o escolhido são iguais
            if (fib == num) {
                pertence = true;
                break;
            }
        }
        if (pertence) {
            System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + num + " não pertence à sequência de Fibonacci.");
        }
    }
}