/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package moneycalculator;

import java.awt.Dimension;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author usuario
 */
public class MainFrame extends JFrame{

    public MainFrame() {
        setTitle("MoneyCalculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setSize(400,400);
        setMinimumSize(new Dimension(400,400));
        setLocationRelativeTo(null);
        this.setMenuBar(menuBar());
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
    
}
