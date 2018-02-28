package Model.CardPackage;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/******************************************************************
 * this tests all methods in the Card class to make sre they are
 * working properly.
 *
 * @author Sanitago Quiroga
 * @version 3/01/2018
 ******************************************************************/
public class CardTest {
    Card card;

    /******************************************************************
     *
     * @throws Exception
     *******************************************************************/
    @Before
    public void setUp() throws Exception {
        card = new Card("TEST",
                true,new int []{-1,-1,-1,-1,-1,-1,-1,-1,-1});
    }

    /******************************************************************
     *This method checks that the getter return the correct card
     * Description
     *
     * @throws Exception if test goes wrong
     *******************************************************************/
    @Test
    public void getCardDescription() throws Exception {
        assertTrue(card.getCardDescription().equals("TEST"));
    }

    /******************************************************************
     * This method checks if the vardType for chance is set correctly
     *
     * @throws Exception if test goes wrong
     *******************************************************************/
    @Test
    public void getCardType() throws Exception {
        assertTrue(card.getCardType());
    }

    /******************************************************************
     *This method checks if the array was properly set.
     *
     * @throws Exception if test goes wrong
     *******************************************************************/
    @Test
    public void getActions() throws Exception {
        assertArrayEquals(new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1},
                card.getActions());
    }
}