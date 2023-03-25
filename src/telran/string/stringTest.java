package telran.string;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class stringTest {
 String word = "Hello";
 String word1 = "Say";
	@Test
	void test() {
		assertEquals('e', word.charAt(1));
	}
	@Test
	void test1() {
		assertEquals(-11, word.compareTo(word1));
	}

}
