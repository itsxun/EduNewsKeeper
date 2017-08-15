package xin.fallen.EduNewsKeeper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"xin.fallen.EduNewsKeeper"})
public class EduNewsKeeperApplication {
	public static void main(String[] args) {
		SpringApplication.run(EduNewsKeeperApplication.class, args);
	}
}
