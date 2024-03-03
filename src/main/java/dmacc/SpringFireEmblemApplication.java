package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dmacc.beans.Unit;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.UnitRepository;

@SpringBootApplication
public class SpringFireEmblemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringFireEmblemApplication.class, args);
	}
	
	@Autowired
	UnitRepository repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		//Using existing bean
		Unit u = appContext.getBean("unit", Unit.class);
		repo.save(u);
		
		//Creating a bean to use
		Unit a = new Unit("Emphraim", "Great Lord", 60, 20, 18);
		repo.save(a);
		
		List<Unit> allMyUnits = repo.findAll();
		for(Unit unit: allMyUnits) {
			System.out.println(unit.toString());
		}
		
	}
	
	

}
