package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import controle.PassagemDAO;
import controle.UsuarioDAO;
import modelo.Passagem;
import modelo.Usuario;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JFormattedTextField;

public class Tela_CadastrodUsuario extends JFrame {

	private JPanel contentPane;
	private JButton btnVoltar;
	private JTextField textEmail;
	private JTextField textNome;
	private JLabel lblCrieSuaConta;
	private JPanel panel;
	private JPasswordField passwordSenha;
	
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	
	public Tela_CadastrodUsuario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1230, 748);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(56, 124, 154));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(56, 124, 154));
		panel.setBounds(245, 115, 1010, 570);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textNome = new JTextField();
		textNome.setBackground(new Color(81, 159, 192));
		textNome.setBounds(339, 135, 479, 20);
		panel.add(textNome);
		textNome.setColumns(10);
		
		textEmail = new JTextField();
		textEmail.setBackground(new Color(81, 159, 192));
		textEmail.setBounds(340, 199, 479, 20);
		panel.add(textEmail);
		textEmail.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblSenha.setBounds(209, 372, 77, 14);
		panel.add(lblSenha);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblTelefone.setBounds(191, 319, 95, 14);
		panel.add(lblTelefone);
		
		JLabel lblCpf = new JLabel("Cpf:");
		lblCpf.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblCpf.setBounds(227, 259, 59, 14);
		panel.add(lblCpf);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNome.setBounds(209, 135, 77, 14);
		panel.add(lblNome);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblEmail.setBounds(209, 199, 59, 14);
		panel.add(lblEmail);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBackground(new Color(74, 255, 120));
		btnCadastrar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCadastrar.setBounds(256, 463, 192, 66);
		panel.add(btnCadastrar);
		
		btnVoltar = new JButton("Voltar");
		btnVoltar.setBackground(new Color(82, 159, 191));
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnVoltar.setBounds(612, 463, 192, 66);
		panel.add(btnVoltar);
		
		lblCrieSuaConta = new JLabel("Crie sua conta");
		lblCrieSuaConta.setBounds(470, 43, 299, 41);
		panel.add(lblCrieSuaConta);
		lblCrieSuaConta.setFont(new Font("Tahoma", Font.BOLD, 32));
		
		JLabel lblCpf_1_1 = new JLabel("*");
		lblCpf_1_1.setForeground(Color.RED);
		lblCpf_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCpf_1_1.setBounds(287, 135, 21, 14);
		panel.add(lblCpf_1_1);
		
		JLabel lblCpf_1_1_1 = new JLabel("*");
		lblCpf_1_1_1.setForeground(Color.RED);
		lblCpf_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCpf_1_1_1.setBounds(287, 202, 21, 14);
		panel.add(lblCpf_1_1_1);
		
		JLabel lblCpf_1_1_2 = new JLabel("*");
		lblCpf_1_1_2.setForeground(Color.RED);
		lblCpf_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCpf_1_1_2.setBounds(287, 262, 21, 14);
		panel.add(lblCpf_1_1_2);
		
		JLabel lblCpf_1_1_3 = new JLabel("*");
		lblCpf_1_1_3.setForeground(Color.RED);
		lblCpf_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCpf_1_1_3.setBounds(287, 322, 21, 14);
		panel.add(lblCpf_1_1_3);
		
		JLabel lblCpf_1_1_4 = new JLabel("*");
		lblCpf_1_1_4.setForeground(Color.RED);
		lblCpf_1_1_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCpf_1_1_4.setBounds(287, 375, 21, 14);
		panel.add(lblCpf_1_1_4);
		
		passwordSenha = new JPasswordField();
		passwordSenha.setColumns(10);
		passwordSenha.setBackground(new Color(81, 159, 192));
		passwordSenha.setBounds(339, 372, 479, 20);
		panel.add(passwordSenha);
		
		JFormattedTextField textTelefone = new JFormattedTextField(Mascara("(##)#####-#####"));
		textTelefone.setBackground(new Color(81, 159, 192));
		textTelefone.setBounds(339, 319, 479, 20);
		panel.add(textTelefone);
		
		JFormattedTextField textCpf = new JFormattedTextField(Mascara("###.###.###-##"));
		textCpf.setBackground(new Color(81, 159, 192));
		textCpf.setBounds(339, 259, 479, 20);
		panel.add(textCpf);
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Tela_Login tela_login = new Tela_Login();
				tela_login.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize a tela
				tela_login.setVisible(true);
			}
		});
		
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuario u = new Usuario();
				
				String nome = textNome.getText();
				String telefoneText = textTelefone.getText();
				telefoneText = telefoneText.replaceAll("[()-]", "");
				Long telefone = Long.parseLong(telefoneText);
				String cpfText = textCpf.getText();
				cpfText = cpfText.replaceAll("[.-]", "");
				Long cpf = Long.parseLong(cpfText);
				String email = textEmail.getText();
				String senha = new String(passwordSenha.getPassword());
				
				u.setNome(nome);
				u.setCpf(telefone);
				u.setEmail(email);
				u.setCpf(cpf);
				u.setSenha(senha);
				
				UsuarioDAO daoUsuario = UsuarioDAO.getInstacia();
				Boolean inserir = daoUsuario.inserir(u);
				
				dispose();
				Tela_Login tela_login = new Tela_Login();
				tela_login.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize a tela
				tela_login.setVisible(true);
			}
		});
	}
	
	public MaskFormatter Mascara(String Mascara){
        
        MaskFormatter F_Mascara = new MaskFormatter();
        try{
            F_Mascara.setMask(Mascara); //Atribui a mascara
            F_Mascara.setPlaceholderCharacter(' '); //Caracter para preencimento 
        }
        catch (Exception excecao) {
        excecao.printStackTrace();
        } 
        return F_Mascara;
	} 
}
