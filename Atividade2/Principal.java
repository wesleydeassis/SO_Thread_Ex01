package view;

import controller.ImprimirThreads;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int iT =0 ; iT < 5; iT++){
			
			Thread ImprimirThreads = new ImprimirThreads();
			ImprimirThreads.start();
		}

	}

}
