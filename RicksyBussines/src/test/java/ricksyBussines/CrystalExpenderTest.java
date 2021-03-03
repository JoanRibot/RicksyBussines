package ricksyBussines;

import static org.junit.Assert.assertEquals;

import org.junit.Before;

public class CrystalExpenderTest {
    CrystalExpender crystalExpender1;
    CrystalExpender crystalExpender2;
    CreditCard card;

    @Before
    public void setup(){
        crystalExpender1 = new CrystalExpender(2, 2000d);
        crystalExpender2 = new CrystalExpender(4, 200d);
        card = new CreditCard("Joan", "123456789");

    }

    public void dispatchAndStock(){
        crystalExpender1.dispatch(card);
        crystalExpender1.dispatch(card);
        crystalExpender1.dispatch(card);
        crystalExpender2.dispatch(card);
        assertEquals(0, crystalExpender1.stock());
        assertEquals(3, crystalExpender1.stock());      
    }
}
