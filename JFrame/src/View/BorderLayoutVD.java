package View;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutVD extends JFrame{
    public BorderLayoutVD() {
    	this.setTitle("BorderLayoutVD");
    	this.setSize(600, 400);
    	//can giua cua so chuong trinh
    	this.setLocationRelativeTo(null);
    	
    	// set Layout
//    	BorderLayout border = new BorderLayout();
    	BorderLayout border = new BorderLayout(25, 25);
        this.setLayout(border);
        
        JButton jButton_1 = new JButton("1");
        JButton jButton_2 = new JButton("2");
        JButton jButton_3 = new JButton("3");
        JButton jButton_4 = new JButton("4");
        JButton jButton_5 = new JButton("5");
    	
        // add thanh phan
        this.add(jButton_1, BorderLayout.NORTH);
        this.add(jButton_2, BorderLayout.SOUTH);
        this.add(jButton_3, BorderLayout.WEST);
        this.add(jButton_4, BorderLayout.EAST);
        this.add(jButton_5, BorderLayout.CENTER);
//        for (int i = 0; i < 16; i++) {
//        	 JButton jButton = new JButton(i + "");
//        	 this.add(jButton);
//        }
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    	
    }
    public static void main(String[] args) {
		new BorderLayoutVD();
	}
}
