package minhaprova;
import java.util.*;

public class CriarLivro {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Scanner leiaTxt = new Scanner(System.in); 
		
		
		ListaLivro biblioteca = new ListaLivro(); 
	
		int num = 0; 
		do {
			System.out.println("Qual op��o voc� deja realizar?: 1: Novo Cadastro | 2: Alterar o Cadastro | 3: Excluir Cadastro | 9: Sair do Sistema");
			num = leia .nextInt();
			
			switch(num){
			case 1:
				
				Livro livro = new Livro(); 
				System.out.print("Escreva o T�tulo do Livro?: ");
				livro.setTitulo(leiaTxt.nextLine());
				System.out.print("Qual o autor do Livro?: ");
				livro.setAutor(leiaTxt.nextLine());
				System.out.print("Qual o ISBN do Livro?: ");
				livro.setIsbn(leiaTxt.nextLine());
				System.out.print("Qual � a quantidade de p�ginas do Livro: ");
				livro.setQtdPagina(leiaTxt.nextLine());
				biblioteca.adicionar(livro);
				break; 
			case 2: 
				System.out.println("Adicione o t�tulo do Livro que voc� deseja alterar: ");
                int pos = biblioteca.buscar(leiaTxt.nextLine());
                Livro temp = biblioteca.mostrar(pos);
                System.out.println("Altere o t�tulo do Livro: ");
                temp.setTitulo(leiaTxt.nextLine());
                biblioteca.alterar(pos, temp);
				break; 
			case 3: 
				System.out.print("Escolha a posi��o em que o livro se encontra: ");
				int posExcluir = leia.nextInt(); 
				biblioteca.excluir(posExcluir); 
				break;
			case 9: 
				break;
			default: 
				System.err.print("N�mero inv�lido.");
			} 
		} while( num != 9); 		
	}
}
