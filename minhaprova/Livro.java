package minhaprova;

public class Livro {
		private String titulo; 
		private String isbn; 
		private String autor; 
		private String qtdPaginas; 
	
		
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		
		public String getIsbn() {
			return isbn;
		}
		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}
		
		public String getAutor() {
			return autor;
		}
		public void setAutor(String autor) {
			this.autor = autor;
		}
		
		public String getQtdPaginas() {
			return qtdPaginas;
		}
		public void setQtdPagina(String numPaginas) {
			this.qtdPaginas = numPaginas;
		}
}
