package br.edu.unifacear.telas;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;

public class Sugestao_Adm extends JFrame{
	private JTable table;
	public Sugestao_Adm() {
		setTitle("Sugestões de Colecionadores");
		getContentPane().setBackground(new Color(128, 128, 0));
		getContentPane().setLayout(null);
		
		JLabel lblSugestao = new JLabel("Sugestões");
		lblSugestao.setFont(new Font("Rockwell Condensed", Font.PLAIN, 50));
		lblSugestao.setBounds(177, 11, 153, 99);
		getContentPane().add(lblSugestao);
		
		table = new JTable();
		table.setBounds(57, 98, 383, 407);
		getContentPane().add(table);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(10, 11, 89, 23);
		getContentPane().add(btnVoltar);
	
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(505, 555);
		this.setResizable(false);
		this.setVisible(true);
	}

	
	
	public static void main(String []agrs) {
		
		Sugestao_Adm colecao= new Sugestao_Adm();
		
	}
}
