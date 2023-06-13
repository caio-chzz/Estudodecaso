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

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textSenha;
	private JTextField textEmail;
	private JLabel lblBemVindo;
	private JLabel lblNoPossuiCadastro;
	private JButton btnCadastrese;
	private JLabel lblNewLabel;

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
		setBounds(100, 100, 1303, 718);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblSenha.setForeground(Color.WHITE);
		lblSenha.setBounds(839, 412, 103, 60);
		contentPane.add(lblSenha);

		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setBounds(839, 291, 70, 60);
		contentPane.add(lblEmail);

		textSenha = new JTextField();
		textSenha.setBackground(new Color(192, 192, 192));
		textSenha.setBounds(997, 316, 208, 20);
		contentPane.add(textSenha);
		textSenha.setColumns(10);

		textEmail = new JTextField();
		textEmail.setBackground(new Color(192, 192, 192));
		textEmail.setColumns(10);
		textEmail.setBounds(997, 437, 208, 20);
		contentPane.add(textEmail);

		JButton btnLogin = new JButton("Login");
		btnLogin.setBackground(new Color(128, 128, 128));
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnLogin.setForeground(Color.BLACK);
		btnLogin.setBounds(839, 549, 145, 60);
		contentPane.add(btnLogin);

		lblBemVindo = new JLabel("Bem Vindo!");
		lblBemVindo.setForeground(Color.WHITE);
		lblBemVindo.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblBemVindo.setBounds(868, 138, 409, 60);
		contentPane.add(lblBemVindo);

		lblNoPossuiCadastro = new JLabel("Não possui cadastro?");
		lblNoPossuiCadastro.setForeground(Color.WHITE);
		lblNoPossuiCadastro.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNoPossuiCadastro.setBounds(1027, 495, 191, 60);
		contentPane.add(lblNoPossuiCadastro);

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
		btnCadastrese.setBounds(1067, 549, 168, 60);
		contentPane.add(btnCadastrese);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/imagens/viaofundo2.png")));
		lblNewLabel.setBounds(-566, -27, 1288, 1220);
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