import java.util.Scanner;

public class exames {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Olá, Digite a nota do exame I: ");
        double exame1 = scanner.nextDouble();
        System.out.print("Digite a nota do exame II: ");
        double exame2 = scanner.nextDouble();
        System.out.print("Digite a nota do exame III: ");
        double exame3 = scanner.nextDouble();
        System.out.print("Digite a nota do exame IV: ");
        double exame4 = scanner.nextDouble();
        System.out.print("Digite a nota do exame V: ");
        double exame5 = scanner.nextDouble();
        double media = 70;
        String classificacao = "";
        if ((exame1 >= media) && (exame2 >= media) && (exame3 >= media) && (exame4 >= media) && (exame5 >= media)) {
            classificacao = "A - passou em todos os exames";
        } else if ((exame1 >= media) && (exame2 >= media) && (exame4 >= media) &&
                (exame3 < media)) {
            classificacao = "B - passou em I, II e IV, mas não em III ou V";
        } else if ((exame1 >= media) && (exame2 >= media) && (exame3 >= media)
                || (exame4 >= media) && (exame5 < media)) {
            classificacao = "C - passou em I e II, III ou IV, mas não em V";
        } else {
            classificacao = "Reprovado";
        }
        System.out.println("Classificação: " + classificacao);
        scanner.close();
    }
}