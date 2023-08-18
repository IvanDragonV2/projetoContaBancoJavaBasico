import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean result;
        int inputData =0;
        String  nameData = "";
        String agenciaData = "";
        double  moneyData = 0;


        // validação para o número da conta.
        do{
            System.out.println("Digite o número da sua conta : ");
            try{
                inputData = sc.nextInt();
                result = true;
            }
            catch(Exception e ) {
                System.out.println("Digite um número inteiro.");
                sc.next();
                result = false;
            }
        } while(!result);


        // validação do número da agência
        do{
            System.out.println("Digite o número da sua agência : ");
            try{
                agenciaData = sc.next();
                result = true;
            }
            catch(InputMismatchException e ) {
                System.out.println("Digite um número válido.");
                sc.next();
                result = false;
            }
        } while(!result);


        do{
            System.out.println("Digite o seu nome, por favor : ");
            try{
                nameData = sc.nextLine();
                result = true;
            }
            catch(Exception e ) {
                System.out.println("Digite um nome válido.");
                sc.next();
                result = false;
            }
        } while(!result);


        do{
            System.out.println("Digite o número do seu saldo : ");
            try{
                sc.next();
                moneyData = sc.nextDouble();
                result = true;
            }
            catch(Exception e ) {
                System.out.println("Digite um valor válido.");
                sc.next();
                result = false;
            }
        } while(!result);

        System.out.println("Olá " + nameData +" , obrigado por criar uma conta em nosso banco, sua agência é " + agenciaData + " conta " +
                inputData + " e seu saldo de R$ " + moneyData+ " reais " + "já está disponível para saque. ");

    }

}
