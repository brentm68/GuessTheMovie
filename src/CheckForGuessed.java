public class CheckForGuessed {

public static boolean check() {
        int charsThatAreDashes = 0;
        int charsThatAreLetters = 0;
        for (int count = 0; count < GuessTheMovie.nameOfMovie.length(); count++) {

            if (GuessTheMovie.array1[count] == '-') {
                charsThatAreDashes += 1;
            }
            else if (GuessTheMovie.array1[count] != '-') {
                charsThatAreLetters += 1;
            }
        }return (charsThatAreLetters == GuessTheMovie.nameOfMovie.length());
    }
}
