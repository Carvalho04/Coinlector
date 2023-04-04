package br.edu.unifacear.telas;

import javax.swing.*;

import br.edu.unifacear.jdbc.Fabrica;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.Reader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class TelaLogin extends JFrame{
	
	public String acesso;
	private JTextField txtLogin;
	private JPasswordField txtSenha;
	
	
	public TelaLogin() {
		setTitle("Coinlector");
		
		JPanel jpn = new JPanel();
		jpn.setBackground(new Color(128, 128, 0));
		getContentPane().add(jpn, BorderLayout.CENTER);
		jpn.setLayout(null);
		
		JLabel lblTitle = new JLabel("COINLECTOR");
		lblTitle.setBounds(118, 64, 219, 59);
		lblTitle.setFont(new Font("Rockwell Condensed", Font.PLAIN, 50));
		jpn.add(lblTitle);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(57, 158, 46, 14);
		jpn.add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(57, 205, 46, 14);
		jpn.add(lblSenha);
		
		txtLogin = new JTextField();
		txtLogin.setToolTipText("Coloque sua matricula de login");
		txtLogin.setBounds(109, 155, 263, 20);
		jpn.add(txtLogin);
		txtLogin.setColumns(10);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(109, 202, 263, 20);
		jpn.add(txtSenha);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			    }   
							
		});
				
		btnEntrar.setBounds(57, 249, 134, 23);
		jpn.add(btnEntrar);
		
		JButton btnCadastro = new JButton("Cadastre-se");
		btnCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Cadastro_Usuario cadastro = new Cadastro_Usuario();
				TelaLogin.this.dispose();
				
			}
		});
		btnCadastro.setBounds(154, 313, 119, 23);
		jpn.add(btnCadastro);
		
		JButton btnEsqueciSenha = new JButton("Esqueci a senha");
		btnEsqueciSenha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEsqueciSenha.setBounds(238, 249, 134, 23);
		jpn.add(btnEsqueciSenha);
		
		JLabel lblCadastro = new JLabel("Ainda não tem cadastro?");
		lblCadastro.setBounds(144, 288, 150, 14);
		jpn.add(lblCadastro);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(449, 394);
		this.setResizable(false);		
		this.setVisible(true);	
		
		
	}
	
	public static void main (String []args) {
	
	TelaLogin telaLogin = new TelaLogin();
}
	
	
	
}