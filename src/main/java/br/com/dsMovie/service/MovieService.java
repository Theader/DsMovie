package br.com.dsMovie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.dsMovie.dto.MovieDTO;
import br.com.dsMovie.entities.Movie;
import br.com.dsMovie.repository.MovieRepository;



@Service
public class MovieService {

	@Autowired
	private MovieRepository repository;
	
	@Transactional(readOnly = true)
	public Page<MovieDTO> findAll(Pageable pageable){		
		Page<Movie> lstMovies = repository.findAll(pageable);
		Page<MovieDTO> lstMoviesDTO = lstMovies.map(x-> new MovieDTO(x));
		return lstMoviesDTO;
	}
	@Transactional(readOnly = true)
	public MovieDTO findById(Long id){
		Movie movie = repository.findById(id).get();
		MovieDTO movieDTO = new MovieDTO(movie);
		return movieDTO;
	}
}
