
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception{  
    //TODO: Conhecer e importar a classe Scanner
    Scanner ler = new Scanner(System.in);
    String nome;
    String agencia; 
    int conta;
    double saldo;
    saldo = 3.200;

    //Exibir as mensagens para o nosso usuário
    System.out.println("Oi, Digite seu nome: ");
    nome = ler.nextLine();
    System.out.println("Por favor,digite o número da Agencia!");
    agencia = ler.nextLine();
    System.out.println("Digite o numero de sua conta: ");
    conta = ler.nextInt();
    //Exibir a mensagem conta criada
    System.out.printf("Ola %s, Obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d, e seu saldo %f disponivel para saque.\n", nome, agencia, conta, saldo);
  }
}
