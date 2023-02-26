package test;

import javax.swing.UIManager;

import view.LastButtonView;

public class Test {
    public static void main(String[] args) {
		try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());			
			new LastButtonView();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
