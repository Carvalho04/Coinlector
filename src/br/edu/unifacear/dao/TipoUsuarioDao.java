package br.edu.unifacear.dao;

import java.util.ArrayList;
import java.util.List;

import br.edu.unifacear.classes.TipoUsuario;

public class TipoUsuarioDao {
	
	public TipoUsuarioDao() { 	}
		
		public void selecionarTipoUsuario(TipoUsuario tipoUsuario) {
			System.out.println("Tipo de Usuario Selecionado");		
		}
	
		public void salvarTipoUsuario(TipoUsuario tpUsuario) {
			System.out.println("Tipo de Usuario Salvo");
		}
		
//		public void inserirColecao(TipoUsuario tipoUsuario) {
//		System.out.println("Tipo de Usuario Inserido");
//		}
		
		public void editarTipoUsuario(TipoUsuario tpUsuario) {
			System.out.println("Tipo de Usuario Editado");
		}
		
		public void deletarTipoUsuario(int id) {
			System.out.println("Tipo de Usuario Deletado");
		}
		
		public List<TipoUsuario> listarTipoUsuario() {
			System.out.println("Lista Tipo de Usuario");	
			List<TipoUsuario> lista = new ArrayList<TipoUsuario>(); 
			return lista;
		}	
		
}
