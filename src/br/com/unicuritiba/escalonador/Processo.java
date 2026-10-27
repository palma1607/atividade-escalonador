package br.com.unicuritiba.escalonador;

public class Processo {
	
	private int id;
	private int prioridade;
	private int tempoRestante;

	public Processo(int id, int prioridade, int tempoRestante) {
		super();
		this.id = id;
		this.prioridade = prioridade;
		this.tempoRestante = tempoRestante;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}
	public int getTempoRestante() {
		return tempoRestante;
	}
	public void setTempoRestante(int tempoRestante) {
		this.tempoRestante = tempoRestante;
	}

	
	
}
