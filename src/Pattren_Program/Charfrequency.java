package Pattren_Program;

public class Charfrequency {
	
	public static void main(String[] args) {
		
		String s="naveenkumar";
	    String vis="";
	    for(int i=0;i<s.length();i++)
	    {
	    	char ch=s.charAt(i);
	    	if(vis.indexOf(ch)==-1)
	    	{
	    		int count=0;
	    		for(int j=0;j<s.length();j++)
	    		{
	    			if(ch==s.charAt(j))
	    			{
	    				count++;
	    			}
	    			
	    		}
	    		System.out.println(ch+" "+count);
	    		vis=vis+ch;
	    		
	    	}
	    	
	    }
		
		
	}

}
