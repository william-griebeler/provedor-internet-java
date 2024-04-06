import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
   
    Scanner scanner = new Scanner(System.in);

    String provedor = "top gun";
    String atendente = "maverick";
    String nome;


    System.out.printf("Olá, bem-vindo a central de atendimento %s ", provedor);

    System.out.printf("\nMeu nome é %s, sou seu assistente virtual", atendente);

    System.out.println("\nDurante o atendimento siga minhas instruções");

    System.out.println("\nPrimeiramente informe seu nome");
    nome = scanner.nextLine();

    System.out.printf("Obrigado %s, como posso lhe ajudar?", nome);

    scanner.close();

    }
}
