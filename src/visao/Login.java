package visao;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textSenha;
	private JTextField textEmail;
	private JButton btnCadastrese;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * CONSTRUTOR DA CLASSE
	 */
	public Login() {
		setTitle("Tela inicial");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1303, 781);
		BufferedImage bg = null;
		;
		try {
			bg = ImageIO.read(new File("src/imagens/fundoSalvador.png"));

		} catch (IOException e) {
			e.printStackTrace();
		}

		contentPane = new VBackGround(bg);
		contentPane.setBackground(new Color(0, 156, 156));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblSenha.setForeground(Color.BLACK);
		lblSenha.setBounds(792, 565, 103, 60);
		contentPane.add(lblSenha);

		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblEmail.setForeground(Color.BLACK);
		lblEmail.setBounds(792, 439, 70, 60);
		contentPane.add(lblEmail);

		textSenha = new JTextField();
		textSenha.setOpaque(false);
		textSenha.setForeground(Color.BLACK);
		textSenha.setBackground(new Color(192, 192, 192));
		textSenha.setBounds(905, 463, 225, 28);
		contentPane.add(textSenha);
		textSenha.setColumns(10);

		textEmail = new JTextField();
		textEmail.setOpaque(false);
		textEmail.setForeground(Color.BLACK);
		textEmail.setBackground(new Color(192, 192, 192));
		textEmail.setColumns(10);
		textEmail.setBounds(905, 581, 225, 28);
		contentPane.add(textEmail);

		JButton btnLogin = new JButton("Login");
		btnLogin.setBackground(new Color(128, 128, 128));
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnLogin.setForeground(Color.BLACK);
		btnLogin.setBounds(772, 712, 145, 60);
		contentPane.add(btnLogin);

		btnCadastrese = new JButton("Cadastre-se");
		btnCadastrese.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Cadastro cs = new Cadastro();
				cs.setExtendedState(JFrame.MAXIMIZED_BOTH);
				cs.setVisible(true);
			}
		});
		btnCadastrese.setBackground(new Color(128, 128, 128));
		btnCadastrese.setForeground(Color.BLACK);
		btnCadastrese.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnCadastrese.setBounds(962, 712, 168, 60);
		contentPane.add(btnCadastrese);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/imagens/usus-removebg-preview.png")));
		lblNewLabel.setBounds(391, 11, 646, 543);
		contentPane.add(lblNewLabel);

		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				ViagemHorarios viagemhorarios = new ViagemHorarios();
				viagemhorarios.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize a tela
				viagemhorarios.setVisible(true);
			}
		});
	}
}