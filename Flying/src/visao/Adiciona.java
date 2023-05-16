package visao;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Adiciona extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	
                    Adiciona frame = new Adiciona();
                    frame.setVisible(true);
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Adiciona() {
    	setBackground(new Color(0, 64, 64));
    	setTitle("Tela de edição");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1171, 728);
        contentPane = new JPanel();
        contentPane.setBackground(Color.BLACK);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panelBotoes = new JPanel();
        panelBotoes.setBackground(Color.BLACK);
        panelBotoes.setBounds(731, 463, 468, 182);
        contentPane.add(panelBotoes);
        panelBotoes.setLayout(null);
        

        JButton btn1 = new JButton("Salvar");
        btn1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
        		Final f = new Final();
        		f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        		f.setVisible(true);
        	}
        });
        btn1.setForeground(new Color(0, 0, 0));
        btn1.setFont(new Font("Californian FB", Font.BOLD, 21));
        btn1.setBackground(new Color(128, 128, 128));
        btn1.setBounds(173, 93, 307, 82);
        //btn1.setBorder(new RounderBorder(10));
        panelBotoes.add(btn1);

        JLabel lblPreco1 = new JLabel("Adicione os dados do cliente:");
        lblPreco1.setForeground(Color.WHITE);
        lblPreco1.setFont(new Font("Cambria", Font.BOLD, 33));
        lblPreco1.setBounds(230, 74, 459, 46);
        contentPane.add(lblPreco1);
        
        textField = new JTextField();
        textField.setBackground(new Color(192, 192, 192));
        textField.setBounds(230, 190, 403, 30);
        contentPane.add(textField);
        textField.setColumns(10);
        
        textField_1 = new JTextField();
        textField_1.setBackground(new Color(192, 192, 192));
        textField_1.setColumns(10);
        textField_1.setBounds(230, 293, 403, 30);
        contentPane.add(textField_1);
        
        textField_2 = new JTextField();
        textField_2.setBackground(new Color(192, 192, 192));
        textField_2.setColumns(10);
        textField_2.setBounds(230, 400, 403, 30);
        contentPane.add(textField_2);
        
        textField_3 = new JTextField();
        textField_3.setBackground(new Color(192, 192, 192));
        textField_3.setColumns(10);
        textField_3.setBounds(230, 491, 403, 30);
        contentPane.add(textField_3);
        
        JLabel lblNomeCompleto = new JLabel("Nome completo:");
        lblNomeCompleto.setForeground(Color.WHITE);
        lblNomeCompleto.setFont(new Font("Californian FB", Font.BOLD, 21));
        lblNomeCompleto.setBounds(230, 154, 459, 46);
        contentPane.add(lblNomeCompleto);
        
        JLabel lblPreco1_1_1 = new JLabel("CPF:");
        lblPreco1_1_1.setForeground(Color.WHITE);
        lblPreco1_1_1.setFont(new Font("Californian FB", Font.BOLD, 21));
        lblPreco1_1_1.setBounds(226, 252, 459, 46);
        contentPane.add(lblPreco1_1_1);
        
        JLabel lblPreco1_1_1_1 = new JLabel("Quantidade           Peso da bagagem");
        lblPreco1_1_1_1.setForeground(Color.WHITE);
        lblPreco1_1_1_1.setFont(new Font("Californian FB", Font.BOLD, 21));
        lblPreco1_1_1_1.setBounds(262, 551, 459, 46);
        contentPane.add(lblPreco1_1_1_1);
        
        JLabel lblPreco1_1_1_1_1 = new JLabel("E-mail:");
        lblPreco1_1_1_1_1.setForeground(Color.WHITE);
        lblPreco1_1_1_1_1.setFont(new Font("Californian FB", Font.BOLD, 21));
        lblPreco1_1_1_1_1.setBounds(226, 452, 459, 46);
        contentPane.add(lblPreco1_1_1_1_1);
        
        textField_4 = new JTextField();
        textField_4.setBackground(new Color(192, 192, 192));
        textField_4.setColumns(10);
        textField_4.setBounds(246, 596, 131, 30);
        contentPane.add(textField_4);
        
        JLabel lblPreco1_1_1_1_1_1 = new JLabel("Telefone(celular):");
        lblPreco1_1_1_1_1_1.setForeground(Color.WHITE);
        lblPreco1_1_1_1_1_1.setFont(new Font("Californian FB", Font.BOLD, 21));
        lblPreco1_1_1_1_1_1.setBounds(226, 357, 459, 46);
        contentPane.add(lblPreco1_1_1_1_1_1);
        
        textField_5 = new JTextField();
        textField_5.setBackground(new Color(192, 192, 192));
        textField_5.setColumns(10);
        textField_5.setBounds(434, 596, 131, 30);
        contentPane.add(textField_5);
        
        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon(Adiciona.class.getResource("/imagens/usus.png")));
        lblNewLabel.setBounds(392, 139, 714, 184);
        contentPane.add(lblNewLabel);
    }
}