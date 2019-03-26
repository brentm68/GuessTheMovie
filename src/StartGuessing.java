import java.util.Scanner;

public class StartGuessing {

    public static void guessing() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter to make a guess: ");

        //loop until Guessed is true or 10 misses
        while (!GuessTheMovie.Guessed && GuessTheMovie.score > 0) {
            char guess = scanner.nextLine().charAt(0);
            Compare.compare(guess);
            ClearTheScreen.clearScreen();
            if (GuessTheMovie.correct > 0) {
                System.out.println("There is a letter " + guess + " in the movie name");
                System.out.println("Used letters: " + GuessTheMovie.previousGuesses);
            } else {
                ClearTheScreen.clearScreen();
                System.out.println("None of the letter " + guess + " are in the movie ");
                System.out.println("Used letters: " + GuessTheMovie.previousGuesses);
                GuessTheMovie.score -= 1;
            }
            System.out.println(GuessTheMovie.array1);

            //check if movie has been guessed yet
            GuessTheMovie.Guessed = (CheckForGuessed.check());

            if (GuessTheMovie.Guessed) {
                System.out.println("Good Job, you guessed the movie name!");
//                System.out.println(GuessTheMovie.array1);
                break;
            } else if (GuessTheMovie.score < 1) {
                ClearTheScreen.clearScreen();
                System.out.println("Too bad, no more guesses left. The movie was: " + GuessTheMovie.array1);
            } else System.out.println("Guess again:");

        }
    }
}
