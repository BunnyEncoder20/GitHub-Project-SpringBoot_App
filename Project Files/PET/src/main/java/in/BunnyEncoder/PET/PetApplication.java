package in.BunnyEncoder.PET;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("in.BunnyEncoder.PET.*")
@ComponentScan(basePackages = { "in.BunnyEncoder.PET.*" })
@EntityScan("in.BunnyEncoder.PET.*")   
public class PetApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetApplication.class, args);
	}

}
