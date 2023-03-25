package br.edu.unifacear.bo;

import java.util.*;
import br.edu.unifacear.classes.Borda;
import br.edu.unifacear.dao.BordaDao;

public class BordaBo {
	
	public BordaBo () { 	}

	public void salvarTipoBorda(Borda tpBorda) throws Exception {
		
		if (tpBorda.getId() <= 0) {
			throw new Exception ("Id não pode ser igual ou menor que zero(0)");
		}
		if (tpBorda.getDescricao().equals("")) {
			throw new Exception ("Descrição deve estar preenchido!");
		}
		
		System.out.println("Validações de Tipo Borda - OK");
		
		BordaDao tpBordaDao = new BordaDao();
		tpBordaDao.salvarTipoBorda(tpBorda);	
	}
	
	public void selecionarTipoBorda(Borda tipoBorda) {
		BordaDao tipoBordaDao = new BordaDao();
		tipoBordaDao.selecionarTipoBorda(tipoBorda);		
	}
	
//	public void inserirTipoBorda(TipoBorda tipoBorda) {
//		TipoBordaDao tipoBordaDao = new TipoBordaDao();
//		tipoBordaDao.inserirTipoBorda(tipoBorda);	
//	}
	
	public void editarTipoBorda(Borda tpBorda) {
		BordaDao tpBordaDao = new BordaDao();
		tpBordaDao.editarTipoBorda(tpBorda);
	}
	
	public void deletarTipoBorda(int id) {
		BordaDao tpBordaDao = new BordaDao();
		tpBordaDao.deletarTipoBorda(id);
	}
	
	public List<Borda> listarTipoBorda() {
		BordaDao tpBordaDao = new BordaDao();
		return tpBordaDao.listarTipoBorda();
	}		
	
	
}
