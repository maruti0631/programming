package loop.basic.Leetcode;

public class ReverseWords {

	public static void main(String[] args) {
		/*String s1=reverseWords("Let's take LeetCode contest");
		System.out.println(s1);*/
		String s1="Let's take LeetCode contest";
		/*String a[]=s1.split(" ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(reverseWords(a[i])+" ");
		}*/
		
		System.out.println(resv(s1));
System.out.println(new StringBuffer(s1).reverse());
		
	}

	public static String resv(String s) {
		String a[] = s.split(" ");
		String r = "";
		for (int i = 0; i < a.length; i++) {
			r += reverseWords(a[i]) + " ";
		}
		return r.trim();
	}

	public static String reverseWords(String s) {

		char[] ch = s.toCharArray();
		String st = "";
		//for (int i = ch.length - 1; i >= 0; i--) {
			//st = st + ch[i];
		//}
           for(int i=0; i<ch.length; i++){
        	   char ch1=ch[i];
        	   ch[i]=ch[ch.length-1-i];
        	   ch[ch.length-1-i]=ch1;
           }
		return st;

	}
}
