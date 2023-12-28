import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyGUIMatch extends JFrame{
    private int aCMIlanCount = 0;
    private int realMadridCount = 0;

    private JButton aCMilan = new JButton("AC Milan");
    private JButton realMadrid = new JButton("Real Madrid");
    private JLabel result = new JLabel("Result 0 X 0", JLabel.CENTER);
    private JLabel lastScorer = new JLabel("Last Scorer", JLabel.CENTER);

    public MyGUIMatch(){
        super("My GUI Match");
        this.setBounds(100, 100, 250, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));

        container.add(result, BorderLayout.CENTER);
        container.add(aCMilan, BorderLayout.WEST);
        container.add(realMadrid, BorderLayout.EAST);

        aCMilan.addActionListener(e -> {
            aCMIlanCount++;
            result.setText("Result " + aCMIlanCount + " X " + realMadridCount);
            if (aCMIlanCount == 9 && realMadridCount == 9){
                container.remove(result);
                container.add(lastScorer, JLabel.CENTER);
            }
            if (aCMIlanCount == 10){
                JOptionPane.showMessageDialog(null, "AC Milan", "Winner", JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
            }

        });
        realMadrid.addActionListener(e -> {
            realMadridCount++;
            result.setText("Result " + aCMIlanCount + " X " + realMadridCount);
            if (aCMIlanCount == 9 && realMadridCount == 9){
                container.remove(result);
                container.add(lastScorer, JLabel.CENTER);
            }

            if(realMadridCount == 10){
                JOptionPane.showMessageDialog(null, "Real Madrid", "Winner", JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
            }
        });
    }
}