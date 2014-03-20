package br.unipe.cc.lista1.e2;

public class BuscaBinaria {
	int meio, inicio, fim;
	
	public int buscaBi(int n, int[] vetor, int chave){
		inicio = 0;
		fim = n-1;
		meio = (inicio + fim)/2;
		while(inicio <= fim){
			if(chave < vetor[meio]){
				fim = meio -1;
			}else{
				if(chave > vetor[meio]){
					inicio = meio+1;
				}
			}
				
			if(chave == vetor[meio]){
				return meio;
			}
			meio = (inicio + fim)/2;
			
			
			
		}return -1;
		
	}

}
