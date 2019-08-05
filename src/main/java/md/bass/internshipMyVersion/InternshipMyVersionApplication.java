package md.bass.internshipMyVersion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages = {"md.bass.internshipMyVersion"})
@EnableJpaRepositories("md.bass.internshipMyVersion.repository")
@EntityScan("md.bass.internshipMyVersion.entities")
public class InternshipMyVersionApplication {

	public static void main(String[] args) {
		SpringApplication.run(InternshipMyVersionApplication.class, args);
	}
}
