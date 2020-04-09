package LeviThompsonLab07;

import LeviThompsonLab07.Utils;
import java.util.ArrayList;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author levi.thompson
 */
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(Utils.repeat((int) 5, 5));

        ArrayList<Integer> ls = new ArrayList();
        ls.add(5);
        ls.add(10);
        ls.add(15);
        Utils.indexedOutput(ls);

        Utils.modifyIntegerXTimesTester();
//        Utils.testInvolutence();

    }

}


/*
    Estimated time: 5 hours
    Time Used: 7 hours
*/