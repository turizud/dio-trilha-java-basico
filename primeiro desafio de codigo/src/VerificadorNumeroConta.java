import java.util.Scanner;

public class SimulacaoBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo= 0;
        boolean continuar = true;

        while (continuar) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                double deposito = scanner.nextDouble();
                saldo+=deposito;
                System.out.println("seu saldo é de "+ saldo);
              
                    break;
                case 2:
                    
                    double valorsaque = scanner.nextInt();

                    if (valorsaque<=saldo) {
                       
                        saldo-=valorsaque;
                        System.out.println("Seu saldo é de "+saldo);
                    }
                    else{
                        System.out.println("Saldo insulficiente");
                    }
                    break;
                case 3:
                    System.out.println("O seu saldo atual é "+saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}

 

            
        
        
    

       
        

        

        
	


