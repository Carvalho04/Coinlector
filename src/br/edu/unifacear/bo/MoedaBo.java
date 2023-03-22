package br.edu.unifacear.bo;

import java.util.List;

import br.edu.unifacear.classes.Moeda;
import br.edu.unifacear.dao.MoedaDao;

public class MoedaBo {

	public MoedaBo() {	}
	
	public void salvarMoeda(Moeda moeda) throws Exception {

		if (moeda.getId() <= 0) {
			throw new Exception ("Id não pode ser igual ou menor a zero (0)");
		}
		
		MoedaDao moedaDao = new MoedaDao();
		moedaDao.salvarMoeda(moeda);	
	}
	
	public void selecionarMoeda(Moeda moeda) {
		MoedaDao moedaDao = new MoedaDao();
		moedaDao.selecionarMoeda(moeda);		
	}
	
//	public void inserirMoeda(Moeda moeda) {
//		MoedaDao moedaDao = new MoedaDao();
//		moedaDao.inserirMoeda(moeda);	
//	}
	
	public void editarMoeda(Moeda moeda) {
		MoedaDao moedaDao = new MoedaDao();
		moedaDao.editarMoeda(moeda);		
	}
	
	public void deletarMoeda(int id) {
		MoedaDao moedaDao = new MoedaDao();
		moedaDao.deletarMoeda(id);	
	}
	
	public List<Moeda> listarMoeda() {
		MoedaDao moedaDao = new MoedaDao();
		return moedaDao.listarMoeda();
	}		
	
}
