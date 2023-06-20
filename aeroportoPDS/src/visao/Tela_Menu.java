package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

import controle.VooDAO;
import modelo.Voo;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;

public class Tela_Menu extends JFrame {

	private JPanel contentPane;
	private JTable table;
	
	private void Lista(JTable table) {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		atualizaJTable(model, table);
	}
	
	public Tela_Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1226, 730);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(56, 124, 154));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblVoos = new JLabel("Voôs disponíveis");
		lblVoos.setForeground(new Color(0, 0, 0));
		lblVoos.setFont(new Font("Tahoma", Font.BOLD, 33));
		lblVoos.setBounds(566, 104, 297, 62);
		contentPane.add(lblVoos);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 160));
		panel.setBounds(103, 0, 291, 826);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnAdicionarVoo = new JButton("Adicionar voô");
		btnAdicionarVoo.setForeground(new Color(0, 0, 0));
		btnAdicionarVoo.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnAdicionarVoo.setBackground(new Color(128, 128, 128));
		btnAdicionarVoo.setBounds(78, 403, 203, 35);
		panel.add(btnAdicionarVoo);
		
		JButton btnComprarPassagens = new JButton("Comprar passagens");
		btnComprarPassagens.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnComprarPassagens.setForeground(new Color(0, 0, 0));
		btnComprarPassagens.setBackground(new Color(0, 255, 128));
		btnComprarPassagens.setBounds(78, 272, 203, 35);
		panel.add(btnComprarPassagens);
		
		JButton btnSair = new JButton("Sair do sistema");
		btnSair.setForeground(new Color(0, 0, 0));
		btnSair.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnSair.setBackground(new Color(255, 128, 128));
		btnSair.setBounds(78, 136, 203, 35);
		panel.add(btnSair);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setEnabled(false);
		scrollPane.setBounds(570, 232, 739, 346);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setSurrendersFocusOnKeystroke(true);
		table.setBackground(new Color(255, 255, 255));
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Destino", "Hor\u00E1rio", "Valor", "Data"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Integer.class, Float.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		
		DefaultTableCellRenderer centralizarRenderer = new DefaultTableCellRenderer();
        centralizarRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        table.getColumnModel().getColumn(0).setCellRenderer(centralizarRenderer);
        table.getColumnModel().getColumn(1).setCellRenderer(centralizarRenderer);
        table.getColumnModel().getColumn(2).setCellRenderer(centralizarRenderer);
        table.getColumnModel().getColumn(3).setCellRenderer(centralizarRenderer);
		
		Lista(table);
		
		JButton btnNewButton = new JButton("Excluir voo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
			        int selectedRow = table.getSelectedRow();
			        if (selectedRow != -1) {
			            DefaultTableModel model = (DefaultTableModel) table.getModel();
			            model.removeRow(selectedRow);
			        }
			}}
		);
		btnNewButton.setBackground(new Color(255, 0, 0));
		btnNewButton.setBounds(566, 196, 146, 21);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Tela_Menu.class.getResource("/imagens/logo.png")));
		lblNewLabel.setBounds(1012, 62, 379, 116);
		contentPane.add(lblNewLabel);
		
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		btnComprarPassagens.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Tela_CadastrarPassageiro cadastrarPassageiro = new Tela_CadastrarPassageiro();
				cadastrarPassageiro.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize a tela
				cadastrarPassageiro.setVisible(true);
			
			}
		});
		
		btnAdicionarVoo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Tela_CadastroDeVoo cadastroDeVoo = new Tela_CadastroDeVoo();
				cadastroDeVoo.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize a tela
				cadastroDeVoo.setVisible(true);
			}
		});
	}
	
	public static void atualizaJTable(DefaultTableModel modelo, JTable table) {
		VooDAO v = VooDAO.getInstacia();
		ArrayList<Voo> listaVoo = v.listaVoo();
		for (Voo voo : listaVoo) {
			modelo.addRow(new Object[] { voo.getDestino(), voo.getHorario(), voo.getValor(), voo.getData() });
		}

		table = new JTable(modelo);
		modelo.fireTableDataChanged();
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
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Menu frame = new Tela_Menu();
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
