import java.io.PrintWriter;
import java.util.Scanner; 
import java.util.*;

public class Main { 

	public static void main(String[] args) {
	
		Automobile car = new Automobile();
		car.setMake("");
		String make = car.getMake();
		
		car.setModel("");
		String model = car.getModel();
		
		car.setColor("");
		String color = car.getColor();
		
		car.setYear(0);
		Integer year = car.getYear();
		
		car.setMileage(0);
		Integer mileage = car.getMileage();
		
		int removeCar;
		int updateCar;
		
		try (Scanner input = new Scanner(System.in)) {
			ArrayList<String> carMake = new ArrayList<>();
			ArrayList<String> carModel = new ArrayList<>();
			ArrayList<String> carColor = new ArrayList<>();
			ArrayList<Integer> carYear = new ArrayList<>();
			ArrayList<Integer> carMileage = new ArrayList<>();
			
				do { 
				try {
					
				System.out.println(""); 
				System.out.println("(Type 1-5)");
				System.out.println("1. Add new vehicle");
				System.out.println("2. Remove a vehicle");
				System.out.println("3. Update existing vehicle");
				System.out.println("4. View all vehicles");
				System.out.println("5. Print all data to text file");
				
				int menu = input.nextInt(); 
				
				if (menu == 1) {
				System.out.println("Type the Make of the car you wish to enter:");
				make = input.next();
				carMake.add(make);
				
				System.out.println("Type the Model of the car you wish to enter:");
				model = input.next();
				carModel.add(model);
				
				System.out.println("Type the Color of the car you wish to enter:");
				color = input.next();
				carColor.add(color);
				
				System.out.println("Type the Year of the car you wish to enter:");
				year = input.nextInt();
				carYear.add(year);
				
				System.out.println("Type the Mileage of the car you wish to enter:");
				mileage = input.nextInt();
				carMileage.add(mileage);
				
				} else if (menu == 2) {
				System.out.println("What car do you want to remove? (Type the number... IE: 0)");
				
				
				for (int i = 0; i < carMake.size() && i < carModel.size() && i < carColor.size() && i < carYear.size() && i < carMileage.size(); i++)
				System.out.println(carMake.indexOf(carMake.get(i)) + ": " +carMake.get(i) + ", " + carModel.get(i) + ", " + carColor.get(i) + ", " + carYear.get(i) + ", " + carMileage.get(i) + ".");
				
				removeCar = input.nextInt();
				carMake.remove(removeCar);
				carModel.remove(removeCar);
				carColor.remove(removeCar);
				carYear.remove(removeCar);
				carMileage.remove(removeCar);
				
				} else if (menu == 3) {
				System.out.println("What car do you want to update? (Type the number)");
				
				for (int i = 0; i < carMake.size() && i < carModel.size() && i < carColor.size() && i < carYear.size() && i < carMileage.size(); i++)
				System.out.println(carMake.indexOf(carMake.get(i)) + ": " +carMake.get(i) + ", " + carModel.get(i) + ", " + carColor.get(i) + ", " + carYear.get(i) + ", " + carMileage.get(i) + ".");
				
				updateCar = input.nextInt();
				System.out.println("Set the new Car Make:");
				carMake.set(updateCar, input.next());
				System.out.println("Set the new Car Model:");
				carModel.set(updateCar, input.next());
				System.out.println("Set the new Car Color:");
				carColor.set(updateCar, input.next());
				System.out.println("Set the new Car Year:");
				carYear.set(updateCar, input.nextInt());
				System.out.println("Set the new Car Mileage:");
				carMileage.set(updateCar, input.nextInt());
				
				} else if (menu == 4) {
				System.out.println("Here are all of the cars currently in the inventory:");
				for (int i = 0; i < carMake.size() && i < carModel.size() && i < carColor.size() && i < carYear.size() && i < carMileage.size(); i++)
				System.out.println(carMake.get(i) + ", " + carModel.get(i) + ", " + carColor.get(i) + ", " + carYear.get(i) + ", " + carMileage.get(i) + ".");
				
				} else if (menu == 5) {
				System.out.println("Printing all data...");
				
				PrintWriter writer = new PrintWriter("TravisWoodward_AutomobileProgram.txt", "UTF-8");
				for (int i = 0; i < carMake.size() && i < carModel.size() && i < carColor.size() && i < carYear.size() && i < carMileage.size(); i++)
				writer.println(carMake.get(i) + ", " + carModel.get(i) + ", " + carColor.get(i) + ", " + carYear.get(i) + ", " + carMileage.get(i) + ".");
				writer.close();
				
				} else {
				System.out.println("You must select a number between 1-5.");
				}
				}
				catch (Exception e) {
				input.next(); 
				System.out.println("You may not put letters in that field. Please try again.\n");
				}
				}
				while (true);
		}
	}
}

