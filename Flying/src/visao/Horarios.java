package visao;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
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

public class Horarios extends JFrame {

    private JPanel contentPane;
    private JList<String> horariosList;
    private DefaultListModel<String> listModel;

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

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Horarios frame = new Horarios();
                    frame.setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize a tela
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Horarios() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 730, 420);
        contentPane = new JPanel();
        contentPane.setBackground(Color.BLACK); // Definir o fundo preto
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new GridBagLayout());

        JLabel lblHorarios = new JLabel("Horários:");
        lblHorarios.setForeground(Color.WHITE); // Definir a cor da fonte como branca
        lblHorarios.setFont(new Font("Tahoma", Font.PLAIN, 16));
        GridBagConstraints gbc_lblHorarios = new GridBagConstraints();
        gbc_lblHorarios.gridx = 0;
        gbc_lblHorarios.gridy = 0;
        gbc_lblHorarios.insets = new Insets(0, 0, 20, 0);
        contentPane.add(lblHorarios, gbc_lblHorarios);

        listModel = new DefaultListModel<>();
        // Adicione os horários à listModel
        listModel = new DefaultListModel<String>();
        listModel.addElement("08:00");
        listModel.addElement("10:00");
        listModel.addElement("14:00");
        listModel.addElement("16:00");
        listModel.addElement("18:00");
        listModel.addElement("20:00");
        listModel.addElement("22:00");
        listModel.addElement("09:30");
        listModel.addElement("11:30");
        listModel.addElement("15:30");
        listModel.addElement("17:30");
        listModel.addElement("19:30");
        listModel.addElement("21:30");
        listModel.addElement("23:30");
        listModel.addElement("12:00");
        listModel.addElement("13:30");

        horariosList = new JList<>(listModel);
        horariosList.setForeground(new Color(255, 255, 255));
        horariosList.setBackground(new Color(0, 0, 0));
        horariosList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        horariosList.setFont(new Font("Tahoma", Font.PLAIN, 14));
        JScrollPane scrollPane = new JScrollPane(horariosList);
        GridBagConstraints gbc_scrollPane = new GridBagConstraints();
        gbc_scrollPane.gridx = 0;
        gbc_scrollPane.gridy = 1;
        gbc_scrollPane.fill = GridBagConstraints.BOTH;
        gbc_scrollPane.insets = new Insets(0, 0, 20, 0);
        gbc_scrollPane.weightx = 1.0;
        gbc_scrollPane.weighty = 1.0;
        contentPane.add(scrollPane, gbc_scrollPane);
        
                JButton btnConfirmar = new JButton("Confirmar ");
                btnConfirmar.setBackground(new Color(128, 128, 128));
                btnConfirmar.setFont(new Font("Tahoma", Font.PLAIN, 14));
                btnConfirmar.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        int selectedIndex = horariosList.getSelectedIndex();
                        if (selectedIndex != -1) {
                            String horarioSelecionado = listModel.getElementAt(selectedIndex);
                            dispose(); 
                            Preco ll = new Preco();
                            ll.setExtendedState(JFrame.MAXIMIZED_BOTH);
                            ll.setVisible(true);
                        }
                    }
                });
                GridBagConstraints gbc_btnConfirmar = new GridBagConstraints();
                gbc_btnConfirmar.gridx = 0;
                gbc_btnConfirmar.gridy = 3;
                gbc_btnConfirmar.insets = new Insets(20, 0, 5, 0);
                contentPane.add(btnConfirmar, gbc_btnConfirmar);
    }

    private void exibirHorarioSelecionado(String horario) {
        JFrame frame = new JFrame("Horário Selecionado");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 450, 300);
        frame.getContentPane().setBackground(Color.WHITE);
        frame.getContentPane().setLayout(new GridBagLayout());

        JLabel lblHorarioSelecionado = new JLabel("Horário Selecionado:");
        lblHorarioSelecionado.setFont(new Font("Tahoma", Font.PLAIN, 16));
        GridBagConstraints gbc_lblHorarioSelecionado = new GridBagConstraints();
        gbc_lblHorarioSelecionado.gridx = 0;
        gbc_lblHorarioSelecionado.gridy = 0;
        gbc_lblHorarioSelecionado.insets = new Insets(0, 0, 20, 0);
        frame.getContentPane().add(lblHorarioSelecionado, gbc_lblHorarioSelecionado);

        JLabel lblHorario = new JLabel(horario);
        lblHorario.setFont(new Font("Tahoma", Font.PLAIN, 16));
        GridBagConstraints gbc_lblHorario = new GridBagConstraints();
        gbc_lblHorario.gridx = 0;
        gbc_lblHorario.gridy = 1;
        frame.getContentPane().add(lblHorario, gbc_lblHorario);

        frame.setVisible(true);
    }
}
       
