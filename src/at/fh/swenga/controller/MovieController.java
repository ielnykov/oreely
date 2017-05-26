package at.fh.swenga.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import at.fh.swenga.model.MovieModel;

@Controller
public class MovieController {

	

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String handleLogin() {
		return "login";
	}

	// @ExceptionHandler(Exception.class)
	public String handleAllException(Exception ex) {

		return "error";

	}
}