public class Ex03f {
    public static void main(String[] args) {
        // sequência consiste em apresentar os elementos que começam com a letra D
        int[] elementos = {2, 10, 12, 16, 17, 18, 19, 200};

        StringBuilder resultado = new StringBuilder();
        for (int elemento : elementos) {
            resultado.append(elemento).append(" ");
        }

        System.out.println(resultado.toString());
    }
}
