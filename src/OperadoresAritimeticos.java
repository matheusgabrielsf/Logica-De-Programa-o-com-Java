public class OperadoresAritimeticos {
    
    public static void main (String[] args ) {
        double pao = 10.00;
        double queijo = 7.00;
        double chocolate = 1.00;
        double desconto = 5.00;
        
        double valorTotal = pao + queijo + chocolate;
        double valorComDesconto = valorTotal - desconto;

        System.out.println("Valor Total = R$" + valorTotal);
        System.out.println("Valor com Desconto = R$" + valorComDesconto);
    }
}
