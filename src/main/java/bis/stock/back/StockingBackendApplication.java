package bis.stock.back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class StockingBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockingBackendApplication.class, args);
	}

}
