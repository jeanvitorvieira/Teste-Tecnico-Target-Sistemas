public class Ex03b {
    public static void main(String[] args) {
        String[] elementos = new String[7];
        int n;
        for (int i = 0; i < 7; i++) {
            // sequência consiste em apresentar os elementos como uma potência de base 2 e expoente que vai se somando de 1 em 1
            n = (int) Math.pow(2, i+1);
            elementos[i] = String.valueOf(n);
        }
        String resultado = String.join(" ", elementos);
        System.out.println(resultado);
    }
}