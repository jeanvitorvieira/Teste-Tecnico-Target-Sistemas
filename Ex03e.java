public class Ex03e {
    public static void main(String[] args) {
        String[] elementos = new String[7];
        int n = 0, aux = 1; 
        for (int i = 0; i < 7; i++) {
            // sequência consiste em apresentar os elementos da sequência de Fibonacci
            int temp = n; 
            n = n + aux; 
            aux = temp;
            elementos[i] = String.valueOf(n);
        }
        String resultado = String.join(" ", elementos);
        System.out.println(resultado);
    }
}