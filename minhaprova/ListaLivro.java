package minhaprova;


public class ListaLivro {
	private Livro[] vetor = new Livro[100];
	private int posicaoLivro = 0;

	
	public void adicionar(Livro livro) {
		vetor[posicaoLivro ] = livro;
		posicaoLivro++;
	}
	
	
	public Livro mostrar(int posicao) {
		return vetor[posicao];
	}
	
	public void excluir(int posicao) {
		
		for (int i = posicao; i < posicaoLivro-1; i++) {
			vetor[i] = vetor[i+1];
		}
		vetor[vetor.length-1] = null;
		
		posicaoLivro--;
	}
	
	public int buscar(String nome) {
		for (int i = 0; i < posicaoLivro; i++) {
			if (vetor[i].getTitulo().equals(nome)) {
				return i;
			}
		}
		return -1;
	}
	
	public int tamanho() {
		return posicaoLivro;
	}


	public void alterar(int posicao, Livro string) {
		// TODO Auto-generated method stub
		
	}
	
}
