package art.taylerdunn.MyAdSpace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyAdSpaceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyAdSpaceApplication.class, args);
	}

}
