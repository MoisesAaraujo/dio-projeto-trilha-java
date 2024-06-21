import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o seu nome");
            String nome  = scanner.next();

        System.out.println("Por favor,digite o numero da sua conta");
            int usuario = scanner.nextInt();
           
        System.out.println("Por favor,digite o numero da sua agência");
            String agencia = scanner.next();

        System.out.println("Por favor,digite o saldo da conta");
            Double saldo = scanner.nextDouble();  
            
            
        System.out.println("Olá "+ nome + ",obrigado por criar uma conta em nosso banco,sua agência é  " +  agencia + " conta " +  usuario +", e seu saldo  "  +  saldo  +    "  já disponível para saque.");

    }
}
