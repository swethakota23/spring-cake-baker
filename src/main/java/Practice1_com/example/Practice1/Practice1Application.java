package Practice1_com.example.Practice1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Practice1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Practice1Application.class, args);
	}

	@Autowired
	CakeBaker cakeBaker;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(cakeBaker.bakeCake());
	}
}
