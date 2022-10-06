/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question21;

/**
 *
 * @author Devon
 */
import javax.swing.JOptionPane;
import javax.swing.JFrame;
public class SA_JD521 {

static final double [][] DDMarks = {{80,95,87,65,45,90},{65,70,80,45,87,95},{70,65,73,60,65,70}};

    static final String[] Names = {"Maxwell","Carl","Gerhard","Paul","James","Cena"};

    static final double maxmark = 100;

    public static void main(String[] args) 
    {
       JFrame f;
       f = new JFrame();

       System.out.println("Student Name \t JD521 \t\t PRG521 \t IPG521");
       String go;
       for (int i = 0; i < 6; i++)
       {
           go = Names[i];
       for(int j = 0; j < 3; j++)
       {
           go = go + "\t\t" + Double.toString(DDMarks[j][i]);
       }
       System.out.println(go);
       }

       int c = 0;
       double totalm;
       double avgmark;
       String Passstatus;

       while (c <= 6)
       {
           c = Integer.parseInt(JOptionPane.showInputDialog(f, "Enter num between 1 and 6 to view a student"));

           if(c < 0)
           {
                System.out.println("error");
           }
           else if(c >= 7)
           {
               System.out.println("\n Die");
               System.exit(0);
           }
           else {
               totalm =0;

               for (int j = 0; j < 3; j++)
               {
                   totalm = totalm + DDMarks[j][c - 1];
               }
               avgmark = totalm / 3;

               if (avgmark >= 70)
               {
                   Passstatus = "Passed";
               }
               else
               {
                   Passstatus = "failed";
               }

               System.out.println("");
               System.out.println( Names[c - 1] + ":\nMax Marks: " + Double.toString(maxmark) + "\nTotal Marks: " + Double.toString(totalm) + "\nAverageMarks: " + String.format("%.2f", avgmark) + "\nThis student has: " + Passstatus);
           }
           try{
           Thread.sleep(3);
           }
           catch(InterruptedException ex)
           {
               Thread.currentThread().interrupt();
           }
       }
    }
}
