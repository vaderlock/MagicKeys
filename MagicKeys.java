import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MagicKeys implements ActionListener {

    private int count = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;
    private JTextField qField;

    public MagicKeys() {
        frame = new JFrame(); // window
        panel = new JPanel(); // layout
        qField = new JTextField("0", 10); // input quantity with initial text

        JButton marketOrderButton = new JButton("Market Order");
        JButton limitOrderButton = new JButton("Limit Order");
        JButton buyButton = new JButton("Buy");
        JButton sellButton = new JButton("Sell");
        JButton autoBEButton = new JButton("Auto BE");
        JButton partialTPButton = new JButton("Partial TP");
        JButton partialSLButton = new JButton("Partial SL");

        buyButton.addActionListener(this);
        sellButton.addActionListener(this);
        label = new JLabel("Number of trades executed: 0");

        // Setup the panel
        panel.setLayout(new GridLayout(4, 1, 10, 10));

        // Add the menu bar
        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);
        
        // Add the dropdown menu to the menu bar
        JMenu menu = new JMenu("Search");
        menuBar.add(menu);
        
        // Add items to the dropdown menu
        JMenuItem menuItem1 = new JMenuItem("ES");
        JMenuItem menuItem2 = new JMenuItem("NQ");
        JMenuItem menuItem3 = new JMenuItem("DXY");
        JMenuItem menuItem4 = new JMenuItem("XAUUSD");
        JMenuItem menuItem5 = new JMenuItem("USOIL");
        JMenuItem menuItem6 = new JMenuItem("BTCUSD");
        JMenuItem menuItem7 = new JMenuItem("ETHUSD");
        menu.add(menuItem1);
        menu.add(menuItem2);
        menu.add(menuItem3);
        menu.add(menuItem3);
        menu.add(menuItem4);
        menu.add(menuItem5);
        menu.add(menuItem6);
        menu.add(menuItem7);

        // Add Market Order and Limit Order buttons
        JPanel orderPanel = new JPanel(new FlowLayout());
        orderPanel.add(marketOrderButton);
        orderPanel.add(limitOrderButton);
        panel.add(orderPanel);

        // Add Sell button, Quantity field, and Buy button
        JPanel buySellPanel = new JPanel(new FlowLayout());
        buySellPanel.add(sellButton);
        buySellPanel.add(qField);
        buySellPanel.add(buyButton);
        panel.add(buySellPanel);

        // Add Auto BE, Partial TP, and Partial SL buttons
        JPanel configPanel = new JPanel(new FlowLayout());
        configPanel.add(autoBEButton);
        configPanel.add(partialTPButton);
        configPanel.add(partialSLButton);
        panel.add(configPanel);

        // Add number of trades executed label
        JPanel execution = new JPanel(new FlowLayout());
        execution.add(label);
        panel.add(execution);

        // Style the buttons
        buyButton.setBackground(Color.GREEN);
        sellButton.setBackground(Color.RED);

        // Add panel to the frame
        frame.add(panel, BorderLayout.CENTER);
        frame.setTitle("Magic Keys");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new MagicKeys();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of trades executed: " + count);

    }
}