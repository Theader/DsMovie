package br.com.dsMovie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dsMovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie,Long> {

}
