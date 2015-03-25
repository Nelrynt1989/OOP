
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 1405166
 */
public class Controller {

    int change = 0;
    
    View view = new View();
    Model model = new Model();

    public Controller() {

    }

    public void startApp() {
        view.setDeleteListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                model.delete(view.getSelected());
                view.setList(model.getArray());
            }
        });
        view.setEditListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                MammalDialog mDialog = new MammalDialog(view, true);
                mDialog.setFields(model.getRecord(view.getSelected()));
                Mammal newMammal = mDialog.getMammal();
                if (mDialog.isCancelled() == false) {
                    model.update(newMammal, view.getSelected());
                    view.setList(model.getArray());
                }
            }
        });
        view.setMenuListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                MammalDialog mDialog = new MammalDialog(view, true);
                Mammal newMammal = mDialog.getMammal();
                if (mDialog.isCancelled() == false) {
                    model.add(newMammal);
                    view.setList(model.getArray());
                }
            }
        });
        
        view.setColourListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                
               if(change % 2 == 0)
                   view.getContentPane().setBackground(Color.BLUE);
               else
                   view.getContentPane().setBackground(view.getBackground());
                
                   change++;
                
            }
        });   
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Controller myApp = new Controller();
        myApp.startApp();
    }

}
