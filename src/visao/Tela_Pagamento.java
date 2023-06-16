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

public class Tela_Pagamento extends JFrame {

	private JPanel contentPane;
	private JTextField txtRecebeValorFixo;

	public Tela_Pagamento() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1150, 612);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFormasdPagamento = new JLabel("Formas de pagamento");
		lblFormasdPagamento.setBounds(133, 59, 642, 14);
		contentPane.add(lblFormasdPagamento);
		
		JLabel lblimgPix = new JLabel("ImgPix");
		lblimgPix.setBounds(182, 180, 111, 54);
		contentPane.add(lblimgPix);
		
		JLabel lblImgcartao = new JLabel("ImgCartao");
		lblImgcartao.setBounds(386, 180, 111, 54);
		contentPane.add(lblImgcartao);
		
		JLabel lblImgdinheiro = new JLabel("ImgDinheiro");
		lblImgdinheiro.setBounds(643, 180, 111, 54);
		contentPane.add(lblImgdinheiro);
		
		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Tela_Menu menu = new Tela_Menu();
				menu.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize a tela
				menu.setVisible(true);
			}
		});
		btnFinalizar.setBounds(158, 446, 89, 23);
		contentPane.add(btnFinalizar);
		
		JRadioButton rdbtnCartao = new JRadioButton("Cartao");
		rdbtnCartao.setBounds(374, 300, 109, 23);
		contentPane.add(rdbtnCartao);
		
		JRadioButton rdbtnDinheiro = new JRadioButton("Dinheiro");
		rdbtnDinheiro.setBounds(602, 300, 109, 23);
		contentPane.add(rdbtnDinheiro);
		
		JRadioButton rdbtnPix = new JRadioButton("Pix");
		rdbtnPix.setBounds(184, 300, 109, 23);
		contentPane.add(rdbtnPix);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSair.setBounds(1035, 11, 89, 23);
		contentPane.add(btnSair);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Tela_EscAssento escAssento = new Tela_EscAssento();
				escAssento.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize a tela
				escAssento.setVisible(true);
			}
		});
		btnVoltar.setBounds(10, 11, 89, 23);
		contentPane.add(btnVoltar);
		
		JLabel lblValorTotal = new JLabel("Valor total");
		lblValorTotal.setBounds(643, 59, 111, 54);
		contentPane.add(lblValorTotal);
		
		txtRecebeValorFixo = new JTextField();
		txtRecebeValorFixo.setText("Recebe valor fixo");
		txtRecebeValorFixo.setEnabled(false);
		txtRecebeValorFixo.setColumns(10);
		txtRecebeValorFixo.setBounds(707, 76, 261, 20);
		contentPane.add(txtRecebeValorFixo);
	}
}
