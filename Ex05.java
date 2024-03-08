import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite alguma palavra/frase: ");
        String original = scan.nextLine();
        scan.close();
        String invertida = ""; 
        // for para ir indice por indice e inverter a String
        for (int i = original.length() - 1; i >= 0; i--) {
            invertida += original.charAt(i);
        }

        System.out.println("String invertida: " + invertida);
    }
}