package Pattren_Program;

public class Occurance {
public static void main(String[] args) {
	String s1="aabbc";
	char[] c2 = s1.toCharArray();
	int counta=0;
	int countb=0;
	int countc=0;
	for(int i=0;i<c2.length;i++) {
		if(c2[i]=='a') {
		counta++;

		}
		else if(c2[i]=='b') {
			countb++;
			
		}
		else if(c2[i]=='c') {
			countc++;
		}
	}
	
	System.out.print('a');
	System.out.print(counta);
    System.out.print('b');
	System.out.print(countb);
	System.out.print('c');
	System.out.print(countc);
	
}
}
