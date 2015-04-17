package Activity01;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of class CardTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CardTester
{    
    /**
     * Default constructor for test class LinearFunctionTest
     */
    public CardTester()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testSuit() 
    {
        Card cardN1 = new Card("King", "Hearts", 13);
        assertEquals("Hearts", cardN1.suit());
    }
    
    @Test
    public void testRank() 
    {
        Card cardN1 = new Card("Ace", "Hearts", 14);
        assertEquals("Ace", cardN1.rank());
    }
    
    @Test
    public void testPointValue() 
    {
        Card cardN1 = new Card("Jack", "Spades", 11);
        assertEquals(11, cardN1.pointValue(), 0.1);
    }
    
    @Test
    public void testMatches1() 
    {
        Card cardN1 = new Card("King", "Hearts", 13);
        Card cardN2 = new Card("4", "Diamonds", 4);
        assertEquals(false, cardN1.matches(cardN2));
    }
    
    @Test
    public void testMatches2() 
    {
        Card cardN1 = new Card("King", "Hearts", 13);
        Card cardN2 = new Card("King", "Hearts", 13);
        assertEquals(true, cardN1.matches(cardN2));
    }
    
    
     @Test
    public void testToString() 
    {
        Card cardN1 = new Card("Ace", "Clubs", 14);
        assertEquals("Ace of Clubs (point value = 14)", cardN1.toString());
    }

}