import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite seu numero de usuário.");
        int numusuario = scanner.nextInt();

        System.out.println("Por favor, informe a sua agência.");
        String agencia = scanner.next();

        System.out.println("Por favor, informe somente seu primero nome! .");
        String nome = scanner.next();

        System.out.println("Por favor, informe o seu Sobrenome .");
        String sobrenome = scanner.next();

        System.out.println("Por favor, digite seu saldo.");
        Double saldo = scanner.nextDouble();

        String nomecliente = nome+" "+ sobrenome;

        System.out.println("Olá "+nomecliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numusuario+", e seu saldo "+saldo+" já está disponível para saque.");
       
    }
}
