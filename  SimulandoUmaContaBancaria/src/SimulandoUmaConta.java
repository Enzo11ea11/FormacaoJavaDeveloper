import java.util.Scanner;

/*Neste código, estamos simulando o funcionamento de uma conta, tendo o login de acesso e sua senha.
A intenção é estudarmos o funcionamento da Classe Scanner e saber armazenar e imprimir suas informações na prática */

public class SimulandoUmaConta {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o login de sua conta");
        String loginUsuario = scan.next();
        System.out.println("Digite a senha de sua conta");
        String senhaUsuario = scan.next();
        System.out.println("Login: " + loginUsuario);
        System.out.println("Senha: " + senhaUsuario);
    }
}
