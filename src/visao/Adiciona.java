package visao;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.text.MaskFormatter;

public class Adiciona extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JTextField txtCPF;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private MaskFormatter mascaraCPF;

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
        setBounds(100, 100, 1339, 728);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(143, 226, 231));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panelBotoes = new JPanel();
        panelBotoes.setBackground(new Color(0, 255, 255));
        panelBotoes.setBounds(834, 551, 305, 82);
        contentPane.add(panelBotoes);
        panelBotoes.setLayout(null);
        

        JButton btnSalvar = new JButton("Salvar");
        btnSalvar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
        		Final f = new Final();
        		f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        		f.setVisible(true);
        	}
        });
        btnSalvar.setForeground(new Color(0, 0, 0));
        btnSalvar.setFont(new Font("Californian FB", Font.BOLD, 21));
        btnSalvar.setBackground(new Color(128, 128, 128));
        btnSalvar.setBounds(0, 0, 307, 82);
        //btn1.setBorder(new RounderBorder(10));
        panelBotoes.add(btnSalvar);

        JLabel lblPreco1 = new JLabel("Adicione os dados do cliente:");
        lblPreco1.setForeground(Color.BLACK);
        lblPreco1.setFont(new Font("Cambria", Font.BOLD, 33));
        lblPreco1.setBounds(230, 74, 459, 46);
        contentPane.add(lblPreco1);
        
        textField = new JTextField();
        textField.setForeground(Color.BLACK);
        textField.setBackground(new Color(192, 192, 192));
        textField.setBounds(230, 190, 403, 30);
        contentPane.add(textField);
        textField.setColumns(10);
        
        txtCPF = new JTextField();
        txtCPF.setForeground(Color.BLACK);
        txtCPF.setBackground(new Color(192, 192, 192));
        txtCPF.setColumns(10);
        txtCPF.setBounds(230, 293, 403, 30);
        contentPane.add(txtCPF);
        
        textField_2 = new JTextField();
        textField_2.setForeground(Color.BLACK);
        textField_2.setBackground(new Color(192, 192, 192));
        textField_2.setColumns(10);
        textField_2.setBounds(230, 400, 403, 30);
        contentPane.add(textField_2);
        
        textField_3 = new JTextField();
        textField_3.setForeground(Color.BLACK);
        textField_3.setBackground(new Color(192, 192, 192));
        textField_3.setColumns(10);
        textField_3.setBounds(230, 491, 403, 30);
        contentPane.add(textField_3);
        
        JLabel lblNomeCompleto = new JLabel("Nome completo:");
        lblNomeCompleto.setForeground(Color.BLACK);
        lblNomeCompleto.setFont(new Font("Californian FB", Font.BOLD, 21));
        lblNomeCompleto.setBounds(230, 154, 459, 46);
        contentPane.add(lblNomeCompleto);
        
        JLabel lblCPF = new JLabel("CPF:");
        lblCPF.setForeground(Color.BLACK);
        lblCPF.setFont(new Font("Californian FB", Font.BOLD, 21));
        lblCPF.setBounds(226, 252, 459, 46);
        contentPane.add(lblCPF);
        
        /*****************************/
        mascaraCPF = null;
        try {
        	mascaraCPF = new MaskFormatter("###.###.###-##");
        } catch(ParseException e) {
        	e.printStackTrace();
        }
        txtCPF = new JFormattedTextField(mascaraCPF);
        /*****************************/
        
        JLabel lblPreco1_1_1_1 = new JLabel("Quantidade           Peso da bagagem");
        lblPreco1_1_1_1.setForeground(Color.BLACK);
        lblPreco1_1_1_1.setFont(new Font("Californian FB", Font.BOLD, 21));
        lblPreco1_1_1_1.setBounds(262, 551, 459, 46);
        contentPane.add(lblPreco1_1_1_1);
        
        JLabel lblPreco1_1_1_1_1 = new JLabel("E-mail:");
        lblPreco1_1_1_1_1.setForeground(Color.BLACK);
        lblPreco1_1_1_1_1.setFont(new Font("Californian FB", Font.BOLD, 21));
        lblPreco1_1_1_1_1.setBounds(226, 452, 459, 46);
        contentPane.add(lblPreco1_1_1_1_1);
        
        textField_4 = new JTextField();
        textField_4.setForeground(Color.BLACK);
        textField_4.setBackground(new Color(192, 192, 192));
        textField_4.setColumns(10);
        textField_4.setBounds(246, 596, 131, 30);
        contentPane.add(textField_4);
        
        JLabel lblPreco1_1_1_1_1_1 = new JLabel("Telefone(celular):");
        lblPreco1_1_1_1_1_1.setForeground(Color.BLACK);
        lblPreco1_1_1_1_1_1.setFont(new Font("Californian FB", Font.BOLD, 21));
        lblPreco1_1_1_1_1_1.setBounds(226, 357, 459, 46);
        contentPane.add(lblPreco1_1_1_1_1_1);
        
        textField_5 = new JTextField();
        textField_5.setForeground(Color.BLACK);
        textField_5.setBackground(new Color(192, 192, 192));
        textField_5.setColumns(10);
        textField_5.setBounds(434, 596, 131, 30);
        contentPane.add(textField_5);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setForeground(Color.BLACK);
        lblNewLabel.setIcon(new ImageIcon(Adiciona.class.getResource("/imagens/usus-removebg-preview.png")));
        lblNewLabel.setBounds(392, 139, 714, 184);
        contentPane.add(lblNewLabel);
    }
}