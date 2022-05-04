package minhaprova;
import java.util.*;

public class CriarLivro {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Scanner leiaTxt = new Scanner(System.in); 
		
		
		ListaLivro biblioteca = new ListaLivro(); 
	
		int num = 0; 
		do {
			System.out.println("Qual opção você deja realizar?: 1: Novo Cadastro | 2: Alterar o Cadastro | 3: Excluir Cadastro | 9: Sair do Sistema");
			num = leia .nextInt();
			
			switch(num){
			case 1:
				Livro livro = new Livro(); 
				System.out.print("Escreva o Título do Livro?: ");
				livro.setTitulo(leiaTxt.nextLine());
				System.out.print("Qual o autor do Livro?: ");
				livro.setAutor(leiaTxt.nextLine());
				System.out.print("Qual o ISBN do Livro?: ");
				livro.setIsbn(leiaTxt.nextLine());
				System.out.print("Qual é a quantidade de páginas do Livro: ");
				livro.setQtdPagina(leiaTxt.nextLine());
				biblioteca.adicionar(livro);
				break; 
			case 2: 
				System.out.println("Adicione o título do Livro que você deseja alterar: ");
				int pos = biblioteca.buscar(leiaTxt.nextLine());
				Livro temp = biblioteca.mostrar(pos);
				System.out.println("Altere o título do Livro: ");
				temp.setTitulo(leiaTxt.nextLine());
				biblioteca.alterar(pos, temp);
				break; 
			case 3: 
				System.out.print("Escolha a posição em que o livro se encontra: ");
				int posExcluir = leia.nextInt(); 
				biblioteca.excluir(posExcluir); 
				break;
			case 9: 
				System.out.println("Opera��o Finalizada!");
				break;
			default: 
				System.err.print("Número inválido.");
			} 
		} while( num != 9); 		
	}
}
