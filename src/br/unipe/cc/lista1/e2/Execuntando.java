package br.unipe.cc.lista1.e2;

public class Execuntando {
	public static void main(String[] args) {
		BuscaBinaria busca = new BuscaBinaria();
		int[] vetor = new int[]{4, 6, 8, 13, 23, 36};
		int elem;
		int n = vetor.length;
		int chave = 6;
		
		elem = busca.buscaBi(n, vetor, chave);
		if(elem != -1){
			System.out.println("Encontrado  "+ elem+ "  "+vetor[elem]);
		}else{
			System.out.println("Não encontrado");
		}
		
	}
	

}
