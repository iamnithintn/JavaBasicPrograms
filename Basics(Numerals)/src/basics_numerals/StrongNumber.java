package basics_numerals;

import java.util.Scanner;

class StrongNumber{
public static void main(String[] args){

Scanner s = new Scanner(System.in);
int i,rem,n,fact=1,sum=0;

n = s.nextInt();
int num=n;

while(n!=0){
rem = n%10;
System.out.println(rem);
for(i=1;i<=rem;i++){
fact *=i;
System.out.println(fact);
}
n=n/10;
sum+=fact;
fact = 1;
}
System.out.println(sum);
System.out.println("sum= "+sum);
if (num==sum){
System.out.println("Strong number.");
}
else{
System.out.println("not a strong number.");
}

}

}