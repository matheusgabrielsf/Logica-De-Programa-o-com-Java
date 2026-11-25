public class While {
    public static void main(String[] args) {
        int contador = 0;

        while (contador <= 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }

        int numero = 1;

        do {
            System.out.println("Número: " + numero);
            numero++;
        } while (numero <= 5);
    }
    
}
