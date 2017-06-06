/**
 * 
 */
package com.eightbitplatoon.test.auto;

/**
 * @author anele
 *
 */
public class Test {

	private String getname() {
		return "Anele";
	}

	@org.junit.Test
	public void test() {
		String name = getname();
		junit.framework.TestCase.assertTrue(name.equals("Anele"));
	}

}
