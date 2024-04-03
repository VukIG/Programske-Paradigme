package rs.co.skola.miskotest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import rs.co.skola.miskotest.model.ZaposleniModel;
import rs.co.skola.miskotest.model.RadnoMestoModel;
import rs.co.skola.miskotest.service.RadnoMestoService;
import rs.co.skola.miskotest.service.ZaposleniService;

@SpringBootApplication
public class MiskotestApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(MiskotestApplication.class, args);
	}

	private ZaposleniService zaposleniService;
	private RadnoMestoService radnoMestoService;

	public MiskotestApplication(ZaposleniService zaposleniService,
								RadnoMestoService radnoMestoService){
		super();
		this.zaposleniService = zaposleniService;
		this.radnoMestoService = radnoMestoService;
	}

	@Override
	public void run(String... args ) throws Exception{
		ZaposleniModel skibidiNigma = new ZaposleniModel(null,"Zeljko","Samardzic","jovanareklamoze@nigmail.com"); 
		RadnoMestoModel skibidiRizzler = new RadnoMestoModel(null,"Je<3"); 

		zaposleniService.save(skibidiNigma);
		radnoMestoService.save(skibidiRizzler);
	}
}