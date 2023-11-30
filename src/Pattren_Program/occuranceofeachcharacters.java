package Pattren_Program;

import java.util.HashMap;

public class occuranceofeachcharacters {

	public static void main(String[] args) {
		HashMap<Character, Integer> hash= new HashMap<Character, Integer>();
		
		
		String s1="pooja";
		char[] c1 = s1.toCharArray();
		int countp =0;
		int counto=0;
		int countj=0;
		int counta=0;
		for(int i=0;i<c1.length;i++) {
			if(c1[i]=='p') {
				countp++;
			}
			else if(c1[i]=='o') {
				counto++;
				
			}
			else if(c1[i]=='j') {
				countj++;
			}
			else if(c1[i]=='a') {
				counta++;
			}
			
		}
		System.out.println(countp);
		System.out.println(counto);
		System.out.println(countj);
		System.out.println(counta);
	}

}


