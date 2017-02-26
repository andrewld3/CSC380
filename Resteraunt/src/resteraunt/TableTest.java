package table;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TableTest {
	
	Table testTable = new Table();
	Table table = new Table();

	@Test
	public void testList() {

		testTable.LoadTable();
		table.LoadTable();
		assertEquals("Tables are equal", table.ReturnOrder(), testTable.ReturnOrder());
	}
	
	@Test
	public void testEdit() {

		testTable.LoadTable();
		table.LoadTable();
		testTable.EditOrder();
		assertNotSame("Tables are changed", table.ReturnOrder(), testTable.ReturnOrder());
	}
	
	@Test
	public void testBill() {
		testTable.LoadTable();
		testTable.PrintBill();
		assertEquals(testTable.ReturnTotal(), 27.2475, 0);
	}
}
