/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package guanslife;

import java.util.Scanner;

/**
 *
 * @author yuk4142
 */
public class Guanslife {
public String guan;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("guan is born on feburary 8, 1999.");
        System.out.println("what is guan's first words?");
        Scanner VG = new Scanner(System.in);
        String firstWords = VG.nextLine();
        
        String catchPhrase = firstWords;
        System.out.println("guan: " + catchPhrase);
        System.out.println("who is guan's best friend?");
        String bestFriend = VG.nextLine();
        String Companion = bestFriend;
        System.out.println("guan: " + Companion + " is my best friend");
        System.out.println("when guan was 13 years old, what important person in his life did he meet?");
        String Aaron = VG.nextLine();
        if(Aaron.equals("aaron")){
            System.out.println("Guan: " + "Aaron is an important person in my life");
        }else{
            System.out.println("he met Aaron Droese,the craker, and the most important person in guan's life");
        
        }
        System.out.println("From a scale of 1 to 10, how crazy is guan?");
        int crazy = VG.nextInt();
        if(crazy == 10){
            System.out.println("guan: HA. HA. HA. i've eaten your rice");
        }else{
            System.out.println("guan: im a crazy rice eating lunatic");
        }
        }
    
            
        
            
    

}