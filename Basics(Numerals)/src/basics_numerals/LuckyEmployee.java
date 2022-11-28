package basics_numerals;
import java.util.Scanner;

public class LuckyEmployee {
public static void main(String[] args){
Scanner s = new Scanner(System.in);
int i,n,rem,count = 1,ref=0,sum=0;

n = s.nextInt();
s.close();

while(count<=4){
rem = n%10;
sum+=rem;
n=n/10;
count++;
}
System.out.println(sum);
for (i=2; i<sum;i++){
if((sum%i)==0){
ref+=1;
break;
}
}
if (ref==0){
System.out.println("lucky employee");
}
else{
System.out.println("unlucky employee");
}
}
}


