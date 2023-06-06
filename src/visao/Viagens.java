package visao;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;

public class Viagens extends JFrame {

    private JPanel contentPane;
    private JList<String> estadosList;
    private DefaultListModel<String> listModel;
    
    public static void main(String[] args) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | javax.swing.UnsupportedLookAndFeelException ex) {
            System.err.println(ex);
        }

        EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    Viagens frame = new Viagens();
                    frame.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize a tela
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Viagens() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1158, 723);
        contentPane = new JPanel();
        contentPane.setBackground(Color.BLACK); // Definir o fundo preto
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblEstados = new JLabel("Estados:");
        lblEstados.setFont(new Font("Tahoma", Font.PLAIN, 24));
        lblEstados.setForeground(Color.WHITE);
        lblEstados.setBounds(400, 130, 262, 33);
        contentPane.add(lblEstados);

        listModel = new DefaultListModel<>();
        listModel.addElement("Acre");
        listModel.addElement("Alagoas");
        listModel.addElement("Amapá");
        listModel.addElement("Amazonas");
        listModel.addElement("Bahia");
        listModel.addElement("Ceará");
        listModel.addElement("Distrito Federal");
        listModel.addElement("Espírito Santo");
        listModel.addElement("Goiás");
        listModel.addElement("Maranhão");
        listModel.addElement("Mato Grosso");
        listModel.addElement("Mato Grosso do Sul");
        listModel.addElement("Minas Gerais");
        listModel.addElement("Pará");
        listModel.addElement("Paraíba");
        listModel.addElement("Paraná");
        listModel.addElement("Pernambuco");
        listModel.addElement("Piauí");
        listModel.addElement("Rio de Janeiro");
        listModel.addElement("Rio Grande do Norte");
        listModel.addElement("Rio Grande do Sul");
        listModel.addElement("Rondônia");
        listModel.addElement("Roraima");
        listModel.addElement("Santa Catarina");
        listModel.addElement("São Paulo");
        listModel.addElement("Sergipe");
        listModel.addElement("Tocantins");

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(400, 185, 300, 406);
        contentPane.add(scrollPane);
        
                estadosList = new JList<>(listModel);
                estadosList.setForeground(new Color(255, 255, 255));
                estadosList.setBackground(new Color(0, 0, 0));
                scrollPane.setViewportView(estadosList);
                estadosList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JButton btnConfirmar = new JButton("Confirmar Viagem");
        btnConfirmar.setBackground(new Color(128, 128, 128));
        btnConfirmar.setFont(new Font("Tahoma", Font.PLAIN, 16));
        btnConfirmar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int[] selectedIndices = estadosList.getSelectedIndices();
                StringBuilder selectedStates = new StringBuilder();
                for (int index : selectedIndices) {
                    selectedStates.append(listModel.getElementAt(index)).append(", ");
                }
                String message = "Você selecionou os seguintes estados para a viagem:\n" + selectedStates.toString();
                System.out.println(message);
                
                // Redirecionar para a tela de horários (Classe Horarios)
                Horarios horarios = new Horarios();
                horarios.setExtendedState(JFrame.MAXIMIZED_BOTH);
                horarios.setVisible(true);
                dispose();
            }
        });
        btnConfirmar.setBounds(783, 500, 191, 47);
        contentPane.add(btnConfirmar);
        
        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon(Viagens.class.getResource("/imagens/Design sem nome (1).png")));
        lblNewLabel.setBounds(644, 184, 329, 332);
        contentPane.add(lblNewLabel);
    }
}
