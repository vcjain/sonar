/**
 * 
 */
package com.vcjain.sonardemo.string;

/**
 * @author vcjain
 *
 */
public class Text {

	public String add(String s1, String s2){
		return s1.concat(s2);
	}
	
	public int search(String s1, String findStr){
		return s1.indexOf(findStr);
	}
	
}
