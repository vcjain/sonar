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
	
	public int search1(String s1, String findStr){
		String s = "Hello";
		if(s1.equalsIgnoreCase("Hello")){
			return s1.indexOf(findStr);
		}else{
			return 0;
		}
		
	}
	
}
