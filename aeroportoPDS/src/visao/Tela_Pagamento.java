package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.AbstractButton;
import javax.swing.JOptionPane;
import java.util.Enumeration;
import javax.swing.ImageIcon;

public class Tela_Pagamento extends JFrame {

	private JPanel contentPane;
	private JTextField txtRecebeValorFixo;
	private ButtonGroup buttonGroup;

	public Tela_Pagamento() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1150, 746);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(56, 124, 154));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(56, 124, 154));
		panel.setBounds(323, 141, 959, 542);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBackground(new Color(255, 128, 128));
		btnVoltar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnVoltar.setBounds(329, 432, 143, 45);
		panel.add(btnVoltar);
		
		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.setBackground(new Color(0, 255, 128));
		btnFinalizar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnFinalizar.setBounds(49, 432, 143, 45);
		panel.add(btnFinalizar);
		
		buttonGroup = new ButtonGroup();
		
		JRadioButton rdbtnPix = new JRadioButton("Pix");
		rdbtnPix.setBackground(new Color(56, 124, 154));
		rdbtnPix.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnPix.setBounds(97, 317, 109, 23);
		panel.add(rdbtnPix);
		buttonGroup.add(rdbtnPix);
		
		JRadioButton rdbtnCartao = new JRadioButton("Cartao");
		rdbtnCartao.setBackground(new Color(56, 124, 154));
		rdbtnCartao.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnCartao.setBounds(312, 317, 109, 23);
		panel.add(rdbtnCartao);
		buttonGroup.add(rdbtnCartao);
		
		JRadioButton rdbtnDinheiro = new JRadioButton("Dinheiro");
		rdbtnDinheiro.setBackground(new Color(56, 124, 154));
		rdbtnDinheiro.setFont(new Font("Tahoma", Font.BOLD, 13));
		rdbtnDinheiro.setBounds(508, 317, 109, 23);
		panel.add(rdbtnDinheiro);
		buttonGroup.add(rdbtnDinheiro);
		
		JLabel lblValorTotal = new JLabel("Valor total:");
		lblValorTotal.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblValorTotal.setBounds(508, 10, 111, 54);
		panel.add(lblValorTotal);
		
		txtRecebeValorFixo = new JTextField();
		txtRecebeValorFixo.setForeground(new Color(0, 0, 0));
		txtRecebeValorFixo.setBackground(new Color(56, 124, 154));
		txtRecebeValorFixo.setBounds(616, 28, 261, 20);
		panel.add(txtRecebeValorFixo);
		txtRecebeValorFixo.setText("R$ : 400");
		txtRecebeValorFixo.setEnabled(false);
		txtRecebeValorFixo.setColumns(10);
		
		JLabel lblFormasdPagamento = new JLabel("Formas de pagamento");
		lblFormasdPagamento.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblFormasdPagamento.setBounds(31, 30, 362, 34);
		panel.add(lblFormasdPagamento);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Tela_Pagamento.class.getResource("/imagens/pixx.png")));
		lblNewLabel.setBounds(-78, 175, 330, 103);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Tela_Pagamento.class.getResource("/imagens/cardd.png")));
		lblNewLabel_1.setBounds(179, 191, 305, 103);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(Tela_Pagamento.class.getResource("/imagens/din.png")));
		lblNewLabel_2.setBounds(392, 191, 283, 103);
		panel.add(lblNewLabel_2);
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pagaseleciona = "";
                for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
                    AbstractButton button = buttons.nextElement();
                    if (button.isSelected()) {
                        pagaseleciona = button.getActionCommand();
                        break;
                    
                    }
                    JOptionPane.showMessageDialog(null, "Pagamento Realizado com sucesso via" + pagaseleciona);
                }
				dispose();
				Tela_Menu menu = new Tela_Menu();
				menu.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize a tela
				menu.setVisible(true);
			}
		});
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Tela_EscAssento escAssento = new Tela_EscAssento();
				escAssento.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize a tela
				escAssento.setVisible(true);
			}
		});
	}
}
