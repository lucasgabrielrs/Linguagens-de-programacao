import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;

public class LotoFacilGUI extends JFrame{
    private JPanel painel = new JPanel();
    private JButton JButtonAposta1 = new JButton("Apostar de 0 a 100");
    private JButton JButtonAposta2 = new JButton("Apostar de A a Z");
    private JButton JButtonAposta3 = new JButton("Apostar par ou impar");
    public LotoFacilGUI() {
        this.setTitle("** LotoFácil - Interface Gráfica");
        this.setSize(400,200);
        this.setLocationRelativeTo(null);
        painel.setLayout(new FlowLayout(FlowLayout.CENTER, 100,20));
        painel.setBackground(new Color(255,255,255));
        this.setVisible(true);

        add(painel);
        painel.add(JButtonAposta1);
        painel.add(JButtonAposta2);
        painel.add(JButtonAposta3);

        JButtonAposta1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aposta1();
            }
        });

        JButtonAposta2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aposta2();
            }
        });

        JButtonAposta3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aposta3();
            }
        });

    }

    private void aposta3() {
        Object numeroApostadoParouImpar = JOptionPane.showInputDialog
                (null,"Digite um número par ou impar: ",
                        "Aposta 3", JOptionPane.INFORMATION_MESSAGE, null, null,"");

        int numeroApostadoParImparInt = Integer.parseInt(numeroApostadoParouImpar.toString());

        if (numeroApostadoParImparInt % 2 == 0){
            JOptionPane.showMessageDialog(null,
                    "Parabéns!!! Você ganhou 100 reais!",
                    "Aposta 3",
                    JOptionPane.INFORMATION_MESSAGE,
                    null);
        }else{
            JOptionPane.showMessageDialog(null,
                    "Que pena! O número digitado foi impar e a premiação foi para numeros pares.",
                    "Aposta 3",
                    JOptionPane.INFORMATION_MESSAGE,
                    null);
        }
    }

    private static void aposta1() {
        ImageIcon icon = new ImageIcon("sorteio.png");
        Object numeroApostado = JOptionPane.showInputDialog
                (null,"Digite um número de 0 a 100: ",
                        "Aposta 1", JOptionPane.INFORMATION_MESSAGE, icon, null,"");
        int numeroApostadoInt = Integer.parseInt(numeroApostado.toString());
        Random rdn = new Random();
        int numeroSorteado = rdn.nextInt(101);
        if (numeroApostadoInt < 0 || numeroApostadoInt > 100){
            JOptionPane.showMessageDialog(null,
                    "Número digitado invalido",
                    "Aposta 1",
                    JOptionPane.INFORMATION_MESSAGE,
                    icon);
        }else {
            if ( numeroApostadoInt == numeroSorteado){
                JOptionPane.showMessageDialog
                        (null,
                                "Você ganhou mil reais!",
                                "Aposta 1",
                                JOptionPane.INFORMATION_MESSAGE,
                                icon);
            }else{
                JOptionPane.showMessageDialog(null,"Você perdeu, o número sorteado foi "+numeroSorteado, "Aposta 1", JOptionPane.INFORMATION_MESSAGE,icon);
            }
        }
    }
    private static void aposta2() {
        Object letraApostadaObj = JOptionPane.showInputDialog(
                null,
                "Digite uma letra de A a Z: ",
                "Aposta 2",
                JOptionPane.INFORMATION_MESSAGE);

        if (letraApostadaObj == null) {
            return;
        }

        String letraApostadaStr = letraApostadaObj.toString();

        if (letraApostadaStr.isEmpty() || letraApostadaStr.length() > 1 || !Character.isLetter(letraApostadaStr.charAt(0))) {
            JOptionPane.showMessageDialog(
                    null,
                    "Letra digitada inválida",
                    "Aposta 2",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        char letraApostada = Character.toUpperCase(letraApostadaStr.charAt(0));

        char letraPremiada = 'L';

        if (letraApostada == letraPremiada) {
            JOptionPane.showMessageDialog(
                    null,
                    "Você ganhou mil reais!",
                    "Aposta 2",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Você perdeu, a letra premiada era: " + letraPremiada,
                    "Aposta 2",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
