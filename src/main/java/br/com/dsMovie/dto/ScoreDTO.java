package br.com.dsMovie.dto;

public class ScoreDTO {
    private Long movieId;
    private String email;
    private Double score;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public ScoreDTO(){

    }
    public Long getMovieId(){
        return movieId;
    }
    public void setMovieId(Long movieId){
        this.movieId = movieId;
    }
}
