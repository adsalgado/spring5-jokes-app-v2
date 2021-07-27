package guru.springframework.jokes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import guru.springframework.jokes.services.JokeService;

@Controller
public class JokeController {

	private final JokeService jokeService;
	
	public JokeController(JokeService jokeService) {
		this.jokeService = jokeService;
	}

	@GetMapping(value = {"", "/"})
	public String getJokes(Model model) {
		model.addAttribute("joke", jokeService.getJoke());
		return "index";
	}
	
}
