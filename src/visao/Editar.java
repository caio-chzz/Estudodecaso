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
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Editar extends JFrame {

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
                	
                    Editar frame = new Editar();
                    frame.setVisible(true);
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Editar() {
    	setBackground(new Color(0, 64, 64));
    	setTitle("Tela de edição");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1171, 728);
        BufferedImage bg = null;
		;
		try {
			bg = ImageIO.read(new File("src/imagens/fundoSalvador.png"));

		} catch (IOException e) {
			e.printStackTrace();
		}

		contentPane = new VBackGround(bg);
		contentPane.setBackground(new Color(0, 156, 156));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

        JLabel lblPreco1 = new JLabel("Edite os dados do cliente:");
        lblPreco1.setForeground(Color.BLACK);
        lblPreco1.setFont(new Font("Cambria", Font.BOLD, 33));
        lblPreco1.setBounds(353, 204, 459, 46);
        contentPane.add(lblPreco1);
        
        textField = new JTextField();
        textField.setForeground(Color.BLACK);
        textField.setBackground(new Color(192, 192, 192));
        textField.setBounds(353, 320, 403, 30);
        contentPane.add(textField);
        textField.setColumns(10);
        
        textField_1 = new JTextField();
        textField_1.setForeground(Color.BLACK);
        textField_1.setBackground(new Color(192, 192, 192));
        textField_1.setColumns(10);
        textField_1.setBounds(353, 423, 403, 30);
        contentPane.add(textField_1);
        
        textField_2 = new JTextField();
        textField_2.setForeground(Color.BLACK);
        textField_2.setBackground(new Color(192, 192, 192));
        textField_2.setColumns(10);
        textField_2.setBounds(353, 530, 403, 30);
        contentPane.add(textField_2);
        
        textField_3 = new JTextField();
        textField_3.setForeground(Color.BLACK);
        textField_3.setBackground(new Color(192, 192, 192));
        textField_3.setColumns(10);
        textField_3.setBounds(353, 621, 403, 30);
        contentPane.add(textField_3);
        
        JLabel lblNomeCompleto = new JLabel("Nome completo:");
        lblNomeCompleto.setForeground(Color.BLACK);
        lblNomeCompleto.setFont(new Font("Californian FB", Font.BOLD, 21));
        lblNomeCompleto.setBounds(353, 284, 459, 46);
        contentPane.add(lblNomeCompleto);
        
        JLabel lblPreco1_1_1 = new JLabel("CPF:");
        lblPreco1_1_1.setForeground(Color.BLACK);
        lblPreco1_1_1.setFont(new Font("Californian FB", Font.BOLD, 21));
        lblPreco1_1_1.setBounds(353, 386, 459, 46);
        contentPane.add(lblPreco1_1_1);
        
        JLabel lblPreco1_1_1_1 = new JLabel("Quantidade           Peso da bagagem");
        lblPreco1_1_1_1.setForeground(Color.BLACK);
        lblPreco1_1_1_1.setFont(new Font("Californian FB", Font.BOLD, 21));
        lblPreco1_1_1_1.setBounds(385, 681, 459, 46);
        contentPane.add(lblPreco1_1_1_1);
        
        JLabel lblPreco1_1_1_1_1 = new JLabel("E-mail:");
        lblPreco1_1_1_1_1.setForeground(Color.BLACK);
        lblPreco1_1_1_1_1.setFont(new Font("Californian FB", Font.BOLD, 21));
        lblPreco1_1_1_1_1.setBounds(349, 582, 459, 46);
        contentPane.add(lblPreco1_1_1_1_1);
        
        textField_4 = new JTextField();
        textField_4.setForeground(Color.BLACK);
        textField_4.setBackground(new Color(192, 192, 192));
        textField_4.setColumns(10);
        textField_4.setBounds(369, 726, 131, 30);
        contentPane.add(textField_4);
        
        JLabel lblPreco1_1_1_1_1_1 = new JLabel("Telefone(celular):");
        lblPreco1_1_1_1_1_1.setForeground(Color.BLACK);
        lblPreco1_1_1_1_1_1.setFont(new Font("Californian FB", Font.BOLD, 21));
        lblPreco1_1_1_1_1_1.setBounds(349, 487, 459, 46);
        contentPane.add(lblPreco1_1_1_1_1_1);
        
        textField_5 = new JTextField();
        textField_5.setForeground(Color.BLACK);
        textField_5.setBackground(new Color(192, 192, 192));
        textField_5.setColumns(10);
        textField_5.setBounds(557, 726, 131, 30);
        contentPane.add(textField_5);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setForeground(Color.BLACK);
        lblNewLabel.setIcon(new ImageIcon(Editar.class.getResource("/imagens/usus-removebg-preview.png")));
        lblNewLabel.setBounds(423, 49, 756, 223);
        contentPane.add(lblNewLabel);
        

        JButton btn1 = new JButton("Salvar");
        btn1.setBounds(927, 564, 307, 82);
        contentPane.add(btn1);
        btn1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
        		Final f = new Final();
        		f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        		f.setVisible(true);
        	}
        });
        btn1.setForeground(Color.BLACK);
        btn1.setFont(new Font("Californian FB", Font.BOLD, 21));
        btn1.setBackground(new Color(128, 128, 128));
    }
}

