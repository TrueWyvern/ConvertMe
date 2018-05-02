/* 02/05/2018
 * Aisik Pilote
 * runs program
 * sets up methods to to show and hide certain guis
 */

package U3A3_convertmepackage;

/**
 *
 * @author aipil3692
 */
public class Run {

       static U3A3_ConvertMeGui guiI = new U3A3_ConvertMeGui();
       static ConvertMeGui guiF = new ConvertMeGui();
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        guiI.setVisible(true);
    }
    //gui control
    public void guiIOn() {
        guiI.setVisible(true);
    }
    public void guiIOff() {
        guiI.setVisible(false);
    }
    public void guiFOn() {
        guiF.setVisible(true);
    }
    public void guiFOff() {
        guiF.setVisible(false);
    }
    
}
