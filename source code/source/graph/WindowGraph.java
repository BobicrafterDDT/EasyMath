package source.graph;

import source.programs.others.ImageWriter;
import source.programs.math.EasyMath;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import javax.swing.*;
import source.html.OpenPage;
import source.main.Main;
import source.programs.others.Fraction;

public class WindowGraph implements ActionListener {

    public Main messages = new Main();

    public WindowGraph() {
    }

    public void startMenu() {
        mathGUI math = new mathGUI();
        otherProg op = new otherProg();
        JFrame fr = new JFrame("Start Menu Dialog");
        JButton but1 = new JButton("start math?");
        JButton but2 = new JButton("Other Programs");
        JButton but3 = new JButton("Documentation");
        JButton but5 = new JButton("Close");
        JPanel pan = new JPanel();
        
        Dimension b1 = but1.getPreferredSize();
        Dimension b2 = but2.getPreferredSize();
        Dimension b3 = but3.getPreferredSize();
        Dimension b5 = but5.getPreferredSize();
        
        but1.setBounds(200, 20, b1.width, b1.height);
        but2.setBounds(200, 50, b2.width, b2.height);
        but3.setBounds(200, 80, b3.width, b3.height);
        but5.setBounds(200, 110, b5.width, b5.height);
        
        
        pan.setLayout(null);
        fr.add(pan);
        pan.add(but1);
        pan.add(but2);
        pan.add(but3);
        pan.add(but5);
        
        pan.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        fr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        fr.setSize(500, 200);
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);
        
