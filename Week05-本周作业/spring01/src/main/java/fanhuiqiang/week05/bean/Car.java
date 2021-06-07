package fanhuiqiang.week05.bean;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Car implements Serializable {
	
	
	private String carName;
	private String carColor;
	 
	
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	
	@Override
	public String toString() {
		return "Car [carName=" + carName + ", carColor=" + carColor + "]";
	}
}
