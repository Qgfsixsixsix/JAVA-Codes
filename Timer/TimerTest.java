/**
 * The program is created on IntelliJ IDEA
 *
 * @author Qgf
 * @date 2018/5/18
 * @since version 1.0
 */

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
// to resolve conflict with java.util.Timer
import javax.swing.Timer;

public class TimerTest {
    public static void main(String[] args){
        ActionListener listener = new TimePrint();

        // construct a timer that calls the listener
        // once every 10 seconds
        Timer t = new Timer(10000,listener);
        //call actionPerformed method
        // start() method belong to javax.swing.Timer
        t.start();
        // showMessageDialog() method belong to javax.swing.JOptionPane
        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);
    }
}
class TimePrint implements ActionListener{
    public void actionPerformed(ActionEvent event){
        System.out.println("At the tone,the time is " + new Date());
        Toolkit.getDefaultToolkit().beep();
    }
}
