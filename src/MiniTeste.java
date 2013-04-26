
public class MiniTeste {
	
	public static void main(String args[]) throws Exception{
		Colecao c = new Colecao(10);
		for (int i = 0; i < 30; i++){
			c.add("N" + i);
		}
		
		for(int i = 0; i < 31;i++){
			System.out.print(c.get(i) + ", ");
		}
	}

}
