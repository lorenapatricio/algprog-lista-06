import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

     double[] vetor = new double[10];
     String ordem = "";
     
     Scanner scanner = new Scanner(System.in);
     
     System.out.println("Digite 10 números reais:");
     
     for(int x = 0; x < vetor.length; x++) {
         vetor[x] = scanner.nextDouble();
         ordem = vetor[x] + " " + ordem;
     }
     
     System.out.println("A ordem inversa é: " + ordem);
        
     scanner.close(); 
   
    }
}
