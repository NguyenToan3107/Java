package View;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutVD extends JFrame{
    public GridLayoutVD() {
    	this.setTitle("GridLayout");
    	this.setSize(600, 400);
    	//can giua cua so chuong trinh
    	this.setLocationRelativeTo(null);
    	
    	// set Layout
//    	GridLayout gridLayour = new GridLayout();
//    	GridLayout gridLayour = new GridLayout(4, 4);
    	GridLayout gridLayour = new GridLayout(4, 4, 25, 25);
        this.setLayout(gridLayour);
        
//        JButton jButton_1 = new JButton("1");
//        JButton jButton_2 = new JButton("2");
//        JButton jButton_3 = new JButton("3");
//    	
//        // add thanh phan
//        this.add(jButton_1);
//        this.add(jButton_2);
//        this.add(jButton_3);
        for (int i = 0; i < 16; i++) {
        	 JButton jButton = new JButton(i + "");
        	 this.add(jButton);
        }
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    	
    }
    public static void main(String[] args) {
		new GridLayoutVD();
	}
}
