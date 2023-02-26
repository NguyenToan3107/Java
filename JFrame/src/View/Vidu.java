package View;

import javax.swing.JFrame;

public class Vidu {
    public static void main(String[] args) {
		JFrame jf = new JFrame();
		
		// gan ten
		jf.setTitle("Quizd game");
		// gan kich co
		jf.setSize(600, 400);
		
		// gan vi tri hien thi
		jf.setLocation(500, 200);
		
		// thoat ra khoi chuong tring khi dong cua so Frame
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// cho phep hien thi
		jf.setVisible(true);
	}
}
