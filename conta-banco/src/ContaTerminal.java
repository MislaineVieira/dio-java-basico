import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        
      //TODO: Conhecer e importar a classe Scanner

      //Exibir as mensagens para o nosso usuario

      //Obter pela classe scanner os valores digitados no terminal

      //Exibir a mensagem final da conta criada


      Scanner scanner = new Scanner(System.in);
    
      System.out.println("Por favor, digite o seu nome completo:");
      String nomeCliente = scanner.nextLine();

      System.out.println("Por favor digite o número da agência:");
      String agencia = scanner.next();

      System.out.println("Digite o número da conta:");
      int conta = scanner.nextInt();

      System.out.println("Por favor digite o saldo da conta:");
      float saldo = scanner.nextFloat();
      
      System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque.", nomeCliente, agencia, conta, saldo);
      scanner.close();

    }
}