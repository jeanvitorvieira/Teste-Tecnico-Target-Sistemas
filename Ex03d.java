public class Ex03d {
    public static void main(String[] args) {
        String[] elementos = new String[5];
        int n = 2;
        for (int i = 0; i < 5; i++) {
            // sequência consiste em apresentar os elementos em forma de potências de expoente 2, com as bases sendo números pares
            int nq = n*n;
            n += 2;
            elementos[i] = String.valueOf(nq);
        }
        String resultado = String.join(" ", elementos);
        System.out.println(resultado);
    }
}