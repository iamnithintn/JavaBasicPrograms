package assignment;
public class ClassicProg {
	public static void main(String[] args) {
		String s = "hello hi bye";
		String str1="";
		String str2="";
		String [] str = s.split(" ");
		int i;
		String temp;
		temp=str[0];
		str[0]=str[str.length-1];
		str[str.length-1]=temp;

		for(String m: str){
			str1+=m+" ";
		}
		System.out.println(str1);

		for(i=str1.length()-1;i>=0;i--){
			// if(str1.length()-1==' '){
			//     str2+="";
			// }
			str2+=str1.charAt(i);
		}
		System.out.println(str2);
	}
}
