import java.util.Scanner;

class Main {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in); 
       
       int total = 0;
       
       for (int i = 0; i < 10; i++) {

           System.out.println("Digite um valor: ");
           int n1 = scan.nextInt();
           total += n1;
       }

       System.out.println("A média artimética desses 10 valores foi de: " + (total / 10));
           
}
}