        but1.addActionListener((ActionEvent evt) -> {
                math.mathChooseMenu();
                fr.dispose();
            });
        but2.addActionListener((ActionEvent evt) -> {
                op.opChooseMenu();
                fr.dispose();
            });
        but3.addActionListener((ActionEvent evt) -> {
                try {
                OpenPage opP = new OpenPage();
                opP.openWebPage();
                } catch (IOException e) {
                   new Main(e.getMessage());
                }
            });
        but5.addActionListener((ActionEvent evt) -> {
                new Main("Have a nice day! - The Engine");
                fr.dispose();
            });
        fr.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                if (keyCode == KeyEvent.VK_F1) {
                    new Main("Have a nice day! - The Engine");
                    fr.dispose();
                }
                if (keyCode == KeyEvent.VK_F2) {
                    math.mathChooseMenu();
                    fr.dispose();
                }
                if (keyCode == KeyEvent.VK_F3) {
                    op.opChooseMenu();
                    fr.dispose();
                }
            }
        });
    }

    class mathGUI {
        public mathGUI() {
        }
        public void mathChooseMenu() {
            JFrame fr = new JFrame("Math Menu Dialog");
            JButton but1 = new JButton("FBGD with two numbers");
            JButton but2 = new JButton("FBGD with three numbers");
            JButton but3 = new JButton("FFSR");
            JButton but4 = new JButton("FTSR");
            JButton but5 = new JButton("Gaus");
            JButton but6 = new JButton("FEON");
            JButton but7 = new JButton("LCM");
            JButton but8 = new JButton("FAA");
            JButton but9 = new JButton("FSA");
            JButton but10 = new JButton("FMA");
            JButton but11 = new JButton("FDA");
            JButton but12 = new JButton("Random");
            JButton exitBut = new JButton("Go back");
            JPanel pan = new JPanel();

            Dimension b1 = but1.getPreferredSize();
            Dimension b2 = but2.getPreferredSize();
            Dimension b3 = but3.getPreferredSize();
            Dimension b4 = but4.getPreferredSize();
            Dimension b5 = but5.getPreferredSize();
            Dimension b6 = but6.getPreferredSize();
            Dimension b7 = but7.getPreferredSize();
            Dimension b8 = but8.getPreferredSize();
            Dimension b9 = but9.getPreferredSize();
            Dimension b10 = but10.getPreferredSize();
            Dimension b11 = but11.getPreferredSize();
            Dimension b12 = but12.getPreferredSize();
            Dimension exB = exitBut.getPreferredSize();

            but1.setBounds(60, 20, b1.width, b1.height);
            but2.setBounds(b1.width + 65, 20, b2.width, b2.height);
            but3.setBounds(20, 50, b3.width, b3.height);
            but4.setBounds(90, 50, b4.width, b4.height);
            but5.setBounds(160, 50, b5.width, b5.height);
            but6.setBounds(230, 50, b6.width, b6.height);
            but7.setBounds(300, 50, b7.width, b7.height);
            but8.setBounds(365, 50, b8.width, b8.height);
            but9.setBounds(20, 80, b9.width, b9.height);
            but10.setBounds(85, 80, b10.width, b10.height);
            but11.setBounds(150, 80, b11.width, b11.height);
            but12.setBounds(215, 80, b12.width, b12.height);
            exitBut.setBounds(200, 430, exB.width, exB.height);

            pan.setLayout(null);
            fr.add(pan);
            pan.add(but1);
            pan.add(but2);
            pan.add(but3);
            pan.add(but4);
            pan.add(but5);
            pan.add(but6);
            pan.add(but7);
            pan.add(but8);
            pan.add(but9);
            pan.add(but10);
            pan.add(but11);
            pan.add(but12);
            pan.add(exitBut);
            pan.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            fr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            fr.setSize(500, 500);
            fr.setLocationRelativeTo(null);
            fr.setVisible(true);

            exitBut.addActionListener((ActionEvent evt) -> {
                startMenu();
                fr.dispose();
            });
            but1.addActionListener((ActionEvent evt) -> {
                FGBD2Num();
                fr.dispose();
            });
            but2.addActionListener((ActionEvent evt) -> {
                FGBD3Num();
                fr.dispose();
            });
            but3.addActionListener((ActionEvent evt) -> {
                FFSR();
                fr.dispose();
            });
            but4.addActionListener((ActionEvent evt) -> {
                FTSR();
                fr.dispose();
            });
            but5.addActionListener((ActionEvent evt) -> {
                Gaus();
                fr.dispose();
            });
            but6.addActionListener((ActionEvent evt) -> {
                FEON();
                fr.dispose();
            });
            but7.addActionListener((ActionEvent evt) -> {
                LCM();
                fr.dispose();
            });
            but8.addActionListener((ActionEvent evt) -> {
                FAA();
                fr.dispose();
            });
            but9.addActionListener((ActionEvent evt) -> {
                FSA();
                fr.dispose();
            });
            but10.addActionListener((ActionEvent evt) -> {
                FMA();
                fr.dispose();
            });
            but11.addActionListener((ActionEvent evt) -> {
                FDA();
                fr.dispose();
            });
            but12.addActionListener((ActionEvent evt) -> {
                Random();
                fr.dispose();
            });
        }

        public void FGBD2Num() {
            JFrame fr = new JFrame("Math Menu Dialog");
            JTextField txtF1 = new JTextField(20);
            JTextField txtF2 = new JTextField(20);
            JButton but = new JButton("Run");
            JButton butt = new JButton("Ready?");
            JButton exitBut = new JButton("Go back");
            JLabel out = new JLabel();
            JPanel pan = new JPanel();
            JPanel gobackPan = new JPanel();

            fr.setSize(580, 150);
            fr.setResizable(false);
            fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fr.setVisible(true);
            fr.setLocationRelativeTo(null);
            fr.setLayout(new BorderLayout());
            but.setVisible(false);
            out.setVisible(false);

            fr.add(pan);
            fr.add(gobackPan, BorderLayout.SOUTH);
            gobackPan.add(exitBut);
            pan.add(txtF1);
            pan.add(txtF2);
            pan.add(butt);
            pan.add(but);
            pan.add(out);

            exitBut.addActionListener((ActionEvent evt) -> {
                mathChooseMenu();
                fr.dispose();
            });

            butt.addActionListener((ActionEvent e) -> {
                but.setVisible(true);
                butt.setVisible(false);
            });

            but.addActionListener((ActionEvent evt) -> {
                EasyMath ea = new EasyMath();
                String con1 = txtF1.getText();
                String con2 = txtF2.getText();
                int num1 = Integer.parseInt(con1);
                int num2 = Integer.parseInt(con2);
                float output = ea.FBGD(num1, num2);
                if (num1 > 2147483647 || num2 > 2147483647) {
                    throw new NumberFormatException("Too big of an number");
                }
                out.setText(String.valueOf(output));
                new Main(String.valueOf(output));
                out.setVisible(true);
            });
        }

        public void FGBD3Num() {
            JFrame fr = new JFrame("Math Menu Dialog");
            JTextField txtF1 = new JTextField(20);
            JTextField txtF2 = new JTextField(20);
            JTextField txtF3 = new JTextField(20);
            JButton but = new JButton("Run");
            JButton butt = new JButton("Ready?");
            JButton exitBut = new JButton("Go back");
            JLabel out = new JLabel();
            JPanel pan = new JPanel();
            JPanel gobackPan = new JPanel();

            fr.setSize(800, 150);
            fr.setResizable(false);
            fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fr.setVisible(true);
            fr.setLocationRelativeTo(null);
            fr.setLayout(new BorderLayout());
            but.setVisible(false);
            out.setVisible(false);

            fr.add(pan);
            fr.add(gobackPan, BorderLayout.SOUTH);
            gobackPan.add(exitBut);
            pan.add(txtF1);
            pan.add(txtF2);
            pan.add(txtF3);
            pan.add(butt);
            pan.add(but);
            pan.add(out);

            exitBut.addActionListener((ActionEvent evt) -> {
                mathChooseMenu();
                fr.dispose();
            });
            butt.addActionListener((ActionEvent e) -> {
                but.setVisible(true);
                butt.setVisible(false);
            });
            but.addActionListener((ActionEvent evt) -> {
                EasyMath ea = new EasyMath();
                String con1 = txtF1.getText();
                String con2 = txtF2.getText();
                String con3 = txtF3.getText();
                int num1 = Integer.parseInt(con1);
                int num2 = Integer.parseInt(con2);
                int num3 = Integer.parseInt(con3);
                if (num1 > 2147483647 || num2 > 2147483647 || num3 > 2147483647) {
                    throw new NumberFormatException("Too big of an number");
                }
                float output = ea.FBGD(num1, num2, num3);
                out.setText(String.valueOf(output));
                new Main(String.valueOf(output));
                out.setVisible(true);
            });
        }

        public void FFSR() {
            JFrame fr = new JFrame("Math Menu Dialog");
            JTextField txtF1 = new JTextField(20);
            JTextField txtF2 = new JTextField(20);
            JButton but = new JButton("Run");
            JButton butt = new JButton("Ready?");
            JLabel out = new JLabel();
            JButton exitBut = new JButton("Go back");
            JPanel gobackPan = new JPanel();
            JPanel pan = new JPanel();

            fr.setSize(580, 150);
            fr.setResizable(false);
            fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fr.setVisible(true);
            fr.setLocationRelativeTo(null);
            fr.setLayout(new BorderLayout());
            but.setVisible(false);
            out.setVisible(false);

            fr.add(pan);
            fr.add(gobackPan, BorderLayout.SOUTH);
            gobackPan.add(exitBut);
            pan.add(txtF1);
            pan.add(txtF2);
            pan.add(butt);
            pan.add(but);
            pan.add(out);

            exitBut.addActionListener((ActionEvent evt) -> {
                mathChooseMenu();
                fr.dispose();
            });
            butt.addActionListener((ActionEvent e) -> {
                but.setVisible(true);
                butt.setVisible(false);
            });
            but.addActionListener((ActionEvent evt) -> {
                EasyMath ea = new EasyMath();
                String con1 = txtF1.getText();
                String con2 = txtF2.getText();
                int num1 = Integer.parseInt(con1);
                int num2 = Integer.parseInt(con2);
                int output = ea.FFSR(num1, num2);
                if (num1 > 2147483647 || num2 > 2147483647) {
                    out.setVisible(true);
                    throw new NumberFormatException("Too big of an number");
                }
                out.setText(String.valueOf(output));
                new Main(String.valueOf(output));
                out.setVisible(true);
            });
        }

        public void FTSR() {
            JFrame fr = new JFrame("Math Menu Dialog");
            JTextField txtF1 = new JTextField(20);
            JTextField txtF2 = new JTextField(20);
            JLabel out = new JLabel();
            JButton but = new JButton("Run");
            JButton butt = new JButton("Ready?");
            JButton exitBut = new JButton("Go back");
            JPanel gobackPan = new JPanel();
            JPanel pan = new JPanel();

            fr.setSize(580, 150);
            fr.setResizable(false);
            fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fr.setVisible(true);
            fr.setLocationRelativeTo(null);
            fr.setLayout(new BorderLayout());
            but.setVisible(false);
            out.setVisible(false);

            fr.add(pan);
            fr.add(gobackPan, BorderLayout.SOUTH);
            gobackPan.add(exitBut);
            pan.add(txtF1);
            pan.add(txtF2);
            pan.add(butt);
            pan.add(but);
            pan.add(out);

            exitBut.addActionListener((ActionEvent evt) -> {
                mathChooseMenu();
                fr.dispose();
            });
            butt.addActionListener((ActionEvent e) -> {
                but.setVisible(true);
                butt.setVisible(false);
            });
            but.addActionListener((ActionEvent evt) -> {
                EasyMath ea = new EasyMath();
                String con1 = txtF1.getText();
                String con2 = txtF2.getText();
                int num1 = Integer.parseInt(con1);
                int num2 = Integer.parseInt(con2);
                int output = ea.FTSR(num1, num2);
                if (num1 > 2147483647 || num2 > 2147483647) {
                    throw new NumberFormatException("Too big of an number");
                }
                out.setText(String.valueOf(output));
                new Main(String.valueOf(output));
                out.setVisible(true);
            });
        }

        public void Gaus() {
            JFrame fr = new JFrame("Math Menu Dialog");
            JTextField txtF1 = new JTextField(20);
            JTextField txtF2 = new JTextField(20);
            JLabel out = new JLabel();
            JButton but = new JButton("Run");
            JButton butt = new JButton("Ready?");
            JButton exitBut = new JButton("Go back");
            JPanel gobackPan = new JPanel();
            JPanel pan = new JPanel();

            fr.setSize(580, 150);
            fr.setResizable(false);
            fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fr.setVisible(true);
            fr.setLocationRelativeTo(null);
            fr.setLayout(new BorderLayout());
            but.setVisible(false);
            out.setVisible(false);

            fr.add(pan);
            fr.add(gobackPan, BorderLayout.SOUTH);
            gobackPan.add(exitBut);
            pan.add(txtF1);
            pan.add(txtF2);
            pan.add(butt);
            pan.add(but);
            pan.add(out);

            exitBut.addActionListener((ActionEvent evt) -> {
                mathChooseMenu();
                fr.dispose();
            });
            butt.addActionListener((ActionEvent e) -> {
                but.setVisible(true);
                butt.setVisible(false);
            });
            but.addActionListener((ActionEvent evt) -> {
                EasyMath ea = new EasyMath();
                String con1 = txtF1.getText();
                String con2 = txtF2.getText();
                int num1 = Integer.parseInt(con1);
                int num2 = Integer.parseInt(con2);
                int output = ea.Gaus(num1, num2);
                if (num1 > 2147483647 || num2 > 2147483647) {
                    throw new NumberFormatException("Too big of an number");
                }
                out.setText(String.valueOf(output));
                new Main(String.valueOf(output));
                out.setVisible(true);
            });
        }

        public void FEON() {
            JFrame fr = new JFrame("Math Menu Dialog");
            JTextField txtF1 = new JTextField(20);
            JTextField txtF2 = new JTextField(20);
            JLabel out = new JLabel();
            JButton but = new JButton("Run");
            JButton butt = new JButton("Ready?");
            JButton exitBut = new JButton("Go back");
            JPanel gobackPan = new JPanel();
            JPanel pan = new JPanel();

            fr.setSize(580, 150);
            fr.setResizable(false);
            fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fr.setVisible(true);
            fr.setLocationRelativeTo(null);
            fr.setLayout(new BorderLayout());
            but.setVisible(false);
            out.setVisible(false);

            fr.add(pan);
            fr.add(gobackPan, BorderLayout.SOUTH);
            gobackPan.add(exitBut);
            pan.add(txtF1);
            pan.add(txtF2);
            pan.add(butt);
            pan.add(but);
            pan.add(out);

            exitBut.addActionListener((ActionEvent evt) -> {
                mathChooseMenu();
                fr.dispose();
            });
            butt.addActionListener((ActionEvent e) -> {
                but.setVisible(true);
                butt.setVisible(false);
            });
            but.addActionListener((ActionEvent evt) -> {
                EasyMath ea = new EasyMath();
                String con1 = txtF1.getText();
                String con2 = txtF2.getText();
                int num1 = Integer.parseInt(con1);
                int num2 = Integer.parseInt(con2);
                int output = ea.FEON(num1, num2);
                if (num1 > 2147483647 || num2 > 2147483647) {
                    throw new NumberFormatException("Too big of an number");
                }
                out.setText(String.valueOf(output));
                new Main(String.valueOf(output));
                out.setVisible(true);
            });
        }
        
        public void LCM() {
            JFrame fr = new JFrame("Math Menu Dialog");
            JTextField txtF1 = new JTextField(20);
            JTextField txtF2 = new JTextField(20);
            JLabel out = new JLabel();
            JButton but = new JButton("Run");
            JButton butt = new JButton("Ready?");
            JButton exitBut = new JButton("Go back");
            JPanel gobackPan = new JPanel();
            JPanel pan = new JPanel();

            fr.setSize(580, 150);
            fr.setResizable(false);
            fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fr.setVisible(true);
            fr.setLocationRelativeTo(null);
            fr.setLayout(new BorderLayout());
            but.setVisible(false);
            out.setVisible(false);

            fr.add(pan);
            fr.add(gobackPan, BorderLayout.SOUTH);
            gobackPan.add(exitBut);
            pan.add(txtF1);
            pan.add(txtF2);
            pan.add(butt);
            pan.add(but);
            pan.add(out);

            exitBut.addActionListener((ActionEvent evt) -> {
                mathChooseMenu();
                fr.dispose();
            });
            butt.addActionListener((ActionEvent e) -> {
                but.setVisible(true);
                butt.setVisible(false);
            });
            but.addActionListener((ActionEvent evt) -> {
                EasyMath ea = new EasyMath();
                String con1 = txtF1.getText();
                String con2 = txtF2.getText();
                int num1 = Integer.parseInt(con1);
                int num2 = Integer.parseInt(con2);
                int output = ea.LCM(num1, num2);
                out.setText(String.valueOf(output));
                new Main(String.valueOf(output));
                out.setVisible(true);
            });
        }
        
        public void FAA() {
           JFrame fr = new JFrame("Math Menu Dialog");
            JTextField txtF1 = new JTextField(10);
            JTextField txtF2 = new JTextField(10);
            JTextField txtF3 = new JTextField(10);
            JTextField txtF4 = new JTextField(10);
            
            JLabel out = new JLabel();
            JButton but = new JButton("Run");
            JButton butt = new JButton("Ready?");
            JButton exitBut = new JButton("Go back");
            JPanel gobackPan = new JPanel();
            JPanel pan = new JPanel();

            fr.setSize(580, 150);
            fr.setResizable(false);
            fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fr.setVisible(true);
            fr.setLocationRelativeTo(null);
            fr.setLayout(new BorderLayout());
            but.setVisible(false);
            out.setVisible(false);

            fr.add(pan);
            fr.add(gobackPan, BorderLayout.SOUTH);
            gobackPan.add(exitBut);
            pan.add(txtF1);
            pan.add(txtF2);
            pan.add(txtF3);
            pan.add(txtF4);
            pan.add(butt);
            pan.add(but);
            pan.add(out);

            exitBut.addActionListener((ActionEvent evt) -> {
                mathChooseMenu();
                fr.dispose();
            });
            butt.addActionListener((ActionEvent e) -> {
                but.setVisible(true);
                butt.setVisible(false);
            });
            but.addActionListener((ActionEvent evt) -> {
                EasyMath ea = new EasyMath();
                String con1 = txtF1.getText();
                String con2 = txtF2.getText();
                String con3 = txtF3.getText();
                String con4 = txtF4.getText();
                int num1 = Integer.parseInt(con1);
                int num2 = Integer.parseInt(con2);
                int num3 = Integer.parseInt(con3);
                int num4 = Integer.parseInt(con4);
                Fraction output = ea.FAA(num1,
                                        num2,
                                         num3,
                                        num4);
                out.setText(String.valueOf(output.toString()));
                new Main(String.valueOf(output));
                out.setVisible(true);
            });
        }
        public void FSA() {
           JFrame fr = new JFrame("Math Menu Dialog");
            JTextField txtF1 = new JTextField(10);
            JTextField txtF2 = new JTextField(10);
            JTextField txtF3 = new JTextField(10);
            JTextField txtF4 = new JTextField(10);
            
            JLabel out = new JLabel();
            JButton but = new JButton("Run");
            JButton butt = new JButton("Ready?");
            JButton exitBut = new JButton("Go back");
            JPanel gobackPan = new JPanel();
            JPanel pan = new JPanel();

            fr.setSize(580, 150);
            fr.setResizable(false);
            fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fr.setVisible(true);
            fr.setLocationRelativeTo(null);
            fr.setLayout(new BorderLayout());
            but.setVisible(false);
            out.setVisible(false);

            fr.add(pan);
            fr.add(gobackPan, BorderLayout.SOUTH);
            gobackPan.add(exitBut);
            pan.add(txtF1);
            pan.add(txtF2);
            pan.add(txtF3);
            pan.add(txtF4);
            pan.add(butt);
            pan.add(but);
            pan.add(out);

            exitBut.addActionListener((ActionEvent evt) -> {
                mathChooseMenu();
                fr.dispose();
            });
            butt.addActionListener((ActionEvent e) -> {
                but.setVisible(true);
                butt.setVisible(false);
            });
            but.addActionListener((ActionEvent evt) -> {
                EasyMath ea = new EasyMath();
                String con1 = txtF1.getText();
                String con2 = txtF2.getText();
                String con3 = txtF3.getText();
                String con4 = txtF4.getText();
                int num1 = Integer.parseInt(con1);
                int num2 = Integer.parseInt(con2);
                int num3 = Integer.parseInt(con3);
                int num4 = Integer.parseInt(con4);
                Fraction output = ea.FSA(num1,
                                        num2,
                                         num3,
                                        num4);
                out.setText(String.valueOf(output));
                new Main(String.valueOf(output.toString()));
                out.setVisible(true);
            });
        }
        public void FMA() {
           JFrame fr = new JFrame("Math Menu Dialog");
            JTextField txtF1 = new JTextField(10);
            JTextField txtF2 = new JTextField(10);
            JTextField txtF3 = new JTextField(10);
            JTextField txtF4 = new JTextField(10);
            
            JLabel out = new JLabel();
            JButton but = new JButton("Run");
            JButton butt = new JButton("Ready?");
            JButton exitBut = new JButton("Go back");
            JPanel gobackPan = new JPanel();
            JPanel pan = new JPanel();

            fr.setSize(580, 150);
            fr.setResizable(false);
            fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fr.setVisible(true);
            fr.setLocationRelativeTo(null);
            fr.setLayout(new BorderLayout());
            but.setVisible(false);
            out.setVisible(false);

            fr.add(pan);
            fr.add(gobackPan, BorderLayout.SOUTH);
            gobackPan.add(exitBut);
            pan.add(txtF1);
            pan.add(txtF2);
            pan.add(txtF3);
            pan.add(txtF4);
            pan.add(butt);
            pan.add(but);
            pan.add(out);

            exitBut.addActionListener((ActionEvent evt) -> {
                mathChooseMenu();
                fr.dispose();
            });
            butt.addActionListener((ActionEvent e) -> {
                but.setVisible(true);
                butt.setVisible(false);
            });
            but.addActionListener((ActionEvent evt) -> {
                EasyMath ea = new EasyMath();
                String con1 = txtF1.getText();
                String con2 = txtF2.getText();
                String con3 = txtF3.getText();
                String con4 = txtF4.getText();
                int num1 = Integer.parseInt(con1);
                int num2 = Integer.parseInt(con2);
                int num3 = Integer.parseInt(con3);
                int num4 = Integer.parseInt(con4);
                Fraction output = ea.FMA(num1,
                                        num2,
                                         num3,
                                        num4);
                out.setText(String.valueOf(output.toString()));
                new Main(String.valueOf(output));
                out.setVisible(true);
            });
        }
        public void FDA() {
           JFrame fr = new JFrame("Math Menu Dialog");
            JTextField txtF1 = new JTextField(10);
            JTextField txtF2 = new JTextField(10);
            JTextField txtF3 = new JTextField(10);
            JTextField txtF4 = new JTextField(10);
            
            JLabel out = new JLabel();
            JButton but = new JButton("Run");
            JButton butt = new JButton("Ready?");
            JButton exitBut = new JButton("Go back");
            JPanel gobackPan = new JPanel();
            JPanel pan = new JPanel();

            fr.setSize(580, 150);
            fr.setResizable(false);
            fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fr.setVisible(true);
            fr.setLocationRelativeTo(null);
            fr.setLayout(new BorderLayout());
            but.setVisible(false);
            out.setVisible(false);

            fr.add(pan);
            fr.add(gobackPan, BorderLayout.SOUTH);
            gobackPan.add(exitBut);
            pan.add(txtF1);
            pan.add(txtF2);
            pan.add(txtF3);
            pan.add(txtF4);
            pan.add(butt);
            pan.add(but);
            pan.add(out);

            exitBut.addActionListener((ActionEvent evt) -> {
                mathChooseMenu();
                fr.dispose();
            });
            butt.addActionListener((ActionEvent e) -> {
                but.setVisible(true);
                butt.setVisible(false);
            });
            but.addActionListener((ActionEvent evt) -> {
                EasyMath ea = new EasyMath();
                String con1 = txtF1.getText();
                String con2 = txtF2.getText();
                String con3 = txtF3.getText();
                String con4 = txtF4.getText();
                int num1 = Integer.parseInt(con1);
                int num2 = Integer.parseInt(con2);
                int num3 = Integer.parseInt(con3);
                int num4 = Integer.parseInt(con4);
                Fraction output = ea.FAA(num1,
                                        num2,
                                         num3,
                                        num4);
                out.setText(String.valueOf(output.toString()));
                new Main(String.valueOf(output));
                out.setVisible(true);
            });
        }
        
        public void Random() {
           {
           JFrame fr = new JFrame("Math Menu Dialog");
            JTextField txtF1 = new JTextField(10);
            JTextField txtF2 = new JTextField(10);
            
            JLabel out = new JLabel();
            JButton but = new JButton("Run");
            JButton butt = new JButton("Ready?");
            JButton exitBut = new JButton("Go back");
            JPanel gobackPan = new JPanel();
            JPanel pan = new JPanel();

            fr.setSize(580, 150);
            fr.setResizable(false);
            fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fr.setVisible(true);
            fr.setLocationRelativeTo(null);
            fr.setLayout(new BorderLayout());
            but.setVisible(false);
            out.setVisible(false);

            fr.add(pan);
            fr.add(gobackPan, BorderLayout.SOUTH);
            gobackPan.add(exitBut);
            pan.add(txtF1);
            pan.add(txtF2);
            pan.add(butt);
            pan.add(but);
            pan.add(out);

            exitBut.addActionListener((ActionEvent evt) -> {
                mathChooseMenu();
                fr.dispose();
            });
            butt.addActionListener((ActionEvent e) -> {
                but.setVisible(true);
                butt.setVisible(false);
            });
            but.addActionListener((ActionEvent evt) -> {
                EasyMath ea = new EasyMath();
                String con1 = txtF1.getText();
                String con2 = txtF2.getText();
                int num1 = Integer.parseInt(con1);
                int num2 = Integer.parseInt(con2);
                int output = ea.random(num1,
                                        num2);
                out.setText(String.valueOf(output));
                new Main(String.valueOf(output));
                out.setVisible(true);
            });
        }
        }
    }

    class otherProg {

        public void opChooseMenu() {
            JFrame fr = new JFrame("Start Menu Dialog");
            JButton but = new JButton("start image writer?");
            JButton but2 = new JButton("Start To-Do list maker?");
            JButton exitBut = new JButton("Go back");
            JPanel gobackPan = new JPanel();
            JPanel pan1 = new JPanel();
            JPanel pan2 = new JPanel();

            fr.setSize(500, 200);
            fr.setResizable(false);
            fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fr.setVisible(true);
            fr.setLocationRelativeTo(null);
            fr.setLayout(new BorderLayout());

            fr.add(pan1, BorderLayout.NORTH);
            fr.add(pan2, BorderLayout.CENTER);
            fr.add(gobackPan, BorderLayout.SOUTH);
            gobackPan.add(exitBut);
            pan1.add(but);
            pan2.add(but2);

            exitBut.addActionListener((ActionEvent evt) -> {
                startMenu();
                fr.dispose();
            });
            but.addActionListener((ActionEvent evt) -> {
                ImageWrit();
                fr.dispose();
            });
            but2.addActionListener((ActionEvent evt) -> {
                TDLM();
                fr.dispose();
            });
        }

        public void ImageWrit() {
            JFrame fr = new JFrame("Image Collector Dialog");
            JTextField txtF1 = new JTextField(20);
            JTextField txtF2 = new JTextField(20);
            JLabel out = new JLabel();
            JLabel lb1 = new JLabel("Text file locarion:");
            JLabel lb2 = new JLabel("Image file destination:");
            JButton but = new JButton("Run");
            JButton butt = new JButton("Ready?");
            JButton exitBut = new JButton("Go back");
            JPanel BotPan = new JPanel();
            JPanel MidPan = new JPanel();
            JPanel TopPan = new JPanel();

            fr.setSize(580, 150);
            fr.setResizable(false);
            fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fr.setVisible(true);
            fr.setLocationRelativeTo(null);
            fr.setLayout(new BorderLayout());
            but.setVisible(false);
            out.setVisible(false);

            fr.add(TopPan, BorderLayout.NORTH);
            fr.add(MidPan, BorderLayout.CENTER);
            fr.add(BotPan, BorderLayout.SOUTH);
            BotPan.add(exitBut);
            TopPan.add(lb1);
            TopPan.add(txtF1);
            MidPan.add(lb2);
            MidPan.add(txtF2);
            BotPan.add(butt);
            BotPan.add(but);
            BotPan.add(out);

            exitBut.addActionListener((ActionEvent evt) -> {
                opChooseMenu();
                fr.dispose();
            });
            butt.addActionListener((ActionEvent e) -> {
                but.setVisible(true);
                butt.setVisible(false);
            });
            but.addActionListener((ActionEvent evt) -> {
                try {
                    EasyMath ea = new EasyMath();
                    String con1 = txtF1.getText();
                    String con2 = txtF2.getText();
                    new ImageWriter(con1, con2);
                    out.setVisible(true);
                } catch (IOException ex) {
                    ex.printStackTrace();
                    out.setText(ex.getMessage());
                }
            });
        }

        public void TDLM() {
            ArrayList<String> list = new ArrayList<>();
            JFrame fr = new JFrame("To-Do list maker dialog");
            fr.getContentPane();
            JPanel pan = new JPanel();
            JButton ADD = new JButton("Add");
            JButton Remove = new JButton("Remove");
            JButton Replace1 = new JButton("Replace?");
            JButton Replace2 = new JButton("Replace");
            JButton back = new JButton("Go back");
            JLabel itemA = new JLabel("item");
            JLabel itemB = new JLabel("item");
            JLabel itemC = new JLabel("item");
            JLabel items = new JLabel("There are no items yet, sorry!");
            JTextField field1 = new JTextField(20);
            JTextField field2 = new JTextField(20);

            Dimension add = ADD.getPreferredSize();
            Dimension rem = Remove.getPreferredSize();
            Dimension rep1 = Replace1.getPreferredSize();
            Dimension rep2 = Replace1.getPreferredSize();
            Dimension it = itemA.getPreferredSize();
            Dimension iti = items.getPreferredSize();
            Dimension fl = field1.getPreferredSize();
            Dimension f2 = field2.getPreferredSize();
            Dimension b = back.getPreferredSize();

            ADD.setBounds(20, 20, add.width, add.height);
            itemA.setBounds(add.width + 20, 20, it.width, it.height);
            Remove.setBounds(20, 50, rem.width, rem.height);
            itemB.setBounds(rem.width + 20, 50, it.width, it.height);
            Replace1.setBounds(160, 20, rep1.width, rep1.height);
            Replace2.setBounds(160, 20, rep2.width, rep2.height);
            itemC.setBounds(rep2.width + 160, 20, it.width, it.height);
            field1.setBounds(20, 80, fl.width, fl.height);
            field2.setBounds(fl.width + 20, 80, f2.width, f2.height);
            items.setBounds(20, 110, 10000, iti.height);
            back.setBounds(200, 430, b.width, b.height);

            pan.setLayout(null);
            fr.add(pan);
            pan.add(ADD);
            pan.add(itemA);
            pan.add(Remove);
            pan.add(itemB);
            pan.add(Replace1);
            pan.add(Replace2);
            pan.add(itemC);
            pan.add(field1);
            pan.add(field2);
            pan.add(items);
            pan.add(back);
            pan.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            fr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            fr.setSize(500, 500);
            fr.setVisible(true);
            fr.setLocationRelativeTo(null);
            field2.setVisible(false);

            ADD.addActionListener((ActionEvent e) -> {
                Dimension itit = items.getPreferredSize();
                field2.setVisible(false);
                list.add(field1.getText());
                items.setText(list.toString());
                items.setBounds(20, 110, itit.width, itit.height);
            });
            Remove.addActionListener((ActionEvent e) -> {
                field2.setVisible(false);
                list.remove(field1.getText());
                Dimension itit = items.getPreferredSize();
                items.setBounds(20, 110, itit.width, iti.height);
                items.setText(list.toString());
            });
            Replace1.addActionListener((ActionEvent e) -> {
                Replace1.setVisible(false);
                field2.setVisible(true);
            });
            Replace2.addActionListener((ActionEvent e) -> {
                field2.setVisible(true);
                field1.setText("Index");
                field2.setText("What to replace it with");
                if (field2.getText().toCharArray().length >= 20) {
                    field2.setColumns(30);
                }
                if (field2.getText().toCharArray().length >= 30) {
                    field2.setColumns(40);
                }
                if (field2.getText().toCharArray().length >= 40) {
                    field2.setColumns(50);
                }
                if (field2.getText().toCharArray().length >= 50) {
                    field2.setText("Max character limit reached!!!");
                }
                list.set(Integer.parseInt(field1.getText()), field2.getText());
                Dimension itit = items.getPreferredSize();
                items.setBounds(20, 110, itit.width, iti.height);
                items.setText(list.toString());
            });
            back.addActionListener((ActionEvent e) -> {
                opChooseMenu();
                fr.dispose();
            });
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
