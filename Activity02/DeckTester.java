package Activity02;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    String[] ranks1 = {"4", "3", "2", "1"};
    String[] suits1 = {"Fairy", "Spellcaster"};
    int[] pointValues1 = {1600, 1200, 1100, 800};

    String[] ranks2 = {"8", "6"};
    String[] suits2 = {"Warrior", "Dragon", "Beast"};
    int[] pointValues2 = {3000, 2200};

    String[] ranks3 = {"4"};
    String[] suits3 = {"Plant", "Fiend", "Psychic", "Machine"};
    int[] pointValues3 = {1200};

    Deck deck1 = new Deck(ranks1, suits1, pointValues1);
    Deck deck2 = new Deck(ranks2, suits2, pointValues2);
    Deck deck3 = new Deck(ranks3, suits3, pointValues3);

    /**
     * Default constructor for test class DeckTester
     */
    public DeckTester()
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
    public void testIsEmpty() 
    {
        deck3.deal();
        deck3.deal();
        deck3.deal();
        deck3.deal();
        assertEquals(true, deck3.isEmpty());
    }
    
    @Test
    public void testIsEmpty2()
    {
        deck2.deal();
        assertEquals(false, deck2.isEmpty());
    }
    
    @Test
    public void testSize1()
    {
        deck1.deal();
        assertEquals(7, deck1.size(), 0.1);
    }
    
    @Test
    public void testSize2()
    {
        assertEquals(4, deck3.size(), 0.1);
    }
    
    @Test
    public void testSize3()
    {
        deck2.deal();
        assertEquals(5, deck2.size(), 0.1);
    }
    
    @Test
    public void testDeal()
    {
        deck3.deal();
        deck3.deal();
        deck3.deal();
        deck3.deal();
        assertEquals(null, deck3.deal());
    }
    
}


