package fanhuiqiang.week05.bean;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class Teacher {
	
	

	@Resource(name = "car123")
	Car car123;
	@Override
	public String toString() {
		return "Teacher [car123=" + car123 + "]";
	}
}
