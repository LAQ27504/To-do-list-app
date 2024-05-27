package SoftwareTodoList;

import javax.swing.*;

public class ToDoListGUI extends JFrame{
	
	public ToDoListGUI() {
		super("To do list application");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setPreferredSize(CommonConstants.GUI_SIZE);
		pack();
		setLocationRelativeTo(null);
		setResizable(true);
		setLayout(null);
	}
	
}
