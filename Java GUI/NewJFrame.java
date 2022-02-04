import javax.swing.JFrame; // package for JFrame class
import javax.swing.ImageIcon; // package for ImageIcons
import java.awt.Color;

public class NewJFrame
{
    public static void main(String[] args) {
        
        JFrame frame=new JFrame(); // creates a JFrame
        // JFrame works like the main window where components like labels, buttons, textfields are added inside to create a GUI.
        frame.setTitle("1. New JFrame");
        frame.setSize(300,300); // sets (x,y) dimmensions
        frame.setVisible(true); // makes the frame visible
        // frame.setResizable(false); // stops resizing the frame

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exits the JFrame
        // by default the Jframe is not closed

        ImageIcon logo= new ImageIcon("Roys Codes logo.png"); // creates image icon
        frame.setIconImage(logo.getImage()); // changing default icon of the frame

        // frame.getContentPane().setBackground(Color.cyan); // sets bg color
        frame.getContentPane().setBackground(new Color(0x123456)); // sets hex colors
        // frame.getContentPane().setBackground(new Color(214, 0, 7)); // sets rgb bg color

    }

} 