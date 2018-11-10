package br.com.argentum.model;

import java.time.LocalDateTime;
import java.util.List;

public class CandlestickFactory {

	public Candlestick geraCandleParaData(List<Negociacao> negociacoes, LocalDateTime data){
		double abertura, fechamento, minimo, maximo, volume;
		
		abertura = negociacoes.get(0).getPreco();
		fechamento = negociacoes.get(negociacoes.size() - 1).getPreco();
		
		minimo = negociacoes.get(0).getPreco();
		maximo = negociacoes.get(0).getPreco();
		
		volume = 0;
		
		for (Negociacao negociacao : negociacoes) {
			volume += negociacao.getVolume();
			
			if(negociacao.getPreco() > maximo)
				maximo = negociacao.getPreco();
			else if ( negociacao.getPreco() < minimo)
				minimo = negociacao.getPreco();
			
		}

		return new Candlestick(abertura, fechamento, maximo, minimo, volume, data);
	}
}
