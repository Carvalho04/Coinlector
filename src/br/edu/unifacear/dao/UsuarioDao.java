package br.edu.unifacear.dao;

import java.util.ArrayList;
import java.util.List;

import br.edu.unifacear.classes.Usuario;

public class UsuarioDao {

public UsuarioDao () {}
	
		public void selecionarUsuario(Usuario usuario) {
		System.out.println("Usuario Selecionado");		
		}
		
		public void salvarUsuario(Usuario usuario) {
			System.out.println("Usuario Salvo");		
		}	
		
//		public void inserirUsuario(Usuario usuario) {
//		System.out.println("Usuario Inserido");
//		}
		
		public void editarUsuario(Usuario usuario) {
			System.out.println("Usuario Editado");		
		}
		
		public void deletarUsuario(int id) {
			System.out.println("Usuario Deletado");		
		}
		
		public List<Usuario> listarUsuario() {
			System.out.println("Lista Usuario");	
			List<Usuario> lista = new ArrayList<Usuario>(); 
			return lista;
		}	
		

	
}
