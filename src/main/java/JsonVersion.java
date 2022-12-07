import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class JsonVersion {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);

        File file  = new File("src/main/resources/movies.json");
        MovieLibrary movieLibrary = objectMapper.readValue(file, MovieLibrary.class);
        System.out.println(movieLibrary);


        Scanner scanner = new Scanner(System.in);

        Menu menu = new Menu();

        switch (menu.printOptions()){
            case 1:
                System.out.println("Podaj pierwszą datę: ");
                int startDate = scanner.nextInt();
                System.out.println("Podaj drugą datę: ");
                int endDate = scanner.nextInt();
                movieLibrary.getMoviesBeetween(startDate, endDate);
                break;
            case 2:
                movieLibrary.getInfoAboutRandomMovie();
                break;
            case 3:
                System.out.println("Podaj imię aktora:: ");
                String actorFirstName = scanner.nextLine();
                System.out.println("Podaj nazwisko aktora: ");
                String actorLastName = scanner.nextLine();
                movieLibrary.displayMoviesWithActor(actorFirstName, actorLastName);
                break;
            default:
                System.out.println("Wybrałeś opcję spoza zakresu");

        }
    }
}
