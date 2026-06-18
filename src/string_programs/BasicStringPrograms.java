package string_programs;

import java.util.HashMap;
import java.util.Map;

public class BasicStringPrograms {
public static void main(String[] args) {
//	firstAndLastWords("Hello");
//	System.out.println(palindrome("malayalam"));
//	System.out.println(numberCheck("12345678c"));
//	numberOfUpperAndLowerCase("Hello guys HOW ARE you?");
//	System.out.println(toUpperCase("hello"));
	System.out.println(toLowerCase("hello"));
	
}
static void allSubstrings(String s) {
	for(int i = 0 ; i < s.length() ; i++) {
		for(int j = i ; j < s.length(); j ++) {
			System.out.println(s.substring(i,j+1));
		}
	}
}
static String reverseMessage(String s) {
	
	return new StringBuffer(s).reverse().toString();
}
static String longestWordInString(String s) {
	String[] res = s.trim().split(" ");
	int n = res.length;
	int max = 0;
	StringBuffer sf = null;
	for(int i = 0 ; i < n ; i++) {
		if(res[i].length()>max) {
			max = res[i].length();
			sf = new StringBuffer(res[i]);
		}
	}
	return sf.toString();
}
static String reverseWords(String s) {
	String[] res = s.trim().split(" ");
	
	int n = res.length;
	int i = 0 ;
	int j = n-1;
	while(i<j) {
		String temp = res[i];
		res[i]=res[j];
		res[j]=temp;
		i++;
		j--;
	}
	StringBuffer sf = new StringBuffer();
	for(int k = 0 ; k < n ; k++) {
		sf.append(res[k]).append(" ");
	}
	return sf.toString();
}
static void firstDuplicateAndDistinct(String s) {
	Map<String , Integer>seen = new HashMap<>();
	String[]res = s.trim().split(" ");
	for(String st : res) {
		seen.put(st, seen.getOrDefault(st, 0)+1);
	}
	for(String st : res) {
		if(seen.get(st)>=2) {
			System.out.println("First duplicate : "+st);
			break;
		}
	}
	System.out.println("  --  ");
	for(String st : res) {
		if(seen.get(st)==1) {
			System.out.println("First distinct : "+st);
			break;
		}
	}
	
}
static String replaceCharacters(String s, char oldChar, char newChar) {
 StringBuilder sb = new StringBuilder();

 for(char c : s.toCharArray()) {
     if(c == oldChar)
         sb.append(newChar);
     else
         sb.append(c);
 }

 return sb.toString();
}
static String replaceFirstAndLastWords(String s) {
 String[] res = s.trim().split(" ");

 String temp = res[0];
 res[0] = res[res.length - 1];
 res[res.length - 1] = temp;

 StringBuilder sb = new StringBuilder();

 for(String str : res)
     sb.append(str).append(" ");

 return sb.toString().trim();
}
static void palindromeStrings(String[] arr) {
 for(String s : arr) {

     String rev = "";

     for(int i = s.length() - 1; i >= 0; i--)
         rev += s.charAt(i);

     if(s.equals(rev))
         System.out.println(s);
 }
}
static char firstNonRepeating(String s) {

 for(int i = 0; i < s.length(); i++) {

     int count = 0;

     for(int j = 0; j < s.length(); j++) {
         if(s.charAt(i) == s.charAt(j))
             count++;
     }

     if(count == 1)
         return s.charAt(i);
 }

 return '\0';
}
static void printNonRepeating(String s) {

 for(int i = 0; i < s.length(); i++) {

     int count = 0;

     for(int j = 0; j < s.length(); j++) {
         if(s.charAt(i) == s.charAt(j))
             count++;
     }

     if(count == 1)
         System.out.print(s.charAt(i) + " ");
 }
}
static String removeDuplicates(String s) {

 StringBuilder sb = new StringBuilder();

 for(int i = 0; i < s.length(); i++) {

     if(sb.indexOf(String.valueOf(s.charAt(i))) == -1)
         sb.append(s.charAt(i));
 }

 return sb.toString();
}
static boolean isAnagram(String s1, String s2) {

 if(s1.length() != s2.length())
     return false;

 char[] a = s1.toCharArray();
 char[] b = s2.toCharArray();

 java.util.Arrays.sort(a);
 java.util.Arrays.sort(b);

 return java.util.Arrays.equals(a, b);
}
static char mostFrequent(String s) {

 int max = 0;
 char res = '\0';

 for(int i = 0; i < s.length(); i++) {

     int count = 0;

     for(int j = 0; j < s.length(); j++) {
         if(s.charAt(i) == s.charAt(j))
             count++;
     }

     if(count > max) {
         max = count;
         res = s.charAt(i);
     }
 }

 return res;
}
static String reverseWordsInString(String s) {

 String[] arr = s.split(" ");

 StringBuilder sb = new StringBuilder();

 for(int i = arr.length - 1; i >= 0; i--)
     sb.append(arr[i]).append(" ");

 return sb.toString().trim();
}
static String removeCharacter(String s, char ch) {

 StringBuilder sb = new StringBuilder();

 for(char c : s.toCharArray()) {
     if(c != ch)
         sb.append(c);
 }

 return sb.toString();
}
static void countOccurrences(String s) {

 for(int i = 0; i < s.length(); i++) {

     if(s.indexOf(s.charAt(i)) == i) {

         int count = 0;

         for(int j = 0; j < s.length(); j++) {
             if(s.charAt(i) == s.charAt(j))
                 count++;
         }

         System.out.println(s.charAt(i) + " -> " + count);
     }
 }
}
static void countTypes(String s) {

 int upper = 0, lower = 0, digit = 0, special = 0;

 for(char c : s.toCharArray()) {

     if(c >= 'A' && c <= 'Z')
         upper++;
     else if(c >= 'a' && c <= 'z')
         lower++;
     else if(c >= '0' && c <= '9')
         digit++;
     else
         special++;
 }

 System.out.println("Upper = " + upper);
 System.out.println("Lower = " + lower);
 System.out.println("Digit = " + digit);
 System.out.println("Special = " + special);
}
static void maxOccurrenceCharss(String s) {

 int max = 0;

 for(int i = 0; i < s.length(); i++) {

     int count = 0;

     for(int j = 0; j < s.length(); j++) {
         if(s.charAt(i) == s.charAt(j))
             count++;
     }

     if(count > max)
         max = count;
 }

 for(int i = 0; i < s.length(); i++) {

     int count = 0;

     for(int j = 0; j < s.length(); j++) {
         if(s.charAt(i) == s.charAt(j))
             count++;
     }

     if(count == max && s.indexOf(s.charAt(i)) == i)
         System.out.print(s.charAt(i) + " ");
 }
}
static void swapStrings(String s1, String s2) {

 s1 = s1 + s2;
 s2 = s1.substring(0, s1.length() - s2.length());
 s1 = s1.substring(s2.length());

 System.out.println("s1 = " + s1);
 System.out.println("s2 = " + s2);
}
static void countOfChar(String s) {
	char[]ss = s.toCharArray();
	
	int[]freq = new int[26];
	
	for(char c : ss) {
		
		int x = c - 'a';
		freq[x]++;
	}
	int j = 97;
	for(int i = 0 ; i < freq.length ; i++) {
		
		System.out.println((char)(j)+" - > "+freq[i]);
		j++;
	}
}
static String lightWeight(String s) {
	StringBuffer sf = new StringBuffer();
	char[]ch = s.toCharArray();
	int count = 1;
	for(int i = 0 ; i< s.length()-1; i++) {
		if(ch[i]==ch[i+1]) {
			count++;
		}
		else {
			sf.append(count).append(ch[i]);
			count=1;
		}	
	}
	sf.append(count).append(ch[s.length()-1]);
	return sf.toString();
}
public static int stringToBinary(String s) {
	int sum=0;
	int n = s.length()-1;
	for(char c : s.toCharArray()) {
		int a = c-'0';
		sum+=(a*Math.pow(2, n--));
	}
	return sum;
}

public static String decimalToBinary(int a) {
	StringBuffer sf = new StringBuffer();

	while(a>0) {
		int n = a%2;
		sf.append(n);
		a/=2;
	}
	return sf.reverse().toString();
	
}
static void printAllCharacters(String s) {
	for(char c : s.toCharArray()) {
		System.out.print(c+",");
	}
}
static String reverseTheString(String s) {
	String result = "";
	for(int i = s.length()-1;i>=0;i--) {
		result=result+(s.charAt(i));
	}
	return result;
}
static int numberOfWords(String s) {
	return s.split(" ").length;
}

static void vowelsAndConsonants(String s) {
	int vowels = 0;
	int consonants=0;
	String S = s.toLowerCase();
	for(char c : S.toCharArray()) {
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
			vowels++;
		}
		else if(c==' ') {
			continue;
		}
		else {
			consonants++;
		}
	}
	System.out.println("Vowels are : "+vowels+"\nConsonants are : "+consonants);
}

