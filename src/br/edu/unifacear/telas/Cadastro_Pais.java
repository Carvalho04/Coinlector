package br.edu.unifacear.telas;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Cadastro_Pais extends JFrame {
	
	private JTextField txtNome;
	private JTextField textField;
	public Cadastro_Pais() {
		setTitle("Manter Pais");
		getContentPane().setBackground(new Color(128, 128, 0));
		getContentPane().setLayout(null);
		
		JLabel lblPais = new JLabel("Pais");
		lblPais.setFont(new Font("Rockwell Condensed", Font.PLAIN, 50));
		lblPais.setBounds(196, 23, 67, 96);
		getContentPane().add(lblPais);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(20, 130, 46, 14);
		getContentPane().add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(20, 155, 200, 20);
		getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(10, 23, 83, 25);
		getContentPane().add(btnVoltar);
		
		JLabel lblContinente = new JLabel("Continente");
		lblContinente.setBounds(244, 130, 67, 14);
		getContentPane().add(lblContinente);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(244, 155, 200, 20);
		getContentPane().add(textField);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(196, 217, 83, 25);
		getContentPane().add(btnSalvar);
		
		JButton btnEditar = new JButton("Editar");
		btnEditar.setBounds(20, 217, 83, 25);
		getContentPane().add(btnEditar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(361, 218, 83, 25);
		getContentPane().add(btnExcluir);
	
	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(480, 310);
		this.setResizable(false);
		
		
		
		this.setVisible(true);
	}
}
