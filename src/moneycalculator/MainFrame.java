/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package moneycalculator;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import moneycalculator.ui.swing.SwingMoneyDisplay;

/**
 *
 * @author usuario
 */
public class MainFrame extends JFrame{
    private int index=0;
    
    public MainFrame() {
        setTitle("MoneyCalculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,400);
        setMinimumSize(new Dimension(400,400));
        setLocationRelativeTo(null);
        this.setMenuBar(menuBar());
        setLayout(new BorderLayout());
        add(label(), BorderLayout.NORTH);
        add(label(), BorderLayout.SOUTH);
        add(label(), BorderLayout.WEST);
        add(label(), BorderLayout.EAST);
        add(MoneyDisplay());
        setVisible(true);
    } 

    private MenuBar menuBar() {
        MenuBar menuBar = new MenuBar();
        menuBar.add(Calculate());
        return menuBar;
    }

    private Menu Calculate() {
        Menu menu = new Menu("Calculate");
        menu.add(newExchange());
        return menu;
    }

    private MenuItem newExchange() {
        MenuItem menuItem = new MenuItem("New");
        menuItem.addActionListener(doNewExchange());
        return menuItem;
    }

    private ActionListener doNewExchange() {
        return new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ExchangeRate");
            }
            
        };
    }

    private JPanel label() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel.add(new JLabel("A" + index++));
        return panel;
    }
 
    private SwingMoneyDisplay MoneyDisplay() {
        SwingMoneyDisplay swingMoneyDisplay = new SwingMoneyDisplay();
        return swingMoneyDisplay;
    }

    
}
