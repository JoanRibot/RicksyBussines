package ricksyBussines;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RickMenuDispatcherTest {
    @Test
    public void test(){
        CreditCard card = new CreditCard("Joan", "123456789");
        RickMenuDispatcher rickMenuDispatcher = new RickMenuDispatcher();
        rickMenuDispatcher.dispatch(card);
        assertEquals(2990, card.credit(),0);
    }
}
