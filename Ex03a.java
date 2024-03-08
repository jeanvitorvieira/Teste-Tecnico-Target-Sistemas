public class Ex03a {
    public static void main(String[] args) {
        String[] elementos = new String[5];
        int n = 1;
        // For para percorrer cada indice
        for (int i = 0; i < 5; i++) {
            // elementos vai pegando cada n
            elementos[i] = String.valueOf(n);
            // sequência consiste em apresentar os elementos de 2 em 2  
            n += 2;
        }
        String resultado = String.join(" ", elementos);
        System.out.println(resultado);
    }
}