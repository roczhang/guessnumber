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


        if (secret.length() == 2) {

            if (contains(guess.charAt(1))
                    && !SamePositionCompare(guess, 1)) {

                return "0A1B";
            }

            if (contains(guess.charAt(0)) &&
                    !SamePositionCompare(guess, 0)) {
                return "0A1B";
            }
        }

        return this.secret.equals(guess) ? "1A0B" : "0A0B";
    }

    private boolean SamePositionCompare(String guess, int index) {
        return guess.charAt(index) == secret.charAt(index);
    }

    private boolean contains(char guess) {
        return secret.indexOf(guess) != -1;
    }
}
