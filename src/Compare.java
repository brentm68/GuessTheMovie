public class Compare {

//    static String lineToPrint = new String();

    public static void compare(char guess) {

        int lengthOfMovie = (GuessTheMovie.nameOfMovie.length());
        int count = 0;
        GuessTheMovie.correct = 0;
        GuessTheMovie.incorrect = 0;

        while (count < lengthOfMovie) {
            if ((GuessTheMovie.nameOfMovie.charAt(count) == guess)) {
                GuessTheMovie.correct++;
                GuessTheMovie.array1[count] = guess;
                count++;
            } else {
                GuessTheMovie.incorrect++;
                count++;
            }
        } GuessTheMovie.previousGuesses += guess;
//        return GuessTheMovie.array1;
    }
}
