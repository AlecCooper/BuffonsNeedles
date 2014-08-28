package buffon.sneedles;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Alec Cooper
 * IB Math Exploration
 * 
 * Simulation of Buffon's Needles to generate pi
 * 
 */

public class BuffonSNeedles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       

       Scanner input = new Scanner(System.in);
       
       
       //Retrive input for amount of numbers to generate for D
       System.out.println("Enter the amount of numbers to generate");
       int intUplimit = input.nextInt();
       
       
            try{
        
                PrintWriter writerD = new PrintWriter("varD.txt", "US-ASCII");
       
       
                    //Generate D vars and write to file
                    for(int intCtr = 0; intCtr < intUplimit; intCtr++){
                        
                        int intRandomNum = randomGenerator(200, 0);
                        writerD.println(""+intRandomNum);
                        
                    }
       
                writerD.close();
                
                PrintWriter writerTheta = new PrintWriter("vartheta.txt", "US-ASCII");
       
       
                    //Generate numbers and write to file
                    for(int intCtr = 0; intCtr < intUplimit; intCtr++){
                        
                        int intRandomNum = randomGenerator(156, 0);
                        double dblRandomNum = intRandomNum / 100;
                        writerTheta.println(""+dblRandomNum);
                        
                    }
       
                writerTheta.close();
       
            }catch(Exception e){System.out.println("There was an error in writing the file");}
    }
    private static int randomGenerator(int max, int min){
        
        //Generate a random number following max and min params
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
        
    }
}
    

