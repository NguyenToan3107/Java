package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.LastButtonListener;
import model.LastButtonModel;

public class LastButtonView extends JFrame{
    private LastButtonModel lastButtonModel;
    private JLabel jLable;
    
    private JLabel jLabel;
    public LastButtonView() {
    	this.lastButtonModel = new LastButtonModel();
    	
    	this.init();
    	this.setVisible(true);
    }
    
    public void init() {
    	this.setTitle("Last Button");
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setSize(600, 300);
    	this.setLocationRelativeTo(null);
    	
    	JPanel jpanel_Center = new JPanel();
    	jpanel_Center.setLayout(new GridLayout(2, 2, 25, 25));
    	
    	LastButtonListener ac = new LastButtonListener(this);
    	
    	// tao font chu
    	Font font = new Font("Arial", Font.BOLD, 40);
    	
    	JButton jButton_1 = new JButton("1");
    	jButton_1.setFont(font);
    	jButton_1.addActionListener(ac);
    	
    	JButton jButton_2 = new JButton("2");
    	jButton_2.setFont(font);
    	jButton_2.addActionListener(ac);
    	
    	JButton jButton_3 = new JButton("3");
    	jButton_3.setFont(font);
    	jButton_3.addActionListener(ac);
    	
    	JButton jButton_4 = new JButton("4");
    	jButton_4.setFont(font);
    	jButton_4.addActionListener(ac);
    	
    	jpanel_Center.add(jButton_1);
    	jpanel_Center.add(jButton_2);
    	jpanel_Center.add(jButton_3);
    	jpanel_Center.add(jButton_4);
    	
    	JPanel jpanel_Footer = new JPanel();
    	jpanel_Footer.setLayout(new FlowLayout());
    	jLabel = new JLabel("----------");
    	jLabel.setFont(font);
    	
    	jpanel_Footer.add(jLabel);
    	
    	this.setLayout(new BorderLayout());
    	this.add(jpanel_Center, BorderLayout.CENTER);
    	this.add(jpanel_Footer, BorderLayout.SOUTH);
    }
    public void changeTo_1() {
    	this.lastButtonModel.setValue_1();
    	this.jLabel.setText("Last button"+ this.lastButtonModel.getValue());
    	
    }
    public void changeTo_2() {
    	this.lastButtonModel.setValue_2();
    	this.jLabel.setText("Last button"+ this.lastButtonModel.getValue());
    	
    }
    public void changeTo_3() {
    	this.lastButtonModel.setValue_3();
    	this.jLabel.setText("Last button"+ this.lastButtonModel.getValue());
    	
    }
    public void changeTo_4() {
    	this.lastButtonModel.setValue_4();
    	this.jLabel.setText("Last button"+ this.lastButtonModel.getValue());
    	
    }
}
