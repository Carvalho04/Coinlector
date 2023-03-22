package br.edu.unifacear.dao;

import java.util.*;

import br.edu.unifacear.classes.Pais;

public class PaisDao {

	public PaisDao() {   }
	
		public void selecionarPais(Pais pais) {
			System.out.println("Pais Selecionado");		
		}
		
		public void salvarPais(Pais pais) {
			System.out.println("Pais Salvo");
		}
		
//		public void inserirPais(Pais pais) {
//		System.out.println("Pais Inserido");
//		}
		
		public void editarPais(Pais pais) {
			System.out.println("Pais Editado");
		}
		
		public void deletarPais(int id) {
			System.out.println("Pais Deletado");
		}
		
		public List <Pais> listarPais(){
			System.out.println("Lista Pais");
			List<Pais> lista = new ArrayList<Pais>();
			return lista;
		}
}
