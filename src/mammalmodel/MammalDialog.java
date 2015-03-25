
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * 
 */
public class MammalDialog extends JDialog {
    private JButton okButton = new JButton("OK");
    private JButton cancelButton = new JButton("Cancel");
    private JLabel lblName = new JLabel("Name:");
    private JLabel lblSpecies = new JLabel("Species:");
    private JLabel lblLatin = new JLabel("Latin Name:");
    private JLabel lblDescription = new JLabel("Description:");
    private JTextField tfName = new JTextField();
    private JTextField tfSpecies = new JTextField();
    private JTextField tfLatin = new JTextField();
    private JTextField tfDescription = new JTextField();
    
    private JPanel inputPanel = new JPanel();
    private JPanel buttonPanel = new JPanel();
    
    private boolean cancelled = false;
    
    public MammalDialog(JFrame parent, Boolean modal) {
        super(parent, modal);
        initDialog();
    }
    
    public void initDialog(){
        inputPanel.setLayout(new GridLayout(4, 2));
        inputPanel.add(lblName);
        inputPanel.add(tfName);
        inputPanel.add(lblSpecies);
        inputPanel.add(tfSpecies);
        inputPanel.add(lblLatin);
        inputPanel.add(tfLatin);
        inputPanel.add(lblDescription);
        inputPanel.add(tfDescription);
        
        buttonPanel.add(okButton);
        buttonPanel.add(cancelButton);
        
        this.setLayout(new BorderLayout());
        this.add(inputPanel, BorderLayout.NORTH);
        this.add(buttonPanel, BorderLayout.SOUTH);
                
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        this.setSize(300, 150);
        
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                cancelled = false;
                MammalDialog.this.setVisible(false);
            }
        });
        
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                cancelled = true;
                MammalDialog.this.setVisible(false);
            }
        });
    }
    
    public boolean isCancelled() {
        return cancelled;
    }
    
    public Mammal getMammal() {
        this.setVisible(true);
        
        Mammal newMammal = new Mammal();
        newMammal.setName(tfName.getText());
        newMammal.setSpecies(tfSpecies.getText());
        newMammal.setLatin(tfLatin.getText());
        newMammal.setDescription(tfDescription.getText());
        
        return newMammal;
    }
    
    public void setFields(Mammal mammal) {
        tfName.setText(mammal.getName());
        tfSpecies.setText(mammal.getSpecies());
        tfLatin.setText(mammal.getLatin());
        tfDescription.setText(mammal.getDescription());
    }
}
