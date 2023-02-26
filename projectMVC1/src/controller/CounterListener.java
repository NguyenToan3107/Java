package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.CounterView;

public class CounterListener implements ActionListener{
 
	public CounterView ctv;
	public CounterListener(CounterView ctv) {
		this.ctv = ctv;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String src = e.getActionCommand();
		
		System.out.println("Ban da bam nut: "+src);
		
		if(src.equals("Up")) {
			this.ctv.increment();
		}else if(src.equals("Down")) {
			this.ctv.decrement();
		}else if(src.equals("Reset")) {
			this.ctv.reset();
		}
	}
	
}