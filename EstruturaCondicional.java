public class EstruturaCondicional {
    public static void main(String[] args) {
        int idade = 22;

        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }

        boolean estaChovendo = true;

        if (!estaChovendo) { // Operador de negação (!) inverte o valor booleano 
            System.out.println("Não está chovendo. Aproveite o dia!");
        } else {
            System.out.println("Está chovendo. Leve um guarda-chuva!");
        }
    }
}
