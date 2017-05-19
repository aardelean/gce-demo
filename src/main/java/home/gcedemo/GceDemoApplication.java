package home.gcedemo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GceDemoApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(GceDemoApplication.class).web(true).run(args);
	}

	@GetMapping
	public String ok() {
		return "yeah!";
	}
}
