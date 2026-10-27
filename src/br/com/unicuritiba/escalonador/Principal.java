package br.com.unicuritiba.escalonador;

import java.util.ArrayList;

public class Principal {

	private static ArrayList<Processo> 
			filaProcessos = new ArrayList<Processo>();
	
	private static int tempo = 5;
	private static int PRIORIDADE_ALTA = 1;
	private static int PRIORIDADE_MEDIA = 2;
	private static int PRIORIDADE_BAIXA = 3;
	
	public static void main(String[] args) {

		Processo p1 = new Processo(1, PRIORIDADE_ALTA, 30000);
		Processo p2 = new Processo(2, PRIORIDADE_BAIXA, 50000);
		Processo p3 = new Processo(3, PRIORIDADE_MEDIA, 2000000);
		Processo p4 = new Processo(4, PRIORIDADE_ALTA, 30000000);
		Processo p5 = new Processo(5, PRIORIDADE_ALTA, 300000000);
		Processo p6 = new Processo(6, PRIORIDADE_BAIXA, 300000000);
		Processo p7 = new Processo(7, PRIORIDADE_BAIXA, 900000000);
		
		filaProcessos.add(p1);
		filaProcessos.add(p2);
		filaProcessos.add(p3);
		filaProcessos.add(p4);
		filaProcessos.add(p5);
		filaProcessos.add(p6);
		filaProcessos.add(p7);
		
		while (true) {
			boolean sucesso =  execucao();
			if(!sucesso) {
				break;
			}
		};

	}

	private static boolean execucao() {
		
		Processo processo = escolheProcesso();
		
		if(processo == null) {
			System.out.println("Escalonador "
					+ "terminou os processos");
			return false;
		}
		
		// Simula a execução
		int tempoProcesso = processo.getTempoRestante();
		processo.setTempoRestante(tempoProcesso - tempo);
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {}
		
		if(processo.getTempoRestante() <= 0) {
			filaProcessos.remove(processo);
			
			System.out.println("Processo " 
					+ processo.getId() + " terminou");
		}
		
		return true;
	}
	
	private static Processo escolheProcesso() {
		
		// Você precisa implementar a lógica Aqui
	}	
}
