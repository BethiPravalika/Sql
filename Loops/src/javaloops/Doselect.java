package javaloops;


class Punctuation{
	int countPunctuation(String str) {
		int count=0;
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i)=='!'||str.charAt(i)==','||str.charAt(i)=='.'||str.charAt(i)=='?'||str.charAt(i)==';')
				count++;
			}
	}
	return count;
	}

public class Doselect {

	public static void main(String[] args) {
       //Scanner sc=new Scanner(System.in);
		//String str=sc.next();
		String str="What is your name?My name is Pravalika.";
		Punctuation p=new Punctuation();
		System.out.println(p.countPunctuation(str));
	}

}
