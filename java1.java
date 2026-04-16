import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuCard {
    public static void main(String[] args) {
        JFrame f = new JFrame("Menu Card");

        JCheckBox pizza = new JCheckBox("Pizza - 100");
        JCheckBox burger = new JCheckBox("Burger - 80");
        JCheckBox coffee = new JCheckBox("Coffee - 50");

        JButton orderBtn = new JButton("Place Order");
        JTextArea area = new JTextArea();

        pizza.setBounds(50, 50, 150, 30);
        burger.setBounds(50, 90, 150, 30);
        coffee.setBounds(50, 130, 150, 30);
        orderBtn.setBounds(50, 180, 150, 30);
        area.setBounds(50, 230, 250, 150);

        orderBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int total = 0;
                String order = "Selected Items:\n";

                if (pizza.isSelected()) {
                    order += "Pizza\n";
                    total += 100;
                }
                if (burger.isSelected()) {
                    order += "Burger\n";
                    total += 80;
                }
                if (coffee.isSelected()) {
                    order += "Coffee\n";
                    total += 50;
                }

                order += "\nTotal = " + total;
                area.setText(order);
            }
        });

        f.add(pizza); f.add(burger); f.add(coffee);
        f.add(orderBtn); f.add(area);

        f.setSize(400, 450);
        f.setLayout(null);
        f.setVisible(true);
    }
}