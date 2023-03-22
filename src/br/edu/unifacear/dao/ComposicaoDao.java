package br.edu.unifacear.dao;

import java.util.*;

import br.edu.unifacear.classes.Composicao;

public class ComposicaoDao {
	
	public ComposicaoDao () {}
		
		public void selecionarComposicao(Composicao composicao) {
			System.out.println("Composição Selecionado");		
		}
	
		public void salvarComposicao(Composicao composicao) {
			System.out.println("Composição Salvo");		
		}	
		
//		public void inserirComposicao(Composicao composicao) {
//			System.out.println("Composicao Inserido");
//		}
		
		public void editarComposicao(Composicao composicao) {
			System.out.println("Composição Editado");		
		}
		
		public void deletarComposicao(int id) {
			System.out.println("Composição Deletado");		
		}
		
		public List<Composicao> listarComposicao() {
			System.out.println("Lista Composição");	
			List<Composicao> lista = new ArrayList<Composicao>(); 
			return lista;
		}	
		
	}
