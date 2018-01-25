public class LongestDictionaryWord {
	public static void main(String[] args) {

    String s1 = "mabrongo";
		String[] s2 = {"mao","bale","mango","ngo","mangobr"};
		int count[] = new int[10];
		int check[] = new int[10];
		int i,j,m,n,t;
    
		for(i = 0; i < count.length; i++) {
			count[i] = 0;
			check[i] = 0;
		}
		
		for(m = 0; m < s2.length; m++) {
			count[m] = s2[m].length();
			for(i = 0; i < s2[m].length(); i++) {
				for(n = 0; n < s1.length(); n++) {
					if((s2[m].charAt(i) == s1.charAt(n)) && i >= n) {
						check[m] = check[m] + 1;
						break;
					}
				}
			}
		}
		
		for(i = 0; i < check.length-1; i++) {			
			for(j = 1;j < check.length-1;j++) {	
				if(check[i] < check[j]) {
					t = check[i];
					check[i] = check[j];
					check[j] = t;
				}
			}
		}
		
		for(i = 0;i < s2.length; i++) {
			if(check[0] == s2[i].length()) {
				System.out.println(s2[i] + " is the Largest substring here \n");
				continue;
			}
		}
	}
}
