
public class Colecao {

	private String elementos[];
	private int size = 0;
	
	public Colecao(int tam){
		elementos = new String[tam];
	}
	
	public void add(String e){
		this.verificaTamanho();
		elementos[size] = e;
		++size;
	}
	
	public String get(int posicao) throws Exception{
		if(posicao >= size){
			throw new Exception("Posição inválida!");
		}
		return elementos[posicao];
		
	}
	
	private void verificaTamanho(){
		if(size == elementos.length){
			String [] ele2 = new String[elementos.length + 20];
			for(int i = 0; i < elementos.length; i++ ){
				ele2[i] = elementos[i];
			}
			elementos = ele2;
		}
	}
}
