import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Checkpoint {
public static void main(String[] args) {
	String g = JOptionPane.showInputDialog("What is your favorite color?");
	JOptionPane.showConfirmDialog(null, "I like " + g + " too!");
	Robot Blu = new Robot();
	Blu.setSpeed(40);
	Blu.penDown();
	for (int i = 0; i < 3; i++) {
	Blu.move(100);
	Blu.turn(120);
	}
}
}
k