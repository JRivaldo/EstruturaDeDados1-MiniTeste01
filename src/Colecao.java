
public class Colecao {

	private String elementos[];
	private int size;
	private static final int DIMENSAO = 10;
	
	public Colecao(int tam){
		if(tam < 0){
			throw new RuntimeException("Erro de tamanho na coleção!");
		}
		elementos = new String[tam];
		this.size = 0;
	}
	
	public void add(String e){
		this.verificaTamanho();
		elementos[size] = e;
		++size;
	}
	
	public String get(int posicao){
		if((posicao >= size)|| (posicao < 0)){
			throw new RuntimeException("Posição inválida!");
		}
		return elementos[posicao];
		
	}
	
	public int tamanho(){
		return size;
	}
	
	private void verificaTamanho(){
		if(size == elementos.length){
			String [] ele2 = new String[elementos.length + this.DIMENSAO];
			for(int i = 0; i < elementos.length; i++ ){
				ele2[i] = elementos[i];
			}
			elementos = ele2;
		}
	}
	
	public void addInicio(String valor){
		this.verificaTamanho();
		if(size != 0){
			for(int i = size; i > 0; i--){
				this.elementos[i] = this.elementos[i - 1];				
			}
		}		
		this.elementos[0] = valor;
		++size;
	}
	
	public void add(String valor, int pos){
		this.verificaTamanho();
		if((pos > size)||(pos < 0)){
			throw new RuntimeException("Posição inválida da coleção!");
		}
		else if(size != 0){
			for(int i = size; i > pos; i--){
				this.elementos[i] = this.elementos[i - 1];				
			}
		}
		this.elementos[pos] = valor;
		++size;
	}
	
	public void removerInicio(){
		for(int i = 0; i < size - 1; i++){
			this.elementos[i] = this.elementos[i + 1];				
		}
		this.elementos[size - 1] = null;
		--size;
		
	}
	
	public void remover(int pos){
		if((pos > size)||(pos < 0)){
			throw new RuntimeException("Posição inválida da coleção!");
		}
		
		for(int i = pos; i < size; i++){
			this.elementos[i] = this.elementos[i + 1];				
		}
		this.elementos[size - 1] = null;
		--size;
	}
}
