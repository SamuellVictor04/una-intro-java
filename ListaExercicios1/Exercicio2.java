import java.util.Scanner;
public class Exercicio2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite outro numero: ");
        int num2 = scanner.nextInt();
        double divisa = num1 / num2;
        System.out.println("A Subtraçõa desses dois números é: " + (num1 - num2));
        System.out.println("A Divisão desses dois números é: " + divisa);
        System.out.println("A multiplicação desses dois números é: " + (num1 * num2));
        scanner.close();



    }
}
