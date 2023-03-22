package br.edu.unifacear.bo;

import java.util.List;

import br.edu.unifacear.classes.Distribuicao;
import br.edu.unifacear.dao.DistribuicaoDao;

public class DistribuicaoBo {
	
	public DistribuicaoBo() {	}
	
	public void selecionarDistribuicao(Distribuicao distribuicao) {
		DistribuicaoDao distribuicaoDao = new DistribuicaoDao();
		distribuicaoDao.selecionarDistribuicao(distribuicao);		
	}
	
//	public void inserirDistribuicao(Distribuicao distribuicao) {
//		DistribuicaoDao distribuicaoDao = new DistribuicaoDao();
//		distribuicaoDao.inserirDistribuicao(distribuicao);	
//	}
	
	public void salvarDistribuicao(Distribuicao distribuicao) throws Exception {

		if (distribuicao.getId() <= 0) {
			throw new Exception ("Id não pode ser igual ou menor a zero (0)");
		}
		if (distribuicao.getDescricao().equals("")) {
			throw new Exception ("Descricao deve estar preenchido!");
		}
		
		DistribuicaoDao distribuicaoDao = new DistribuicaoDao();
		distribuicaoDao.salvarDistribuicao(distribuicao);	
	}
	
	public void editarDistribuicao(Distribuicao distribuicao) {
		DistribuicaoDao distribuicaoDao = new DistribuicaoDao();
		distribuicaoDao.editarDistribuicao(distribuicao);		
	}
	public void deletarDistribuicao(int id) {
		DistribuicaoDao distribuicaoDao = new DistribuicaoDao();
		distribuicaoDao.deletarDistribuicao(id);	
	}		
	public List<Distribuicao> listarDistribuicao() {
		DistribuicaoDao distribuicaoDao = new DistribuicaoDao();
		return distribuicaoDao.listarDistribuicao();
	}		

}