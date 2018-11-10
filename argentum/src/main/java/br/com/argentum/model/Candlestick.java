package br.com.argentum.model;

import java.time.LocalDateTime;

public final class Candlestick {
	
	private double abertura; 
	
	private double fechamento;
	
	private double minimo;
	
	public Candlestick(double abertura, double fechamento, double minimo, double maximo, double volume,
			LocalDateTime data) {
		this.abertura = abertura;
		this.fechamento = fechamento;
		this.minimo = minimo;
		this.maximo = maximo;
		this.volume = volume;
		this.data = data;
	}

	private double maximo;
	
	private double volume;
	
	private LocalDateTime data;

	public double getAbertura() {
		return abertura;
	}

	public double getFechamento() {
		return fechamento;
	}

	public double getMinimo() {
		return minimo;
	}

	public double getMaximo() {
		return maximo;
	}

	public double getVolume() {
		return volume;
	}

	public LocalDateTime getData() {
		return data;
	}
	
	public boolean isAlta(){
		return this.getFechamento() > this.getAbertura();
	}
	
	public boolean isBaixa(){
		return this.getFechamento() < this.getAbertura();
	}
}
