package br.edu.unifacear.bo;

import java.util.List;

import br.edu.unifacear.classes.ItensAVenda;
import br.edu.unifacear.dao.ItensAVendaDao;

public class ItensAVendaBo {


	public ItensAVendaBo() {	}
	
	public void salvarItensAVenda(ItensAVenda itensAVenda) throws Exception {

		if (itensAVenda.getId() <= 0) {
			throw new Exception ("Id não pode ser igual ou menor a zero (0)");
		}
		
		ItensAVendaDao itensAVendaDao = new ItensAVendaDao();
		itensAVendaDao.salvarItensAVenda(itensAVenda);	
	}
	
	public void selecionarItensAVenda(ItensAVenda itensAVenda) {
		ItensAVendaDao itensAVendaDao = new ItensAVendaDao();
		itensAVendaDao.selecionarItensAVenda(itensAVenda);		
	}
	
	
//	public void inserirItensAVenda(ItensAVenda itensAVenda) {
//		ItensAVendaDao itensAVendaDao = new ItensAVendaDao();
//		itensAVendaDao.inserirItensAVenda(itensAVenda);	
//	}
	
	public void editarItensAVenda(ItensAVenda itensAVenda) {
		ItensAVendaDao itensAVendaDao = new ItensAVendaDao();
		itensAVendaDao.editarItensAVenda(itensAVenda);		
	}
	
	public void deletarItensAVenda(int id) {
		ItensAVendaDao itensAVendaDao = new ItensAVendaDao();
		itensAVendaDao.deletarItensAVenda(id);	
	}
	
	public List<ItensAVenda> listarItensAVenda() {
		ItensAVendaDao itensAVendaDao = new ItensAVendaDao();
		return itensAVendaDao.listarItensAVenda();
	}		
	
	
}
