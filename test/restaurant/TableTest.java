package restaurant;

import static org.junit.Assert.*;
import java.util.Map;
import java.util.HashMap;

import org.junit.Test;

public class TableTest {

    @Test
    public void testList() {
        Table testTable = new Table();
        Table table = new Table();
        testTable.addToOrder("Hamburger"); 
        table.addToOrder("Hamburger");
        assertTrue(table.returnOrder().equals(testTable.returnOrder()));
    }

    @Test
    public void testEdit() {   
        Table testTable = new Table();
        Table table = new Table();
        testTable.addToOrder("Hamburger");
        table.addToOrder("Hamburger");
        testTable.removeFromOrder("Hamburger");
        assertFalse(table.returnOrder().equals(testTable));
    }

    @Test
    public void testSubtotal() {
        Table testTable = new Table();

        Map<String, MenuItem> menu = new HashMap<String, MenuItem>();
        menu.put("Hamburger", new MenuItem("Hamburger", 10.50, 50));
        menu.put("Hotdog", new MenuItem("Hotdog", 3.50, 50));

        testTable.addToOrder("Hamburger");
        testTable.addToOrder("Hotdog");

        assertEquals(testTable.getSubtotal(menu), 14.0, 0);
    }

    @Test
    public void testTax(){
        Table testTable = new Table();

        Map<String, MenuItem> menu = new HashMap<String, MenuItem>();
        menu.put("Hamburger", new MenuItem("Hamburger", 10.50, 50));
        menu.put("Hotdog", new MenuItem("Hotdog", 3.50, 50));

        testTable.addToOrder("Hamburger");
        testTable.addToOrder("Hotdog");

        assertEquals(testTable.getTax(menu), 1.12, 0);
    }

    @Test
    public void testTotal(){
        Table testTable = new Table();

        Map<String, MenuItem> menu = new HashMap<String, MenuItem>();
        menu.put("Hamburger", new MenuItem("Hamburger", 10.50, 50));
        menu.put("Hotdog", new MenuItem("Hotdog", 3.50, 50));

        testTable.addToOrder("Hamburger");
        testTable.addToOrder("Hotdog");

        assertEquals(15.12, testTable.ReturnTotal(menu), .01);
    }
}