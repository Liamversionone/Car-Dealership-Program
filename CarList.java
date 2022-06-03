package mod;

import java.util.ArrayList;

public class CarList {
	
	/*These instance variables are used to store the types by storing the names of the models, the colors that they are available in, and the packages they 
	  come in. The ArrayList will store the Model objects, which hold the information for each car model that is made.*/
	private ArrayList<Models> cars;
	private String[] names = {"2022 Toyota Camry", "2022 Toyota RAV4", "2022 Toyota Highlander", "2022 Toyota Corolla", "2022 Toyota Tacoma"};
	private String[] colors = {"Blue", "Red", "Black", "White", "Gray", "Pink"};
	private String[] packages = {"Standard", "Deluxe", "Premium"};
	
	//Returns the ArrayList to be used in a different class.
	public ArrayList<Models> getList() {return cars;}
	
	//This constructor will set cars to equal a new empty ArrayList of Models and randomly creates 10 different car models and stores them in the ArrayList.
	public CarList() {
		cars = new ArrayList<Models>();
		for(int i = 0; i < 10; i++) {
			cars.add(new Models((int) ((Math.random() * 10)/2)));
		}
	}
	
	//This method is used to add a new car to the ArrayList.
	public void addCar() {
		cars.add(new Models(5));
	}
	
	//This method is used to remove cars of a selected model name and color.
	public void removeCarsColor(int a, int b) {
		for(int i = cars.size() - 1; i >= 0; i--) {
			if(cars.get(i).getName().equals(names[a]) && cars.get(i).getColor().equals(colors[b]))
				cars.remove(i);
		}
	}
	
	//This method is used to remove cars of a selected model name and package type.
	public void removeCarsPackage(int a, int b) {
		for(int i = cars.size() - 1; i >= 0; i--) {
			if(cars.get(i).getName().equals(names[a]) && cars.get(i).getPackage().equals(packages[b]))
				cars.remove(i);
		}
	}
	
	//This method is used to remove a specific car from the inventory of cars.
	public void removeCar(int i) {
		cars.remove(i - 1);
	}
	
	//This method removes all cars from the ArrayList.
	public void removeAll() {
		for(int i = cars.size() - 1; i >= 0; i--) {
			cars.remove(i);
		}
	}
	
	/*This method creates and returns a String that contains all of the information for the types of cars, their color, and their package that are within
	  the inventory that match the specified car name.*/
	public String drawMap(String s) {
		String ret = "";
		int cnt = 0;
		for(int i = 0; i < cars.size(); i++) {
			if(cars.get(i).getName().equalsIgnoreCase(s)) {
				ret += "Type: " + cars.get(i).getName();
				ret += "\nColor: " + cars.get(i).getColor();
				ret += "\nPackage: " + cars.get(i).getPackage() + "\n\n";
				cnt++;
			}
		}
		ret += "\nNumber of Cars: " + cnt;
		return ret;
	}
	
	//This method creates and returns a String that is used to display all of the cars that are within the inventory, along with their colors and package types.
	public String drawMap() {
		String ret = "";
		int cnt = 1;
		for(int i = 0; i < cars.size(); i++) {
			ret += cnt +") Type: " + cars.get(i).getName();
			ret += "\n" + cnt + ") Color: " + cars.get(i).getColor();
			ret += "\n" + cnt + ") Package: " + cars.get(i).getPackage() + "\n\n";
			cnt++;
		}
		return ret;
	}
	
	/*This method is used to show all available car model types, along with the number of each type of car in the inventory and the total amount of cars in the
	  inventory.*/
	public String showModels() {
		String ret = "";
		int cnt2 = 0;
		for(int i = 0; i < names.length; i++) {
			int cnt = 0;
			ret += names[i] + ": ";
			for(int j = 0; j < cars.size(); j++) {
				if(cars.get(j).getName().equals(names[i])) {
					cnt++;
					cnt2++;
				}
			}
			ret += cnt + "\n";
		}
		ret += "Total Cars: " + cnt2;
		return ret;
	}
}
