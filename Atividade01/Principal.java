package view;

import java.util.Random;

import controller.ThreadVetor;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Random random = new Random();
		int vetor[] = new int [1000]; 
		
		  for (int i=0; i<vetor.length; i++) {
			  vetor[i] = random.nextInt(100);}
		
		for(int op =1 ; op <= 2; op++){
			
			Thread ThreadVetor = new ThreadVetor(op, vetor);
			ThreadVetor.start();
		}

	}

}
