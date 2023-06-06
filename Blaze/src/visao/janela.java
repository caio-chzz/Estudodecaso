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

public class janela extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JTextField txtCpf;
	private JTextField txtTelefone;
	private JTable tabelaUsuarios;
	private DefaultTableModel model;
	private Usuario user  = new Usuario();
	private UsuarioDAO dao = new UsuarioDAO();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					janela frame = new janela();
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
	public janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1197, 726);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		dao = UsuarioDAO.getFUsuarioDAO();
		
		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setBounds(82, 224, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblEmail = new JLabel("Email: ");
		lblEmail.setBounds(82, 272, 31, 14);
		contentPane.add(lblEmail);
		
		JLabel lblCpf = new JLabel("Cpf: ");
		lblCpf.setBounds(82, 323, 46, 14);
		contentPane.add(lblCpf);
		
		JLabel lblTelefone = new JLabel("Telefone: ");
		lblTelefone.setBounds(82, 365, 77, 14);
		contentPane.add(lblTelefone);
		
		txtNome = new JTextField();
		txtNome.setBounds(138, 221, 412, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(138, 269, 412, 20);
		contentPane.add(txtEmail);
		
		txtCpf = new JTextField();
		txtCpf.setColumns(10);
		txtCpf.setBounds(138, 320, 412, 20);
		contentPane.add(txtCpf);
		
		txtTelefone = new JTextField();
		txtTelefone.setColumns(10);
		txtTelefone.setBounds(138, 362, 412, 20);
		contentPane.add(txtTelefone);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBackground(new Color(128, 255, 255));
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user.setNome(txtNome.getText());
				user.setCpf(Long.valueOf((txtCpf.getText())));
				user.setEmail(txtEmail.getText());
				user.setNumero(Long.valueOf((txtTelefone.getText())));
				dao.insert(user);
				
				ArrayList<Usuario> Lista = new ArrayList<>();
				Lista = dao.getList();
				atualizarTabela(Lista);
		
			}
		});
		btnCadastrar.setBounds(235, 436, 227, 23);
		contentPane.add(btnCadastrar);
		
		JLabel lblNewLabel = new JLabel("Tela De Cadastro");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(22, 11, 176, 70);
		contentPane.add(lblNewLabel);
		
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
		scrollPane.setBounds(600, 100, 550, 500);
		contentPane.add(scrollPane);
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
