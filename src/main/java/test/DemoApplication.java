package test;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;


public class DemoApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Hello.class, args);
	}


	@Override
	public void run(String... strings) throws Exception {
		
	}
}
