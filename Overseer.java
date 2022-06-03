package mod;

import javax.swing.JOptionPane;

public class Overseer {

	/*These are the instance variables that are used to store the list of cars; the values that are stored within the model objects, such as model names,
	  colors, and packages; as well as the options for the selection windows the users will interact with.*/
	private CarList cars;
	private String[] options1 = {"View Models Added", "Add/Remove Models", "Exit"};
	private String[] options2 = {"Add Models", "Remove Models"};
	private String[] optionsView = {"View All", "View Specific Model"};
	private String[] optionsRemove = {"Remove Single", "Remove Type", "Remove Color", "Remove All"};
	private String[] names = {"2022 Toyota Camry", "2022 Toyota RAV4", "2022 Toyota Highlander", "2022 Toyota Corolla", "2022 Toyota Tacoma"};
	private String[] colors = {"Blue", "Red", "Black", "White", "Gray", "Pink"};
	private String[] packages = {"Standard", "Deluxe", "Premium"};
	
	/*This is the constructor used to put everything together. It will instantiate the cars varaible with a new CarList object. It will also begin to ask the
	  user what they want to do and give them options for what they can do. When the user selects options, it will go through if statements to determine the
	  next actions the user will take. The process will loop until the user decides to exit the program.*/
	public Overseer() {
		cars = new CarList();
		boolean loop = true;
		JOptionPane.showMessageDialog(null, "Welcome to the Car Dealership program.", "Car Dealership", 1, null);
		while(loop) {
			int x = JOptionPane.showOptionDialog(null, "All Available Car Models:\n" + cars.showModels() + "\nWhat would you like to do?", "Next Action", 1, 3, null, options1, 0);
			if(x == 0) {
				int b = JOptionPane.showOptionDialog(null, "How would you like to view the models?", "View Models", 1, 3, null, optionsView, 0);
				if(b == 0) {
					JOptionPane.showMessageDialog(null, "All Models Currently Added:\n" + cars.drawMap(), "Car Dealership", 1, null);
				}
				else {
					String s = JOptionPane.showInputDialog(null, "Which car models would you like to view?\nNames of Models: Camry, RAV4, Highlander, Corolla, Tacoma", "View Models", 3);
					JOptionPane.showMessageDialog(null, cars.drawMap("2022 Toyota " + s));
				}
			}
			else if(x == 1) {
				int y = JOptionPane.showOptionDialog(null, "Would you like to add or remove a car?", "Add or Remove", 1, 3, null, options2, 0);
				if(y == 0)
					cars.addCar();
				else {
					int z = JOptionPane.showOptionDialog(null, "How would you like to remove the car(s)?\n", "Remove Cars", 1, 3, null, optionsRemove, 0);
					if(z == 0) {
						String p = JOptionPane.showInputDialog(null, "Which car would you like to remove?\n" + cars.drawMap(), "Remove Single", 3);
						int pe = Integer.parseInt(p);
						cars.removeCar(pe);
					}
					else if(z == 1) {
						int a = JOptionPane.showOptionDialog(null, "What model of car are you searching through?", "Remove Type", 1, 3, null, names, 0);
						int b = JOptionPane.showOptionDialog(null, "What package of car are you removing?", "Remove Type", 1, 3, null, packages, 0);
						cars.removeCarsPackage(a, b);
					}
					else if(z == 2) {
						int a = JOptionPane.showOptionDialog(null, "What model of car are you searching through?", "Remove Color", 1, 3, null, names, 0);
						int b = JOptionPane.showOptionDialog(null, "What color of car are you removing?", "Remove Color", 1, 3, null, colors, 0);
						cars.removeCarsColor(a, b);
					}
					else {
						cars.removeAll();
					}
				}
			}
			else {
				loop = false;
			}
		}
		JOptionPane.showMessageDialog(null, "Thank you for using the program!", "Car Dealership", 1, null);
	}
	
	
}
