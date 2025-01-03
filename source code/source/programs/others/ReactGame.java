package source.programs.others;
import source.programs.math.EasyMath;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

class ReactGame extends JFrame {

    public ReactGame() {
        initComponents();
    }

    private void initComponents() {
        jPanel2 = new Panel2();

        jPanel2.setBackground(new Color(255, 255, 255));
        jPanel2.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        this.setContentPane(jPanel2);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
    }
    public static void main(String args[]) {
        EventQueue.invokeLater(() -> {
            new ReactGame().setVisible(true);
            
        });
        
    }
    private JPanel jPanel2;
    class Panel2 extends JPanel {

        Panel2() {
            // set a preferred size for the custom panel.
            setPreferredSize(new Dimension(420,420));
        }

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.BLACK);
            g.drawLine(100, 10, 100, 200);
            g.drawLine(150, 10, 150, 200);
            g.drawLine(200, 10, 200, 200);
            
            g.drawLine(60, 50, 250, 50);
            g.drawLine(60, 100, 250, 100);
            g.drawLine(60, 150, 250, 150);
            
            g.drawRect(60, 10, 190, 190);
        }
        
        class positions {
        
        public void a1b1(Graphics g) {
           
        }
        public void a2b1(Graphics g) {}
        public void a3b1(Graphics g) {}
        public void a4b1(Graphics g) {}
        public void a1b2(Graphics g) {}
        public void a2b2(Graphics g) {}
        public void a3b2(Graphics g) {}
        public void a4b2(Graphics g) {}
        public void a1b3(Graphics g) {}
        public void a2b3(Graphics g) {}
        public void a3b3(Graphics g) {}
        public void a4b3(Graphics g) {}
        public void a1b4(Graphics g) {}
        public void a2b4(Graphics g) {}
        public void a3b4(Graphics g) {}
        public void a4b4(Graphics g) {}
        }
        public void generatePos(Graphics g) {
           EasyMath math = new EasyMath();
           int rand = math.random(1, 16);
           
        }
    }
}