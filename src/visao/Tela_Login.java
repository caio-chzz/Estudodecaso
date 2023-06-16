package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

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
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
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
		setBounds(100, 100, 837, 437);
		BufferedImage bg = null;
		
		try {
			bg = ImageIO.read(new File("src/imagens/fundoSalvador.png"));

		} catch (IOException e) {
			e.printStackTrace();
		}

		contentPane = new VBackGround(bg);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblEmail = new JLabel("Email");
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		
		textSenha = new JTextField();
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
		
		JButton btnCadastrodUsuario = new JButton("Cadastre-se");
		btnCadastrodUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Tela_CadastrodUsuario tela_cadastrodusuario = new Tela_CadastrodUsuario();
				tela_cadastrodusuario.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize a tela
				tela_cadastrodusuario.setVisible(true);
			
			}
		});
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(194)
					.addComponent(btnLogin)
					.addGap(71)
					.addComponent(btnCadastrodUsuario)
					.addPreferredGap(ComponentPlacement.RELATED, 291, Short.MAX_VALUE)
					.addComponent(btnSair)
					.addGap(56))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(202)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblSenha, Alignment.TRAILING)
						.addComponent(lblEmail, Alignment.TRAILING))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(textEmail)
						.addComponent(textSenha, GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
					.addContainerGap(436, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(197)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSenha)
						.addComponent(textSenha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(32)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEmail)
						.addComponent(textEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(55)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnLogin)
						.addComponent(btnCadastrodUsuario)
						.addComponent(btnSair))
					.addGap(41))
		);
		contentPane.setLayout(gl_contentPane);
	}

}
