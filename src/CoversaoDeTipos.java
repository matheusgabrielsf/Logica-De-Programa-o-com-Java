public class CoversaoDeTipos {
    public static void main(String[] args) {
       int numero = 10;
       double numeroDouble = numero; // Conversão implícita de int para double  
       System.out.println(numeroDouble);

         double numero2 = 9.78;
         int numeroInt = (int) numero2; // Conversão explícita de double para int
         System.out.println(numeroInt);

         Integer numeroInteger = 10;
         String numerString = Integer.toString(numeroInteger); // Conversão de Integer para String
         System.out.println(numerString);

         String numeroString2 = "20";
         int numeroInt2 = Integer.parseInt(numeroString2); // Conversão de String para int
         System.out.println(numeroInt2);

         
    }
}
