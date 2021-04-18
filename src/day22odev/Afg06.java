package day22odev;

import java.util.Arrays;
import java.util.Collections;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Afg06 {

	public static void main(String[] args) {
		int num1=1324;
		int num2=3172;
		String str1=String.valueOf(num1);
		String str2=String.valueOf(num2);
		String arr1[]=str1.split("");
		String arr2[]=str2.split("");
    	Arrays.sort(arr1);
    	Arrays.sort(arr2);
    	String str11="";
    	for(int i=0;i<arr1.length;i++) {
    		str11+=arr1[i];
    		
    	
    	}
    	int neunum1=Integer.valueOf(str11);
    	String str22="";
    	for(int i=0;i<arr2.length;i++) {
    		str22+=arr2[i];
    		
    	
    	}
    	int neunum2=Integer.valueOf(str22);
    	if(neunum1>neunum2)
    		System.out.println(neunum1+" büyük");
    	else {
    		System.out.println(neunum2+" büyük");
    	}
   

	}

}
