package teuw.med.Ganaar.Gi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import teuw.med.Ganaar.Gi.Repositories.GanaarRepository;
import teuw.med.Ganaar.Gi.entities.Ganaar;

@SpringBootApplication
public class GanaarGiApplication implements CommandLineRunner {

	@Autowired
	private GanaarRepository ganaarRepository;
	public static void main(String[] args) {
		SpringApplication.run(GanaarGiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Ganaar G1 = new Ganaar("Brahman","this is a brahmam ganaar",12000, "photo.png");
		Ganaar G2 = new Ganaar("Pondeuse","this is a pondeuse ganaar",4000, "photo.png");


		ganaarRepository.save(G1);
		ganaarRepository.save(G2);

	}
}
