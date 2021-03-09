package controller;

public class ThreadVetor extends Thread{
	private int n;
	private int vetor[];
	
	
	
	public ThreadVetor(int n, int vetor[]) {
		
		this.n = n;
		this.vetor= vetor;
		
		
	}
	
	
	
	
	
	@Override
	public void run() {
		
		percVetor();
		
	}





	private void percVetor() {
	
		
		switch (n) {
		case 1:
			double tempoI = System.nanoTime();
			
			for(int i : vetor){
				
			}
			double tempoF = System.nanoTime();
			double tempoT = tempoF - tempoI;
			tempoT = tempoT / Math.pow(10, 9);
			System.out.println("Tempo total para percorrer o vetor com for each em segundo ==> " + tempoT +".s");
			
			
			break;

		case 2:
			double tempoInicial = System.nanoTime();
		
		  for (int l =0  ; l < vetor.length; l++);{
			  
			  
			  
		  }
			
		  	double tempoFinal = System.nanoTime();
			double tempoTotal = tempoFinal - tempoInicial;
			tempoTotal = tempoTotal / Math.pow(10, 9);
			System.out.println("Tempo total para percorrer o vetor com for em segundo ==> " + tempoTotal +".s");
			
			break;
		}
			
		}
			
		
	}


