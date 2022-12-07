import javax.swing.*;
import java.util.List;

public class MovieLibrary {
    private List<Movie> movies;

    public MovieLibrary(List<Movie> movies) {
        this.movies = movies;
    }
    public MovieLibrary(){
    }
    public List<Movie> getMovies() {
        return movies;
    }
    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public void getMoviesBeetween(int startYear, int endYear){
        for (Movie movie : movies){
            if (movie.getYear() >= startYear && movie.getYear() <= endYear){
                System.out.println(movie.getTitle());
            }
        }
    }
    public void getInfoAboutRandomMovie(){
        int random = (int) (Math.random() * movies.size());
        System.out.println(movies.get(random).toString());
    }
    public void displayMoviesWithActor(String firstName, String lastName){
        for (Movie movie : movies){
            for (Actor actor : movie.getActors()){
                if (actor.getFirstName().equals(firstName) && actor.getLastName().equals(lastName)){
                    System.out.println(movie.getTitle());
                }
            }
        }
    }


}
