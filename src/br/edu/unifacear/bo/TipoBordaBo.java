package br.edu.unifacear.bo;

import java.util.*;
import br.edu.unifacear.classes.TipoBorda;
import br.edu.unifacear.dao.TipoBordaDao;

public class TipoBordaBo {
	
	public TipoBordaBo () { 	}

	public void salvarTipoBorda(TipoBorda tpBorda) throws Exception {
		
		if (tpBorda.getId() <= 0) {
			throw new Exception ("Id não pode ser igual ou menor que zero(0)");
		}
		if (tpBorda.getDescricao().equals("")) {
			throw new Exception ("Descrição deve estar preenchido!");
		}
		
		System.out.println("Validações de Tipo Borda - OK");
		
		TipoBordaDao tpBordaDao = new TipoBordaDao();
		tpBordaDao.salvarTipoBorda(tpBorda);	
	}
	
	public void selecionarTipoBorda(TipoBorda tipoBorda) {
		TipoBordaDao tipoBordaDao = new TipoBordaDao();
		tipoBordaDao.selecionarTipoBorda(tipoBorda);		
	}
	
//	public void inserirTipoBorda(TipoBorda tipoBorda) {
//		TipoBordaDao tipoBordaDao = new TipoBordaDao();
//		tipoBordaDao.inserirTipoBorda(tipoBorda);	
//	}
	
	public void editarTipoBorda(TipoBorda tpBorda) {
		TipoBordaDao tpBordaDao = new TipoBordaDao();
		tpBordaDao.editarTipoBorda(tpBorda);
	}
	
	public void deletarTipoBorda(int id) {
		TipoBordaDao tpBordaDao = new TipoBordaDao();
		tpBordaDao.deletarTipoBorda(id);
	}
	
	public List<TipoBorda> listarTipoBorda() {
		TipoBordaDao tpBordaDao = new TipoBordaDao();
		return tpBordaDao.listarTipoBorda();
	}		
	
	
}
