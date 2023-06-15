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

public class Tela_CadastrodUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textEmail;
	private JTextField textCpf;
	private JTextField textTelefone;
	private JTextField textSenha;
	private JButton btnSair;
	private JButton btnVoltar;

	
	public Tela_CadastrodUsuario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblNome = new JLabel("Nome:");
		contentPane.add(lblNome);
		
		textNome = new JTextField();
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:");
		contentPane.add(lblEmail);
		
		textEmail = new JTextField();
		contentPane.add(textEmail);
		textEmail.setColumns(10);
		
		JLabel lblCpf = new JLabel("Cpf:");
		contentPane.add(lblCpf);
		
		textCpf = new JTextField();
		contentPane.add(textCpf);
		textCpf.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		contentPane.add(lblTelefone);
		
		textTelefone = new JTextField();
		contentPane.add(textTelefone);
		textTelefone.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		contentPane.add(lblSenha);
		
		textSenha = new JTextField();
		contentPane.add(textSenha);
		textSenha.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Tela_Login tela_login = new Tela_Login();
				tela_login.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize a tela
				tela_login.setVisible(true);
			}
		});
		contentPane.add(btnCadastrar);
		
		btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		contentPane.add(btnSair);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Tela_Login tela_login = new Tela_Login();
				tela_login.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize a tela
				tela_login.setVisible(true);
			}
		});
		contentPane.add(btnVoltar);
	}

}
