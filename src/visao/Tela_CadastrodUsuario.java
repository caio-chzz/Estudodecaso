package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Tela_CadastrodUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField textCpf;
	private JButton btnVoltar;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblCrieSuaConta;

	
	public Tela_CadastrodUsuario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1104, 652);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(62, 187, 31, 14);
		contentPane.add(lblNome);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(62, 234, 28, 14);
		contentPane.add(lblEmail);
		
		JLabel lblCpf = new JLabel("Cpf:");
		lblCpf.setBounds(69, 281, 21, 14);
		contentPane.add(lblCpf);
		
		textCpf = new JTextField();
		textCpf.setBounds(120, 380, 171, 20);
		contentPane.add(textCpf);
		textCpf.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(44, 330, 46, 14);
		contentPane.add(lblTelefone);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(49, 383, 61, 14);
		contentPane.add(lblSenha);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(45, 458, 115, 23);
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Tela_Login tela_login = new Tela_Login();
				tela_login.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize a tela
				tela_login.setVisible(true);
			}
		});
		contentPane.add(btnCadastrar);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(208, 458, 103, 23);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Tela_Login tela_login = new Tela_Login();
				tela_login.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize a tela
				tela_login.setVisible(true);
			}
		});
		contentPane.add(btnVoltar);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(120, 327, 171, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(120, 278, 171, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(120, 231, 171, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(120, 184, 171, 20);
		contentPane.add(textField_3);
		
		lblCrieSuaConta = new JLabel("Crie sua conta");
		lblCrieSuaConta.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCrieSuaConta.setBounds(120, 112, 165, 41);
		contentPane.add(lblCrieSuaConta);
	}

}
