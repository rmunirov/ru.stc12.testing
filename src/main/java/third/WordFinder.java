package third;

import java.net.URL;
import java.util.HashSet;

public interface WordFinder {
    HashSet<String> getSentences(URL source);

    boolean checkInWordSentence(String sentence, String word);

    public void writeSentenceToResult(String sentence);
}
