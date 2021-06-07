package fanhuiqiang.week05.bean;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class LawyerConfig {
	
	@Bean
	public Lawyer Lawyer(){
		return new Lawyer();
	}


}
