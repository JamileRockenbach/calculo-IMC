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

        switch (genero) {
            case 'M':
            case 'm':
                if (imc >= 40) {
                    classificacao = "Obesidade Mórbida";
                } else if (imc >= 30) {
                    classificacao = "Obesidade Moderada";
                } else if (imc >= 25) {
                    classificacao = "Obesidade Leve";
                } else if (imc >= 20) {
                    classificacao = "Normal";
                } else {
                    classificacao = "Abaixo do normal";
                }
                break;
            case 'F':
            case 'f':
            case 'N':
            case 'n':
                if (imc >= 39) {
                    classificacao = "Obesidade Mórbida";
                } else if (imc >= 29) {
                    classificacao = "Obesidade Moderada";
                } else if (imc >= 24) {
                    classificacao = "Obesidade Leve";
                } else if (imc >= 19) {
                    classificacao = "Normal";
                } else {
                    classificacao = "Abaixo do normal";
                }
                break;
            default:
             classificacao = "Gênero inválido.";
                break;
        }

        System.out.println("Calcúlo de IMC");
        System.out.println("Nome:" + nome);
        System.out.println("Gênero:" + genero);
        System.out.println("IMC:" + imc);
        System.out.println("Classificação:" + classificacao);

        lerTeclado.close();
    }
}
