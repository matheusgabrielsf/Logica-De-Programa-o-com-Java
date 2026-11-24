public class TrabalhandoComStrings {
    public static void main(String[] args) {
    
        String nome = "Matheus Gabriel da Silva Ferreira";
        String nomeDois = "Mateus Gabriel da Silva Ferreira";
        
        int tamanhaNome = nome.length();
        boolean nomesIguais = nome.equals(nomeDois);

        System.out.println("Nome: " + nome);
        System.out.println("Esse nome tem " + tamanhaNome + " caracteres.");
        System.out.println("Os nomes são iguais: " + nomesIguais);
    }
}
