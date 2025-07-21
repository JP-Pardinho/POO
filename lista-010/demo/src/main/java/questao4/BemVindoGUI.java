package questao4;

import javax.swing.*;
import java.awt.event.*;

public class BemVindoGUI {
    public static void main(String[] args) {
        // Cria a janela
        JFrame frame = new JFrame("Aplicação de Boas-Vindas");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Painel para organizar componentes
        JPanel panel = new JPanel();
        frame.add(panel);

        // Campo de texto para o nome
        JLabel label = new JLabel("Digite seu nome:");
        panel.add(label);
        JTextField textField = new JTextField(20);
        panel.add(textField);

        // Botão "Enviar"
        JButton button = new JButton("Enviar");
        panel.add(button);

        // Ação do botão
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = textField.getText();
                JOptionPane.showMessageDialog(frame, "Seja bem-vindo, " + nome + "!");
            }
        });

        frame.setVisible(true);
    }
}