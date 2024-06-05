import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        final Scanner terminal =  new Scanner(System.in);
        
        System.out.println("Digite o primeiro parâmetro");
        final int parametroUm = terminal.nextInt();
        
        System.out.println("Digite o segundo parâmetro");
        final int parametroDois = terminal.nextInt();

        try {

            contar(parametroUm, parametroDois);
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            terminal.close();
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException();
        }

        final int contagem = parametroDois - parametroUm;
        for (int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo o número " + (i+1));
        }
    }
}
