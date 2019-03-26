import java.io.FileNotFoundException;

public class GuessTheMovie {

    //declare static variables
    public static String nameOfMovie;
    public static int correct;
    public static int incorrect;
    public static boolean Guessed = false;
    public static int score = 10;
    public static char[] array1;
    public static char answer;
    //main method
    public static void main(String[] args) throws FileNotFoundException {

        //pick the movie
        nameOfMovie = Files.pickMovie();

        //create the array of dashes
        InitialLineOfDashes.createArray();

         //Explain the game
        System.out.println("Guess the movie, here are how many letters there are: ");

        //print the dashes
        System.out.println(array1);

        //start guessing
        StartGuessing.guessing();
    }
}