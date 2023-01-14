package lessson.pkg8;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author student
 */
final public class Shiritori {

    private List<String> words;
    private boolean gameover;
    private String lastWords;

    public Shiritori() {
        words = new ArrayList<>();
        gameover = false;
    }

    public void play(String word) throws Exception {
        if (gameover) {
            System.out.println("Game is over. If you want to play, restart the game");
            throw new Exception();
        }
        if(words.contains(word)) {
            gameover = true;
            System.out.println("Game is over."+ word + " has already been used");
            throw new Exception();
        }
        if (lastWords != null && !(word.charAt(0) == lastWords.charAt(lastWords.length()-1))){
            gameover = true;
            System.out.println("Game is over."
                    + word +  " does not start with an '" + lastWords.charAt(lastWords.length()-1)+ "'.");
            throw new Exception();
        }
        else{
            words.add(word);
            lastWords = word;
        }
    }

    public void restart() {
        words = new ArrayList<>();
        gameover = false;
        lastWords = null;
        System.out.println("Game restarted.");
    }

    public void printWords() {
        System.out.println(words.toString());
    }

}
