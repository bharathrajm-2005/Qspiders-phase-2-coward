package string_programs;

import java.io.*;

class Result {


	public static int romanToInt(String s) {
    int[]freq = new int[128];
    freq['M']=1000;
    freq['D']=500;
    freq['C']=100;
    freq['L']=50;
    freq['X']=10;
    freq['V']=5;
    freq['I']=1;
    
    int count = 0;
    
    for(int i = 0 ; i < s.length()-1; i++) {
    	if(freq[s.charAt(i)]<freq[s.charAt(i)+1]) {
    		count+=(freq[s.charAt(i)+1]-freq[s.charAt(i)]);
    	}
    	else {
    		count+=freq[s.charAt(i)];
    	}
    }
    
    count+=freq[s.charAt(s.length())];
    return count;

}
}

public class Solution {
    public static void main(String[] args) throws IOException {

        String s = "MCMXCIV";
        int result = Result.romanToInt(s);
        
        System.out.println(result);

    }
}
