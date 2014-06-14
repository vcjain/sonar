/**
 * 
 */
package com.vcjain.sonardemo;

import junit.framework.TestCase;

import org.junit.Test;

import com.vcjain.sonardemo.string.Text;

/**
 * @author vcjain
 *
 */
public class TextTest extends TestCase{

	/**
	 * Test method for {@link com.vcjain.sonardemo.string.Text#add(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testAdd() {
		Text t = new Text();
		String s1 = "Hello";
		String s2 = "Vikash";
		assertEquals("HelloVikash", t.add(s1, s2));
	}
	
	@Test
	public void testSearch1() {
		Text t = new Text();
		String s1 = "Hello";
		String s2 = "H";
		assertEquals(0, t.search1(s1, s2));
	}

}
