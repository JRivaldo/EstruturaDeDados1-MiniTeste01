
public class TesteColecao {

	public static void main(String[] args) {
		Colecao c = new Colecao(10);
		c.add("A");
		c.add("B");
		c.add("C");
		c.add("D");
		//verificando o tamanho e os elementos salvos
		System.out.println(c.tamanho());

		for(int i = 0; i < c.tamanho(); i++){
			System.out.print(c.get(i) + ", ");
		}
		
		//adicionando um elemento
		c.add("F");
		
		System.out.println("\n" + c.tamanho());

		for(int i = 0; i < c.tamanho(); i++){
			System.out.print(c.get(i) + ", ");
		}
		
		//adicionando um elemento em qualquer posi��o
		c.add("E", 2);
		
		System.out.println("\n" + c.tamanho());

		for(int i = 0; i < c.tamanho(); i++){
			System.out.print(c.get(i) + ", ");
		}
		
		//removendo no inicio da cole��o
		c.removerInicio();
		
		System.out.println("\n" + c.tamanho());

		for(int i = 0; i < c.tamanho(); i++){
			System.out.print(c.get(i) + ", ");
		}
		
		//removendo em qualquer posi��o da cole��o
		c.remover(2);
		
		System.out.println("\n" + c.tamanho());

		for(int i = 0; i < c.tamanho(); i++){
			System.out.print(c.get(i) + ", ");
		}
	}

}
