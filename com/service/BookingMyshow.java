package com.service;

import com.model.Movie;
import com.model.Snack;

public interface BookingMyshow {
	Movie bookTicket();
    Snack addMeal();
	void printDetails();
	void logout();

}
