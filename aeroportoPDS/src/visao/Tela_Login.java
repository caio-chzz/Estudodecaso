package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controle.UsuarioDAO;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;

public class Tela_Login extends JFrame {

	private JPanel contentPane;
	private JTextField textEmail;
	private JPasswordField passwordSenha;

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
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1225, 740);
		BufferedImage bg = null;
		
		contentPane = new VBackGround(bg);
		contentPane.setBackground(new Color(56, 124, 154));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setForeground(new Color(255, 255, 255));
		btnSair.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSair.setBackground(new Color(255, 0, 0));
		btnSair.setBounds(1095, 573, 101, 42);
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnSair);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(49, 83, 181));
		panel.setBounds(314, 342, 492, 351);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnLogin.setBackground(new Color(0, 0, 160));
		btnLogin.setBounds(71, 240, 138, 60);
		panel.add(btnLogin);
		
		JButton btnCadastrodUsuario = new JButton("Cadastre-se");
		btnCadastrodUsuario.setForeground(new Color(255, 255, 255));
		btnCadastrodUsuario.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCadastrodUsuario.setBackground(new Color(0, 0, 160));
		btnCadastrodUsuario.setBounds(291, 241, 138, 59);
		panel.add(btnCadastrodUsuario);
		
		textEmail = new JTextField();
		textEmail.setBackground(new Color(49, 83, 181));
		textEmail.setBounds(167, 105, 234, 19);
		panel.add(textEmail);
		textEmail.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(56, 106, 68, 13);
		panel.add(lblEmail);
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSenha.setBounds(56, 159, 68, 13);
		panel.add(lblSenha);
		
		passwordSenha = new JPasswordField(10);
		passwordSenha.setBackground(new Color(49, 83, 181));
		passwordSenha.setBounds(167, 158, 234, 19);
		panel.add(passwordSenha);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(798, 279, 591, 194);
		contentPane.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(Tela_Login.class.getResource("/imagens/image-removebg-preview (24).png")));
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Tela_Login.class.getResource("/imagens/perf.png")));
		lblNewLabel_1.setBounds(355, 111, 342, 155);
		contentPane.add(lblNewLabel_1);
		
		
		btnCadastrodUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Tela_CadastrodUsuario tela_cadastrodusuario = new Tela_CadastrodUsuario();
				tela_cadastrodusuario.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize a tela
				tela_cadastrodusuario.setVisible(true);
			
			}
		});
		
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Integer confirm = 0;

				UsuarioDAO daoUsuario = UsuarioDAO.getInstacia();
				int loginResult = daoUsuario.login(textEmail.getText(), new String(passwordSenha.getPassword()), confirm);

				if (loginResult == 1) {
				    dispose();
				    Tela_Menu menu = new Tela_Menu();
				    menu.setExtendedState(JFrame.MAXIMIZED_BOTH);
				    menu.setVisible(true);
				} else {
				    JOptionPane.showMessageDialog(null, "Email ou Senha incorreta!!");
				}
			}
		});
	}
}