static void firstAndLastWords(String s) {
	String[]arr = s.split(" ");
	System.out.println("First word : "+arr[0]);
	System.out.println("Last word : "+arr[arr.length-1]);
}
static boolean palindrome(String s) {
	int i =0;
	int j = s.length()-1;
	while(i < j) {
		if(s.charAt(i)!=s.charAt(j)) {
			return false;
		}
		i++;
		j--;
	}
	return true;
}

static boolean numberCheck(String s) {
	for(char c : s.toCharArray()) {
		if(!Character.isDigit(c)) {
			return false;
		}
	}
	return true;
}

static void numberOfUpperAndLowerCase(String s) {
	int lo = 0;
	int up = 0;
	for(char c : s.toCharArray()) {
		if(Character.isUpperCase(c)) {
			up++;
		}
		else{
			lo++;
		}
	}
	System.out.println("Upper case letters : "+up);
	System.out.println("Lower case letters : "+lo);
}

static String toUpperCase(String s) {
	String result = "";
	for(char c : s.toCharArray()) {
		if(Character.isUpperCase(c)) {
			result = result + c;
		}
		else {
			char a =(char)(c-32);
			result = result + a;
		}
	}
	return result;
}
static String toLowerCase(String s) {
	String result = "";
	for(char c : s.toCharArray()) {
		if(Character.isLowerCase(c)) {
			result = result + c;
		}
		else {
			char a =(char)(c+32);
			result = result + a;
		}
	}
	return result;
}
}