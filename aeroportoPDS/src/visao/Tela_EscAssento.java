package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.AbstractButton;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class Tela_EscAssento extends JFrame {

	private JPanel contentPane;
	private JTextField txtInfos;
	private ButtonGroup buttonGroup;
	private JRadioButton[] assentos;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	
	public Tela_EscAssento() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1147, 727);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(56, 124, 154));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(56, 124, 154));
		panel.setBounds(407, 111, 949, 590);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBackground(new Color(255, 128, 128));
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnVoltar.setBounds(370, 457, 144, 44);
		panel.add(btnVoltar);
		
		JButton btnSalvar = new JButton("Salvar\r\n");
		btnSalvar.setBackground(new Color(0, 255, 128));
		btnSalvar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSalvar.setBounds(168, 457, 144, 44);
		panel.add(btnSalvar);
		
		buttonGroup = new ButtonGroup();
		
		
		JRadioButton rdbtn08 = new JRadioButton("8");
		rdbtn08.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtn08.setBounds(490, 303, 109, 23);
		panel.add(rdbtn08);
		rdbtn08.setBackground(new Color(56, 124, 154));
		buttonGroup.add(rdbtn08);
		
		JRadioButton rdbtn07 = new JRadioButton("7");
		rdbtn07.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtn07.setBounds(490, 180, 109, 23);
		panel.add(rdbtn07);
		rdbtn07.setBackground(new Color(56, 124, 154));
		buttonGroup.add(rdbtn07);
		
		JRadioButton rdbtn05 = new JRadioButton("5");
		rdbtn05.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtn05.setBounds(342, 180, 109, 23);
		panel.add(rdbtn05);
		rdbtn05.setBackground(new Color(56, 124, 154));
		buttonGroup.add(rdbtn05);
		
		JRadioButton rdbtn06 = new JRadioButton("6");
		rdbtn06.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtn06.setBounds(342, 303, 109, 23);
		panel.add(rdbtn06);
		rdbtn06.setBackground(new Color(56, 124, 154));
		buttonGroup.add(rdbtn06);
		
		JRadioButton rdbtn03 = new JRadioButton("3");
		rdbtn03.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtn03.setBounds(203, 180, 109, 23);
		panel.add(rdbtn03);
		rdbtn03.setBackground(new Color(56, 124, 154));
		buttonGroup.add(rdbtn03);
		
		JRadioButton rdbtn04 = new JRadioButton("4");
		rdbtn04.setBounds(203, 304, 109, 23);
		panel.add(rdbtn04);
		rdbtn04.setBackground(new Color(56, 124, 154));
		buttonGroup.add(rdbtn04);
		
		JRadioButton rdbtn01 = new JRadioButton("1");
		rdbtn01.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtn01.setBounds(68, 180, 109, 23);
		panel.add(rdbtn01);
		rdbtn01.setBackground(new Color(56, 124, 154));
		buttonGroup.add(rdbtn01);
		
		JRadioButton rdbtn02 = new JRadioButton("2");
		rdbtn02.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtn02.setBounds(68, 303, 109, 23);
		panel.add(rdbtn02);
		rdbtn02.setBackground(new Color(56, 124, 154));
		buttonGroup.add(rdbtn02);
		
		
		
		JLabel lblEsc = new JLabel("Escolha um assento: ");
		lblEsc.setFont(new Font("Tahoma", Font.BOLD, 31));
		lblEsc.setBounds(78, 41, 425, 54);
		panel.add(lblEsc);
		
		JRadioButton rdbtn07_1 = new JRadioButton("9");
		rdbtn07_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtn07_1.setBackground(new Color(56, 124, 154));
		rdbtn07_1.setBounds(638, 180, 109, 23);
		panel.add(rdbtn07_1);
		buttonGroup.add(rdbtn07_1);
		
		JRadioButton rdbtn07_2 = new JRadioButton("10");
		rdbtn07_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtn07_2.setBackground(new Color(56, 124, 154));
		rdbtn07_2.setBounds(638, 303, 109, 23);
		panel.add(rdbtn07_2);
		buttonGroup.add(rdbtn07_2);
		
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String assentoSelecionado = "";
                for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
                    AbstractButton button = buttons.nextElement();
                    if (button.isSelected()) {
                    	button.setEnabled(false);
                        assentoSelecionado = button.getActionCommand();
                        break;
                        
                    }}
                JOptionPane.showMessageDialog(null, "Assento " + assentoSelecionado + " selecionado");

				dispose();
				Tela_Pagamento pagamento = new Tela_Pagamento();
				pagamento.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize a tela
				pagamento.setVisible(true);
			}
		});
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Tela_CadastrarPassageiro cadastrarPassageiro = new Tela_CadastrarPassageiro();
				cadastrarPassageiro.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize a tela
				cadastrarPassageiro.setVisible(true);	
			}
		});
	}
}
