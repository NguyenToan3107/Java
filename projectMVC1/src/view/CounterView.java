package view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.CounterListener;
import model.CounterModel;

public class CounterView extends JFrame{
	private CounterModel counterModel;
	private JButton jButton_up;
	private JButton jButton_down;
	private JButton jButton_reset;
	
	private JLabel jLable_value;
	
	public CounterView() {
	    this.counterModel = new CounterModel();
	    this.init();
	    this.setVisible(true);
	}
	
	public void init() {
		this.setTitle("Counter");
		this.setLocationRelativeTo(null);
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jButton_up = new JButton("Up");
		jButton_down = new JButton("Down");
		jButton_reset = new JButton("Reset");
		
		jLable_value = new JLabel(this.counterModel.getValue()+"", JLabel.CENTER);

		CounterListener ac = new CounterListener(this);
		
		JPanel jPanel = new JPanel(new BorderLayout());
		jPanel.add(jButton_up, BorderLayout.WEST);
		jButton_up.addActionListener(ac);
		
		jPanel.add(jButton_down, BorderLayout.EAST);
		jButton_down.addActionListener(ac);
		
		jPanel.add(jButton_reset, BorderLayout.SOUTH);
		jButton_reset.addActionListener(ac);
		
		jPanel.add(jLable_value, BorderLayout.CENTER);
		
		this.setLayout(new BorderLayout());
		this.add(jPanel, BorderLayout.CENTER);
	}
	public void increment() {
		this.counterModel.increment();
		this.jLable_value.setText(this.counterModel.getValue()+"");
	}
	
	public void decrement() {
		this.counterModel.decrement();
		this.jLable_value.setText(this.counterModel.getValue()+"");
	}
	
	public void reset() {
		this.counterModel.reset();
		this.jLable_value.setText(this.counterModel.getValue()+"");		
	}
}