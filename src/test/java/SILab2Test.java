import org.example.Item;
import org.example.SILab2;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class SILab2Test {


    @Test
    public void testCartWithPriceGreaterThan300_DiscountGreaterThan0_BarcodeStartsWith0() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Banana", "67890", 200, 0));
        assertTrue(SILab2.checkCart(items, 400));
    }
}

