import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Files {

    //method to pick the movie
    static String pickMovie() throws FileNotFoundException {
        //open file
        File list = new File("movies.txt");
        List<String> movieList = new ArrayList<>();
        Scanner input = new Scanner(list);

        //read into list
        while (input.hasNextLine()) {
            movieList.add(input.nextLine());
        }

        //pick the movie
        int movie = (int) (Math.random() * 7);
        Object movieArray[] = movieList.toArray();

        //return movie name
        return (String) movieArray[movie];
    }
}
