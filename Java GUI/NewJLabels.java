// Bro Code - Java GUI :  2.labels
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class NewJLabels
{
    public static void main(String[] args) {

        /*
         * A JLabel object can display either text, an image, or both. 
         * 
         You can specify where in the label's display area the label's contents are aligned by setting the vertical and horizontal alignment. 
 
         By default, labels are vertically centered in their display area. 
         Text-only labels are leading edge aligned, 
         Image-only labels are horizontally centered, by default.
         */
        ImageIcon img=new ImageIcon("Roys Codes logo.png");
        Border bor=BorderFactory.createLineBorder(Color.cyan, 10);

        JLabel label=new JLabel();
        label.setIcon(img);
        label.setIconTextGap(-52); // sets text gap with image

        label.setText("Hello World! Welcome to Java GUI");
        // below two lines sets text pos wrt ImageIcon:
        label.setHorizontalTextPosition(JLabel.CENTER); // set text pos LEFT, CENTER or RIGHT
        label.setVerticalTextPosition(JLabel.TOP); // set text pos to TOP, CENTER or BOTTOM
        label.setForeground(new Color(0x180097)); // sets text color [we can use rgb also]
        label.setFont(new Font("", Font.ITALIC, 25)); // sets font style, type, and size
        label.setBackground(new Color(214, 0, 7)); // sets bg color
        label.setOpaque(true); // makes bg color visible
        label.setBorder(bor); // sets border to the label
        label.setVerticalAlignment(JLabel.CENTER); // sets pos of both text & image
        label.setHorizontalAlignment(JLabel.CENTER); // sets pos of both text & image
        // label.setBounds(80, 30, 600, 600); // sets (x-axis, y-axis, width, height)
        // NOTE: setBounds(x, y, width, height); work only when frame setLayout manager is kept null
        

        JFrame frame=new JFrame();
        frame.setTitle("2. New JLabels");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setSize(700,700); 
        frame.add(label);
        // frame.setLayout(null);
        frame.pack(); // no need to use setLayout & setSize

    }
}
