public class InitialLineOfDashes {
    public static void createArray() {
        GuessTheMovie.array1 = new char[GuessTheMovie.nameOfMovie.length()];
        for(int count=0;count<GuessTheMovie.array1.length;count++) {
            if (GuessTheMovie.nameOfMovie.charAt(count) == ' ') {
                GuessTheMovie.array1[count] = ' ';
            }else GuessTheMovie.array1[count] = '-';
        }
    }
}
