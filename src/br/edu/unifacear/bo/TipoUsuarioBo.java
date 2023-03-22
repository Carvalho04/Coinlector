package br.edu.unifacear.bo;

import java.util.List;

import br.edu.unifacear.classes.TipoUsuario;
import br.edu.unifacear.dao.TipoUsuarioDao;

public class TipoUsuarioBo {

	public TipoUsuarioBo () { 	}

	public void salvarTipoUsuario(TipoUsuario tpUsuario) throws Exception {
		
		if (tpUsuario.getId() <= 0) {
			throw new Exception ("Id não pode ser igual ou menor que zero(0)");
		}
		if (tpUsuario.getDescricao().equals("")) {
			throw new Exception ("Descrição deve estar preenchido!");
		}
		
		System.out.println("Validações de Tipo Borda - OK");
		
		TipoUsuarioDao tpUsuarioDao = new TipoUsuarioDao();
		tpUsuarioDao.salvarTipoUsuario(tpUsuario);	
	}
	
	public void selecionarTipoUsuario(TipoUsuario tipoUsuario) {
		TipoUsuarioDao tipoUsuarioDao = new TipoUsuarioDao();
		tipoUsuarioDao.selecionarTipoUsuario(tipoUsuario);		
	}
	
//	public void inserirTipoUsuario(TipoUsuario tipoUsuario) {
//		TipoUsuarioDao tipoUsuarioDao = new TipoUsuarioDao();
//		tipoUsuarioDao.inserirTipoUsuario(tipoUsuario);	
//	}
	
	public void editarTipoUsuario(TipoUsuario tpUsuario) {
		TipoUsuarioDao tpUsuarioDao = new TipoUsuarioDao();
		tpUsuarioDao.editarTipoUsuario(tpUsuario);
	}
	
	public void deletarTipoUsuario(int id) {
		TipoUsuarioDao tpUsuarioDao = new TipoUsuarioDao();
		tpUsuarioDao.deletarTipoUsuario(id);
	}
	
	public List<TipoUsuario> listarTipoUsuario() {
		TipoUsuarioDao tpUsuarioDao = new TipoUsuarioDao();
		return tpUsuarioDao.listarTipoUsuario();
	}		
	
	
}
