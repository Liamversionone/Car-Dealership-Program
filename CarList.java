package mod;

import java.util.ArrayList;

public class CarList {
	
	private ArrayList<Models> cars;
	private String[] names = {"2022 Toyota Camry", "2022 Toyota RAV4", "2022 Toyota Highlander", "2022 Toyota Corolla", "2022 Toyota Tacoma"};
	private String[] colors = {"Blue", "Red", "Black", "White", "Gray", "Pink"};
	private String[] packages = {"Standard", "Deluxe", "Premium"};
	
	public ArrayList<Models> getList() {return cars;}
	
	public CarList() {
		cars = new ArrayList<Models>();
		for(int i = 0; i < 10; i++) {
			cars.add(new Models((int) ((Math.random() * 10)/2)));
		}
	}
	
	public void addCar() {
		cars.add(new Models(5));
	}
	
	public void removeCarsColor(int a, int b) {
		for(int i = cars.size() - 1; i >= 0; i--) {
			if(cars.get(i).getName().equals(names[a]) && cars.get(i).getColor().equals(colors[b]))
				cars.remove(i);
		}
	}
	
	public void removeCarsPackage(int a, int b) {
		for(int i = cars.size() - 1; i >= 0; i--) {
			if(cars.get(i).getName().equals(names[a]) && cars.get(i).getPackage().equals(packages[b]))
				cars.remove(i);
		}
	}
	
	public void removeCar(int i) {
		cars.remove(i - 1);
	}
	
	public void removeAll() {
		for(int i = cars.size() - 1; i >= 0; i--) {
			cars.remove(i);
		}
	}
	
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
