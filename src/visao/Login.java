package visao;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textSenha;
	private JTextField textEmail;
	private JLabel lblBemVindo;
	private JButton btnCadastrese;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_2;

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
		contentPane = new JPanel();
		contentPane.setForeground(Color.PINK);
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblSenha.setForeground(Color.WHITE);
		lblSenha.setBounds(193, 524, 103, 60);
		contentPane.add(lblSenha);

		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setBounds(193, 398, 70, 60);
		contentPane.add(lblEmail);

		textSenha = new JTextField();
		textSenha.setBackground(new Color(192, 192, 192));
		textSenha.setBounds(306, 422, 225, 28);
		contentPane.add(textSenha);
		textSenha.setColumns(10);

		textEmail = new JTextField();
		textEmail.setBackground(new Color(192, 192, 192));
		textEmail.setColumns(10);
		textEmail.setBounds(306, 540, 225, 28);
		contentPane.add(textEmail);

		JButton btnLogin = new JButton("Login");
		btnLogin.setBackground(new Color(128, 128, 128));
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnLogin.setForeground(Color.BLACK);
		btnLogin.setBounds(173, 671, 145, 60);
		contentPane.add(btnLogin);

		lblBemVindo = new JLabel("Bem Vindo!");
		lblBemVindo.setForeground(Color.WHITE);
		lblBemVindo.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblBemVindo.setBounds(193, 187, 409, 60);
		contentPane.add(lblBemVindo);

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
		btnCadastrese.setBounds(363, 671, 168, 60);
		contentPane.add(btnCadastrese);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/imagens/Design_sem_nome__1_-removebg-preview.png")));
		lblNewLabel.setBounds(144, 151, 1198, 619);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Login.class.getResource("/imagens/Design_sem_nome__3_-removebg-preview.png")));
		lblNewLabel_2.setBounds(1191, 68, 786, 516);
		contentPane.add(lblNewLabel_2);

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