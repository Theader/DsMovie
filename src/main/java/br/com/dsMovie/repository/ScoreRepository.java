package br.com.dsMovie.repository;

import br.com.dsMovie.entities.Score;
import br.com.dsMovie.entities.ScorePK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
