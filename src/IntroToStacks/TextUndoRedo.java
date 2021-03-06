package IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TextUndoRedo implements KeyListener {
	/*
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look
	 * like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character
	 * is erased from the JLabel. Save that deleted character onto a Stack of
	 * Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed,
	 * the top Character is popped off the Stack and added back to the JLabel.
	 * 
	 */

	Stack<Character> characters = new Stack<Character>();
	Stack<Character> deleted = new Stack<Character>();

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();

	public void GUI() {
		frame.add(panel);
		panel.add(label);
		frame.setSize(500, 100);
		frame.setVisible(true);

		frame.addKeyListener(this);
	}

	public static void main(String[] args) {
		TextUndoRedo textundoredo = new TextUndoRedo();
		textundoredo.GUI();

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		// System.out.println(e.getKeyChar());

		System.out.println(e.getKeyCode());
		if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
			// characters.pop();
			deleted.push(characters.pop());

			System.out.println("Deleted: " + deleted);

		} else if (e.getKeyCode() == KeyEvent.VK_LEFT) { // 37
			characters.push(deleted.pop());
		} else {
			characters.push(e.getKeyChar());
		}

		String s = "";

		for (Character character : characters) {
			s = s + character;
		}

		label.setText(s);
		System.out.println("Characters (Stack): " + characters);

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
