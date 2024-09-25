import java.util.*;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {

            System.out.println("Por favor, digite o número da agência: ");
            String agencia = scanner.next();

            System.out.println("Por favor, digite o número da conta: ");
            int conta = scanner.nextInt();

            System.out.println("Por favor, digite o nome do cliente: ");
            String cliente = scanner.next();

            System.out.println("Por favor, digite o sobremone do cliente: ");
            String sobremone = scanner.next();

            System.out.println("Por favor, digite o saldo em conta: ");
            double saldo = scanner.nextDouble();

            System.out.println("Olá " + cliente + " " + sobremone + ", obrigado por criar uma conta em nosso banco. Sua agência é " 
            + agencia + ", conta número " + conta + " e seu saldo de " + saldo + " está disponível para saque.");  
        
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. O programa será encerrado.");
            System.exit(1); // Encerra o programa em caso de erro de entrada
        } catch (NumberFormatException e) {
            System.out.println("Erro: Formato de número inválido. O programa será encerrado.");
            System.exit(1); // Encerra o programa em caso de formato de número incorreto
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage() + ". O programa será encerrado.");
            System.exit(1); // Encerra o programa em qualquer outro erro inesperado
        } finally {
            scanner.close();
        }
    }
}