package View;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutVD extends JFrame {
	public FlowLayoutVD() {
    	this.setTitle("FlowLayout");
    	this.setSize(600, 400);
    	//can giua cua so chuong trinh
    	this.setLocationRelativeTo(null);
    	
    	// set Layout
//    	FlowLayout flowLayOut = new FlowLayout();
//    	FlowLayout flowLayOut = new FlowLayout(FlowLayout.CENTER);
    	FlowLayout flowLayOut = new FlowLayout(FlowLayout.CENTER, 100, 100);
        this.setLayout(flowLayOut);
        
        JButton jButton_1 = new JButton("1");
        JButton jButton_2 = new JButton("2");
        JButton jButton_3 = new JButton("3");
        JButton jButton_4 = new JButton("4");
    	
        // add thanh phan
        this.add(jButton_1);
        this.add(jButton_2);
        this.add(jButton_3);
        this.add(jButton_4);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setVisible(true);
    }
	public static void main(String[] args) {
		new FlowLayoutVD();
	}
}
