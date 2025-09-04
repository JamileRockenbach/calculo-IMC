import java.util.Scanner;

public class AtividadeImc {
    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = lerTeclado.nextLine();
        lerTeclado.nextLine();

        System.out.println("Digite seu gênero (F/M/N): ");
        char genero = lerTeclado.nextLine().charAt(0);
        lerTeclado.nextLine();

        System.out.println("Digite sua altura: ");
        double altura = lerTeclado.nextDouble();
        lerTeclado.nextLine();

        System.out.println("Digite seu peso em quilos: ");
        double peso = lerTeclado.nextDouble();
        lerTeclado.nextLine();
        
        double imc = peso / (altura * altura);
        String classificacao = "";

        //começa o switch
    }
}
