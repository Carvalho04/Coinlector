package br.edu.unifacear.testes;

import br.edu.unifacear.bo.TipoBordaBo;
import br.edu.unifacear.classes.TipoBorda;

public class TipoBorda_Teste {

	public static void main (String []args) {
		
		TipoBorda tpBorda = new TipoBorda();
		
		tpBorda.setId(7);
		tpBorda.setDescricao("Serrilhada");
		
		TipoBordaBo tpBordaBo = new TipoBordaBo();
		try {
			tpBordaBo.salvarTipoBorda(tpBorda);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		System.out.println(tpBorda);
	}
	
}
