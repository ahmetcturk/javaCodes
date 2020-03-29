package week6;


public class CellPhone {
private String manufact;
private String model;
private double retailPrice;
public CellPhone(String manufact, String model, double retailPrice) {
	this.manufact = manufact;
	this.model = model;
	this.retailPrice = retailPrice;
}
public String getManufact() {
	return manufact;
}
public void setManufact(String manufact) {
	this.manufact = manufact;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public double getRetailPrice() {
	return retailPrice;
}
public void setRetailPrice(double retailPrice) {
	this.retailPrice = retailPrice;
}



}
