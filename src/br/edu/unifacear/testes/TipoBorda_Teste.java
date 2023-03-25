package br.edu.unifacear.testes;

import br.edu.unifacear.bo.BordaBo;
import br.edu.unifacear.classes.Borda;

public class TipoBorda_Teste {

	public static void main (String []args) {
		
		Borda tpBorda = new Borda();
		
		tpBorda.setId(7);
		tpBorda.setDescricao("Serrilhada");
		
		BordaBo tpBordaBo = new BordaBo();
		try {
			tpBordaBo.salvarTipoBorda(tpBorda);
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		System.out.println(tpBorda);
	}
	
}
