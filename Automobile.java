public class Automobile {

private String make;
private String model;
private String color;
private int year;
private int mileage;

public void setMake(String make) {
this.make = make;
}

public String getMake() {
return make;
}

public void setModel(String model) {
this.model = model;
}

public String getModel() {
return this.model;
}

public void setColor(String color) {
this.color = color;
}

public String getColor() {
return this.color;
}

public void setYear(int year) {
this.year = year;
}

public int getYear() {
return this.year;
}

public void setMileage(int mileage) {
this.mileage = mileage;
}

public int getMileage() {
return this.mileage;
}

public static void main(String[] args){

System.out.println("Please run the Main.java file...");

}
}