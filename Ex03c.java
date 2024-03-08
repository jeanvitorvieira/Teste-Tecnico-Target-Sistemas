public class Ex03c {
    public static void main(String[] args) {
        String[] elementos = new String[8];
        int n = 0;
        for (int i = 0; i < 8; i++) {
            elementos[i] = String.valueOf(n);
            // sequência consiste em apresentar os elementos acrescidos do próximo número ímpar
            n = n + i * 2 + 1;
        }
        String resultado = String.join(" ", elementos);
        System.out.println(resultado);
    }
}