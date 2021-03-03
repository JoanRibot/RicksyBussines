package ricksyBussines;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CreditCardTest{

    private CreditCard card = null;

    @Before
    public void setup_card(){
        card = new CreditCard("Joan", "123456789");
        assertNotNull(card);
}
    @Test
     public void constructorTest(){
        assertNotNull(card);
        assertEquals("Joan",card.getOwner());
        assertEquals("123456789",card.number());
}
@Test
public void payTestOK() {
    card.pay(2500);
    assertEquals(500, card.credit(), 0);
    card.pay(3300);
    assertEquals(500, card.credit(), 0);
    }
}
