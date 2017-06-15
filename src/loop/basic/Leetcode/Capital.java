package loop.basic.Leetcode;

public class Capital {

	public static void main(String[] args) {
		detectCapitalUse("USA");
		System.out.println(detectCapitalUse("USA"));
		System.out.println(detectCapitalUse("Maruti"));
		System.out.println(detectCapitalUse("maruti"));
		System.out.println(detectCapitalUse("UsA"));

	}

	public static boolean detectCapitalUse(String word) {
    	int count=0;
    	char ch[]=word.toCharArray();
    	for(int i=0;i<ch.length;i++){
    		if(ch[i]>=65&&ch[i]<=90){
    			count=count+1;
    			
    		}
    	}
    	/*if(count==ch.length||count==1||count==0){
    		return true;
    		
    	}*/
    	if(count==ch.length||count==0){
    		return true;
    	}
    	else if(count==1&&ch[0]>=65&&ch[0]<=90){
    		return true;
    	}
		return false;
        
    }
}