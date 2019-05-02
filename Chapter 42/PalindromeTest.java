package ch42_03;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeTest {

	@Test
	public void testReverse() {
		assertEquals(Palindrome.reverse(123), 321);
		assertEquals(Palindrome.reverse(5124), 4215);
		assertEquals(Palindrome.reverse(123), 321);
		

	}
	public void testisPalindrome() {
		assertTrue(Palindrome.isPalindrome(323));
		assertFalse(Palindrome.isPalindrome(322));
	}
}
