package cs544.mum.edu.EA.controller;

/**
 * Name: CHANDARA LEANG
 * ID: 108619
 * Task: Extra Credit 2
 * Class: MovieController
 */

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cs544.mum.edu.EA.dao.IMovieDao;
import cs544.mum.edu.EA.domain.Movie;

@Controller
public class MovieController {
	@Resource
    private IMovieDao movieDao;

    @RequestMapping("/")
    public String redirectRoot() {
        return "redirect:/movies";
    }

    @RequestMapping(value = "/movies", method = RequestMethod.GET)
    public String getAll(Model model) {
        model.addAttribute("movies", movieDao.getAll());
        return "movieList";
    }
    
    @RequestMapping(value = "/addMovie", method = RequestMethod.GET)
    public String addBook(@ModelAttribute Movie movie) {
        return "addMovie";
    }

    @RequestMapping(value = "/movies", method = RequestMethod.POST)
    public String add(@Valid Movie movie, BindingResult result) {
        if (result.hasErrors()) {
            return "addMovie";
        } else {
            movieDao.add(movie);
            return "redirect:/movies";
        }
    }

    @RequestMapping(value = "/movies/{id}", method = RequestMethod.GET)
    public String get(@PathVariable int id, Model model) {
        model.addAttribute("movie", movieDao.get(id));
        return "movieDetail";
    }

    @RequestMapping(value = "/movies/{id}", method = RequestMethod.POST)
    public String update(@Valid Movie movie, BindingResult result, @PathVariable int id) {
        if (result.hasErrors()) {
            return "movieDetail";
        } else {
            movieDao.update(id, movie);
            return "redirect:/movies";
        }
    }

    @RequestMapping(value = "/movies/delete", method = RequestMethod.POST)
    public String delete(int movieId) {
        movieDao.delete(movieId);
        return "redirect:/movies";
    }
}
