import java.util.Scanner;

public class AulaDeHj {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Aluno joao = new Aluno();
		Aluno marcelo = new Aluno();
		Aluno dani = new Aluno("Dani Diabólica","107.781.439-96", "99903-4422");
		System.out.println(dani.cpf);
		System.out.println(dani.nome);
		System.out.println(marcelo.nome);
		System.out.println(dani.telefone);
	}

}
