package com.yg;

/**
 * Created by I076057 on 3/24/2018.
 */
public class GuessNumberGame {
    private final String secret;

    public GuessNumberGame(String secret) {
        this.secret = secret;
    }

    public String guess(String guess) {

        int countA = 0;
        int countB = 0;
        for (int i = 0; i < guess.length(); i++) {

            if (matchAType(this.secret, guess, i)) {
                countA += 1;
            }
            if (matchBType(guess, i)) {
                countB += 1;
            }
        }
        return new Integer(countA) + "A" + new Integer(countB) + "B";
    }

    private boolean matchAType(String secret, String guess, int i) {

        return secret.charAt(i) == guess.charAt(i);
    }

    private boolean matchBType(String guess, int i) {

        String numberBefore_i = this.secret.substring(0, i);
        String numberAfter_i="";
        if (i + 1 < guess.length()) {
             numberAfter_i = numberBefore_i + secret.substring(i + 1);
        }

        return (numberBefore_i + numberAfter_i).indexOf(guess.charAt(i)) != -1;

    }

}
