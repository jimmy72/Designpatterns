package be.vdab.adapter;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Adapter extends JFrame  {
	// JFrame implementeert Serializable, dus:
	private static final long serialVersionUID = 1L;
	public Adapter() {
		super("Venster");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addMouseListener(new MuisAdapter());
	}
	
	private class MuisAdapter extends MouseAdapter{

		@Override
		public void mouseClicked(MouseEvent e) {
			JOptionPane.showMessageDialog(Adapter.this, String.valueOf(e.getX()));
		}
		
	}
}
