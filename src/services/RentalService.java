package services;

import java.util.Date;

import entities.Movie;
import entities.Rental;
import entities.User;
import utils.UtilsDate;

public class RentalService {

	public Rental rentMovie(User user, Movie movie) {
		Date returnDate = new Date();
		returnDate = UtilsDate.addDays(returnDate, 1);
		Rental rental = new Rental(user, movie, new Date(), returnDate, movie.getPrice());
		return rental;
	}

}
