package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Movies;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.MoviesRepository;

/**
 * Sterling Rhone - sprhone
 * 202102 CIS175 26740
 * Mar 18, 2021
 */

@SpringBootApplication
public class MovieCollectionApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(MovieCollectionApplication.class, args);
	}

	@Autowired
	MoviesRepository repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		//Created bean from BeanConfiguration output to RDS
		Movies created = appContext.getBean("movie", Movies.class);
		repo.save(created);
		
		//Creating new beans to output to RDS
		Movies newMovie1 = new Movies("The Notebook", "No");
		repo.save(newMovie1);
		Movies newMovie2 = new Movies("Ice Pirates", "No", 0, null, 0, "Yes");
		repo.save(newMovie2);
		Movies newMovie3 = new Movies("Legends of the Fall", "Yes", 1995, "R", 133, "Yes");
		repo.save(newMovie3);
		
		List<Movies> allMovies = repo.findAll();
		for(Movies m: allMovies) {
			System.out.println(m.toString());
		}
		((AbstractApplicationContext) appContext).close();
	}
	
	
}
