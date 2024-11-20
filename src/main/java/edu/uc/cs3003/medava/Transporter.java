import java.util.ArrayList;
import java.util.List;
package edu.uc.cs3003.medava;

import java.util.List;

public class Transporter {
    //Private value updated indirectly by user
    private String mTransporterName;
    //Constructor
    public String getTransporterName() {
        return mTransporterName;
    }
    // Private list of "Medicine class" denoted as goods
    Public List<Medicine> goods;
    {
        goods = new ArrayList<Medicine>();
    }
}