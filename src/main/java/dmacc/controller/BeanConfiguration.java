package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Movies;

/**
 * Sterling Rhone - sprhone
 * 202102 CIS175 26740
 * Mar 18, 2021
 */

@Configuration
public class BeanConfiguration {

	@Bean
	public Movies movie() {
		Movies bean = new Movies();
		bean.setTitle("Monty Python and the Holy Grail");
		bean.setGood("Yes");
		bean.setOriginalReleaseYearUSA(1975);
		bean.setRating("PG");
		bean.setLengthInMinutes(91);
		bean.setHaveWatched("Yes");
		return bean;
	}
}
