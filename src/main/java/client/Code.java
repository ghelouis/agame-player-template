package client;

public class Code {
    private String letter;
    private String word;

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return "client.Code{" +
                "letter='" + letter + '\'' +
                ", word='" + word + '\'' +
                '}';
    }

}
