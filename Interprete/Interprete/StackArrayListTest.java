package Interprete;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StackArrayListTest {

	@Test
	void testPush() {
		StackArrayList<Integer> miStack = new StackArrayList<Integer>();
		miStack.push(5);
		assertEquals(5, miStack.peek());
	}

	@Test
	void testPull() {
		StackArrayList<Integer> miStack = new StackArrayList<Integer>();
		miStack.push(5);
		assertEquals(5, miStack.pull());
	}

	@Test
	void testPeek() {
		StackArrayList<Integer> miStack = new StackArrayList<Integer>();
		miStack.push(5);
		assertEquals(5, miStack.peek());
	}

	@Test
	void testGet() {
		StackArrayList<Integer> miStack = new StackArrayList<Integer>();
		miStack.push(5);
		miStack.push(4);
		miStack.push(3);
		assertEquals(4, miStack.get(1));
	}


	@Test
	void testRemove() {
		StackArrayList<Integer> miStack = new StackArrayList<Integer>();
		miStack.push(5);
		miStack.push(4);
		miStack.push(3);
		miStack.remove(1);
		assertEquals(3, miStack.get(1));
	}

	@Test
	void testCount() {
		StackArrayList<Integer> miStack = new StackArrayList<Integer>();
		miStack.push(5);
		miStack.push(3);
		miStack.push(3);
		assertEquals(3, miStack.count());
	}

	@Test
	void testIsEmpty() {
		StackArrayList<Integer> miStack = new StackArrayList<Integer>();
		assertEquals(true, miStack.isEmpty());
	}

}
