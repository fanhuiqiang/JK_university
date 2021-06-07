package fanhuiqiang.week05.bean;

import javax.annotation.Resource;

public class Lawyer {

	
	public Lawyer() {
		// TODO Auto-generated constructor stub
	}
	@Resource(name = "car123")
	Car car123;
	@Override
	public String toString() {
		return "Lawyer [car123=" + car123 + "]";
	}
}
