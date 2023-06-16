package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela_Login extends JFrame {

	private JPanel contentPane;
	private JTextField textEmail;
	private JTextField textSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Login frame = new Tela_Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tela_Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblEmail = new JLabel("Email");
		contentPane.add(lblEmail);
		
		textEmail = new JTextField();
		contentPane.add(textEmail);
		textEmail.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		contentPane.add(lblSenha);
		
		textSenha = new JTextField();
		contentPane.add(textSenha);
		textSenha.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Tela_Menu menu = new Tela_Menu();
				menu.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize a tela
				menu.setVisible(true);
			}
		});
		contentPane.add(btnLogin);
		
		JButton btnCadastrodUsuario = new JButton("Cadastre-se");
		btnCadastrodUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Tela_CadastrodUsuario tela_cadastrodusuario = new Tela_CadastrodUsuario();
				tela_cadastrodusuario.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize a tela
				tela_cadastrodusuario.setVisible(true);
			
			}
		});
		contentPane.add(btnCadastrodUsuario);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		contentPane.add(btnSair);
	}

}
