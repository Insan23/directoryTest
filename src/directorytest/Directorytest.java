/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package directorytest;

import java.io.File;

/**
 *
 * @author ASUS
 */
public class Directorytest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("tes/sss");
        file.mkdirs();
    }
    
}
