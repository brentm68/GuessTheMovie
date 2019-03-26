public class InitialLineOfDashes {
    public static void createArray() {
        GuessTheMovie.array1 = new char[GuessTheMovie.nameOfMovie.length()];
        for(int count=0;count<GuessTheMovie.nameOfMovie.length();count++) {
            if (GuessTheMovie.nameOfMovie.indexOf(' ') == count) {
                GuessTheMovie.array1[count] = ' ';
            }else GuessTheMovie.array1[count] = '-';
        }
    }
}
