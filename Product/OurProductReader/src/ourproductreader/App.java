// Stephen Tornetta PSU 2019. Java Main Class.

package ourproductreader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


/**
 *
 * @author stept
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        // Here is some code
        File file = new File("Team Member Info/TeamInfo.txt");
        BufferedReader br = new BufferedReader(new FileReader(file)); 
         
        File file2 = new File("Company Info/CompanyInfo.txt");
        BufferedReader br2 = new BufferedReader(new FileReader(file2)); 
        
        String st; 
        while ((st = br.readLine()) != null) 
            System.out.println(st); 

        System.out.println("");
        
        String st2; 
        while ((st2 = br2.readLine()) != null) 
            System.out.println(st2);         
    }

}
