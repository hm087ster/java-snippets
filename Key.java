
import java.awt.event.*;
import javax.swing.*;

public class Key {
	
	public Key() {
	
	JFrame jf = new JFrame();
	jf.setSize(500,500);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	JPanel jp = new JPanel();
	JTextArea jtxt = new JTextArea("Enter a letter:");
	JTextArea jtxt2 = new JTextArea("   ");

	
	jf.add(jp);
	jp.add(jtxt);
	jp.add(jtxt2);
	
	jtxt2.addKeyListener(new KeyListener(){

		public void keyPressed(KeyEvent e) {}

		public void keyReleased(KeyEvent e) {}

		public void keyTyped(KeyEvent e) {
			if(e.getKeyChar() ==65) 
				System.out.println("A was typed!");
				
		}
	});

	jf.setVisible(true);
	
	}
	
	public static void main(String[] args) {
		
		new Key();
		
	}

}