package Lista6;
import java.util.Scanner;
public class ex15 {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		int usuario;
		int senha;
		int log_senha= 0;
		int log_usuario=0;
		int opcao;
		System.out.printf("Voce ja possui um cadastro? %n 1-SIM %n 2-NAO %n");
		opcao=tc.nextInt();
		if(opcao == 2) {
		System.out.println("CRIAR CONTA");
		System.out.println("Nome de usuario");
		log_usuario = tc.nextInt();
		System.out.println("Senha");
		log_senha = tc.nextInt();
		}
		else if(log_usuario == log_senha) {
			System.out.println("Digite uma senha diferente do login");
		}
		System.out.println("Fa�a login com usuario e senha");
		System.out.println("USUARIO");
		usuario = tc.nextInt();
		System.out.println("SENHA");
		senha = tc.nextInt();
		if(usuario == log_usuario && senha == log_senha) {
			System.out.println("Seja bem vindo " + usuario);
			}
		else if(usuario == senha) {
			System.out.println("Digite uma senha diferente do login");
		}
		}
		
	}


