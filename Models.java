package mod;

import javax.swing.JOptionPane;

public class Models {

	//These instance variables are used to store important information about the cars, as well as the available options for the selection windows.
	private String name;
	private String color;
	private String packageType;
	private String[] names = {"2022 Toyota Camry", "2022 Toyota RAV4", "2022 Toyota Highlander", "2022 Toyota Corolla", "2022 Toyota Tacoma"};
	private String[] colors = {"Blue", "Red", "Black", "White", "Gray", "Pink"};
	private String[] packages = {"Standard", "Deluxe", "Premium"};
	
	//These methods return the values of the String private instance variables to be used in other classes.
	public String getName() {return name;}
	public String getColor() {return color;}
	public String getPackage() {return packageType;}
	
	/*This constructor is used to create new models of cars. If int x is 0-4, then the related model of car is made with a random color and random package type.
	  If int x is 5, then the user is able to select what color and package type they want to have on the car.*/
	public Models(int x){
		double y = Math.random() * 100;
		double z = Math.random() * 100;
		if(x == 0) {
			name = "2022 Toyota Camry";
			if(y > 83.33333)
				color = "Blue";
			else if(y > 66.66666)
				color = "Red";
			else if(y > 49.99999)
				color = "Black";
			else if(y > 32.33332)
				color = "White";
			else if(y > 16.66665)
				color = "Gray";
			else
				color = "Pink";
			if(z > 66.66667)
				packageType = "Standard";
			else if(z > 33.33333)
				packageType = "Deluxe";
			else
				packageType = "Premium";
		}
		if(x == 1) {
			name = "2022 Toyota RAV4";
			if(y > 83.33333)
				color = "Blue";
			else if(y > 66.66666)
				color = "Red";
			else if(y > 49.99999)
				color = "Black";
			else if(y > 32.33332)
				color = "White";
			else if(y > 16.66665)
				color = "Gray";
			else
				color = "Pink";
			if(z > 66.66667)
				packageType = "Standard";
			else if(z > 33.33333)
				packageType = "Deluxe";
			else
				packageType = "Premium";
			
		}
		if(x == 2) {
			name = "2022 Toyota Highlander";
			if(y > 83.33333)
				color = "Blue";
			else if(y > 66.66666)
				color = "Red";
			else if(y > 49.99999)
				color = "Black";
			else if(y > 32.33332)
				color = "White";
			else if(y > 16.66665)
				color = "Gray";
			else
				color = "Pink";
			if(z > 66.66667)
				packageType = "Standard";
			else if(z > 33.33333)
				packageType = "Deluxe";
			else
				packageType = "Premium";
			
		}
		if(x == 3) {
			name = "2022 Toyota Corolla";
			if(y > 83.33333)
				color = "Blue";
			else if(y > 66.66666)
				color = "Red";
			else if(y > 49.99999)
				color = "Black";
			else if(y > 32.33332)
				color = "White";
			else if(y > 16.66665)
				color = "Gray";
			else
				color = "Pink";
			if(z > 66.66667)
				packageType = "Standard";
			else if(z > 33.33333)
				packageType = "Deluxe";
			else
				packageType = "Premium";
			
		}
		if(x == 4) {
			name = "2022 Toyota Tacoma";
			if(y > 83.33333)
				color = "Blue";
			else if(y > 66.66666)
				color = "Red";
			else if(y > 49.99999)
				color = "Black";
			else if(y > 32.33332)
				color = "White";
			else if(y > 16.66665)
				color = "Gray";
			else
				color = "Pink";
			if(z > 66.66667)
				packageType = "Standard";
			else if(z > 33.33333)
				packageType = "Deluxe";
			else
				packageType = "Premium";
			
		}
		if(x == 5) {
			int a = JOptionPane.showOptionDialog(null, "What type of car are you adding?", "Adding Car", 1, 3, null, names, 0);
			int b = JOptionPane.showOptionDialog(null, "What color do you want the car to be?", "Adding Car", 1, 3, null, colors, 0);
			int c = JOptionPane.showOptionDialog(null, "What package typ edo you want the car to be?", "Adding Car", 1, 3, null, packages, 0);
			if(a == 0)
				name = names[0];
			else if(a == 1)
				name = names[1];
			else if(a == 2)
				name = names[2];
			else if(a == 3)
				name = names[3];
			else
				name = names[4];
			if(b == 0)
				color = "Blue";
			else if(b == 1)
				color = "Red";
			else if(b == 2)
				color = "Black";
			else if(b == 3)
				color = "White";
			else if(b == 4)
				color = "Gray";
			else
				color = "Pink";
			if(c == 0)
				packageType = "Standard";
			else if(c == 1)
				packageType = "Deluxe";
			else
				packageType = "Premium";
			
		}
	}
}
