package edu.uc.cs3003.medava;
import java.util.ArrayList;
import java.util.List;

import java.util.List;

public class Transporter {
    //Private value updated indirectly by user
    private String mTransporterName;
    //Constructor
    public String getTransporterName() {
        return mTransporterName;
    }
    // Public: needed for us to load and unload the goods of list (add/remove)
    // list of "Medicine class" denoted as goods

    public List<Medicine> goods;
    {
        goods = new ArrayList<Medicine>();
    }

    public void ship() {
        // Do some shipping!
      }
    
}