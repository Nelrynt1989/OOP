
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Richard
 */
public class Model {

    private ArrayList<Mammal> mammalList = new ArrayList();
    private ArrayList<String> mammalNames = new ArrayList();
    private String[] namesArray = new String[10];

    public Model() {

    }

    public void add(Mammal newMammal) {
        mammalList.add(newMammal);
    }

    public void delete(int index) {
        mammalList.remove(index);
    }
    
    /*public Mammal search(String species) {
        
     }
    
    public boolean delete(String species) {
        
    }

    public ArrayList<Mammal> getList() {
        
     }*/
    
    public void printDetails() {
        for (Mammal itMammal : mammalList) {
            itMammal.printDetails();
        }
    }

    public void update(Mammal mammal, int index) {
        mammalList.set(index, mammal);
    }

    public String[] getArray() {
        mammalNames.clear();
        for (Mammal itMammal : mammalList) {
            mammalNames.add(itMammal.getName());
        }
        return mammalNames.toArray(namesArray);
    }

    public Mammal getRecord(int index) {
        return mammalList.get(index);
    }

    public int getSize() {
        return mammalList.size();
    }
}
