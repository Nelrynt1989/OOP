
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1405155
 */
public class View extends JFrame {
    
    
    private JList list = new JList();
    private JMenu fileMenu = new JMenu("File");
    private JMenu editMenu = new JMenu("Edit");
    private JMenu viewMenu = new JMenu("View");
    private JMenuBar menuBar = new JMenuBar();
    private JMenuItem AddItem = new JMenuItem("Add Mammal...");
    private JMenuItem editItem = new JMenuItem("Edit...");
    private JMenuItem deleteItem = new JMenuItem("Delete");
    private JMenuItem colourItem = new JMenuItem("Change colour");
    private JScrollPane listScroll;
    private JPanel buttonPanel = new JPanel();
    
    public View() {
        initView();
    }
 
    public void initView() {
        menuBar.add(fileMenu);
        fileMenu.add(AddItem);
        menuBar.add(editMenu);
        editMenu.add(editItem);
        editMenu.add(deleteItem);
        menuBar.add(viewMenu);
        viewMenu.add(colourItem);
        this.setJMenuBar(menuBar);
        
        list.setVisibleRowCount(6);
        listScroll = new JScrollPane(list);
       
        
        this.setLayout(new BorderLayout());
        this.add(listScroll, BorderLayout.NORTH);
        this.add(buttonPanel, BorderLayout.SOUTH);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 200);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        this.setVisible(true);
        
    }
    
    public int getSelected() {
        return list.getSelectedIndex();
    }
    
    public void setList(String[] data) {
        list.setListData(data);
    }
    
    public void setDeleteListener(ActionListener deleteListener) {
        deleteItem.addActionListener(deleteListener);
    }
    
    public void setEditListener(ActionListener deleteListener) {
        editItem.addActionListener(deleteListener);
    }
    
    public void setMenuListener(ActionListener menuListener) {
        AddItem.addActionListener(menuListener);
    }
    
    public void setColourListener(ActionListener colourListener) {
        colourItem.addActionListener(colourListener);
    }
}
