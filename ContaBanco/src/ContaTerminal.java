import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //UTILIZAR SCANNER
        Scanner sc = new Scanner(System.in);

        int numeroConta;
        String agencia;
        String nomeCLiente;
        float saldo;
       
        //EXIBIR MSG
        //OBTER VALORES DIGITADOS
        System.out.println("Por favor, digite com o número da conta: ");
        numeroConta = sc.nextInt();
        sc.nextLine();

        System.out.println("Por favor, digite a agencia: ");
        agencia = sc.nextLine();

        System.out.println("Por favor, digite o seu nome: ");
        nomeCLiente = sc.nextLine();

        System.out.println("Por favor, digite o seu saldo: ");
        saldo = sc.nextFloat();
        
        //EXIBIR MSG CONTA CRIADA

        System.out.println("Olá " + nomeCLiente + ", obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já esta disponível para saque.");
    }
}
