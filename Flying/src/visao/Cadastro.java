package visao;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import controle.UsuarioDAO;
import modelo.Usuario;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.ImageIcon;

public class Cadastro extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JTextField txtCpf;
	private JTable tabelaUsuarios;
	private DefaultTableModel model;
	private Usuario user  = new Usuario();
	private UsuarioDAO dao = new UsuarioDAO();
	private JTextField textSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		  try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
	            System.err.println(ex);
	        } 
	        //</editor-fold>
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro frame = new Cadastro();
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
	public Cadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1197, 726);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		dao = UsuarioDAO.getFUsuarioDAO();
		
		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNome.setForeground(Color.WHITE);
		lblNome.setBounds(176, 226, 92, 14);
		contentPane.add(lblNome);
		
		JLabel lblEmail = new JLabel("Email: ");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setBounds(176, 282, 92, 17);
		contentPane.add(lblEmail);
		
		JLabel lblCpf = new JLabel("Cpf: ");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblCpf.setForeground(Color.WHITE);
		lblCpf.setBounds(176, 338, 92, 20);
		contentPane.add(lblCpf);
		
		txtNome = new JTextField();
		txtNome.setBackground(new Color(192, 192, 192));
		txtNome.setBounds(342, 228, 412, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBackground(new Color(192, 192, 192));
		txtEmail.setColumns(10);
		txtEmail.setBounds(342, 285, 412, 20);
		contentPane.add(txtEmail);
		
		txtCpf = new JTextField();
		txtCpf.setBackground(new Color(192, 192, 192));
		txtCpf.setColumns(10);
		txtCpf.setBounds(342, 338, 412, 20);
		contentPane.add(txtCpf);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnCadastrar.setBackground(new Color(128, 255, 255));
		JButton btnLogin = new JButton("Login");
		btnLogin.setBackground(new Color(0, 255, 255));
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btnLogin.setForeground(Color.BLACK);
		btnLogin.setBounds(586, 471, 168, 35);
		contentPane.add(btnLogin);
		btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // Fecha a janela atual
                Login login = new Login();
                login.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize a tela
                login.setVisible(true);
            }
        });
		btnCadastrar.addActionListener(new ActionListener() {
		
		
			public void actionPerformed(ActionEvent e) {
				user.setNome(txtNome.getText());
				user.setCpf(Long.valueOf((txtCpf.getText())));
				user.setEmail(txtEmail.getText());
				dao.insert(user);
				
				ArrayList<Usuario> Lista = new ArrayList<>();
				Lista = dao.getList();
				atualizarTabela(Lista);
				
				txtNome.setText(null);
				txtEmail.setText(null);
				txtCpf.setText(null);
				textSenha.setText(null);
		
			}
		});
		btnCadastrar.setBounds(352, 471, 161, 35);
		contentPane.add(btnCadastrar);
		
		// Adicionando o JTable
		model = new DefaultTableModel();
		tabelaUsuarios = new JTable(model);
		
		// Configurando as colunas do JTable
		model.addColumn("Nome");
		model.addColumn("Email");
		model.addColumn("CPF");
		model.addColumn("Telefone");
		
		// Adicionando o JTable em um JScrollPane
		JScrollPane scrollPane = new JScrollPane(tabelaUsuarios);
		scrollPane.setBounds(797, 148, 550, 500);
		contentPane.add(scrollPane);
		
		textSenha = new JTextField();
		textSenha.setBackground(new Color(192, 192, 192));
		textSenha.setColumns(10);
		textSenha.setBounds(342, 394, 412, 20);
		contentPane.add(textSenha);
		
		JLabel lblSenha = new JLabel("Senha: ");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblSenha.setForeground(Color.WHITE);
		lblSenha.setBounds(177, 394, 111, 14);
		contentPane.add(lblSenha);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Cadastro.class.getResource("/imagens/Design sem nome (1).png")));
		lblNewLabel.setBounds(35, 148, 336, 83);
		contentPane.add(lblNewLabel);
	}
	public void atualizarTabela(ArrayList<Usuario> TUser) {
	    // Limpa o modelo da tabela
	    model.setRowCount(0);
	    
	    // Adiciona as pessoas como novas linhas da tabela
	    for (Usuario usuario : TUser) {
	        Object[] linha = {usuario.getNome(), usuario.getEmail(), usuario.getCpf(), usuario.getNumero()};
	        model.addRow(linha);
		}
	    
	}
}