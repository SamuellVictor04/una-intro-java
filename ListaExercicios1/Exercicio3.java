import java.util.Scanner;
public class Exercicio3 {
public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    System.out.print("Digite seu nome: ");
    String nome = scanner.next();
    System.out.print("Digite sua idade: ");
    int idade = scanner.nextInt();
    System.out.print("Digite sua altura: ");
    double altura = scanner.nextDouble();
    System.out.println("Seu nome é: " + nome + ", sua idade é: " + idade + " e sua altura é: " + altura + "m.");


}    
}
