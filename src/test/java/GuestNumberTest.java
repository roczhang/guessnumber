import com.yg.GuessNumberGame;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by I076057 on 3/24/2018.
 */
public class GuestNumberTest {
    @Test
    public void test_one_number_with_guess_yes() throws Exception {


        GuessNumberGame game = getGuessNumberGame("1");
        String answer = game.guess("1");
        assertThat("guess one number", answer, is("1A0B"));

    }


    @Test
    public void test_one_number_with_guess_no() throws Exception {

        GuessNumberGame game = getGuessNumberGame("1");
        String answer = game.guess("2");
        assertThat("guess one number", answer, is("0A0B"));

    }


    @Test
    public void test_two_number_with_0A0B() throws Exception {


         GuessNumberGame game = getGuessNumberGame("23");
         String answer = game.guess("01");
         assertThat("guess two number", answer, is("0A0B"));
    }

    @Test
    public void test_two_number_with_0A1B_1st_Match() throws Exception {


        GuessNumberGame game = getGuessNumberGame("23");
        String answer = game.guess("12");
        assertThat("guess two number", answer, is("0A1B"));

    }

    @Test
    public void test_two_number_with_0A1B_2nd_match() throws Exception {


        GuessNumberGame game = getGuessNumberGame("23");
        String answer = game.guess("31");
        assertThat("guess two number", answer, is("0A1B"));

    }


    @Test
    public void test_two_number_with_2A0B_1nd_match() throws Exception {

        GuessNumberGame game = getGuessNumberGame("13");
        String answer = game.guess("13");
        assertThat("guess two number", answer, is("2A0B"));

    }


    @Test
    public void test_two_number_with_0A2B_1nd_match() throws Exception {

        GuessNumberGame game = getGuessNumberGame("13");
        String answer = game.guess("31");
        assertThat("guess two number", answer, is("0A2B"));

    }


    @Test
    public void test_3__number_with_2A1B_1nd_match() throws Exception {

        GuessNumberGame game = getGuessNumberGame("133");
        String answer = game.guess("132");
        assertThat("guess two number", answer, is("2A1B"));

    }



    private GuessNumberGame getGuessNumberGame(String secret) {
        return new GuessNumberGame(secret);
    }
}
