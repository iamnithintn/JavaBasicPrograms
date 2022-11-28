package assignment;
// import java.util.Scanner;

// public class ArmStrongNumber {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         while(true){
//             System.out.print("Enter the number : ");
//             int n = s.nextInt();
//             int m =n;
//             int x = m;
//             int rem,rem1,prod=1,j,count=0,sum=0;

//             while(n!=0){
//                 rem = n%10;
//                 count++;
//                 n = n/10;
//             }
//             while(m!=0){
//                 rem1=m%10;
//                 for(j=0;j<count;j++){
//                     prod*=rem1;
//                 }
//                 // System.out.println("prod "+prod);
//                 m=m/10;
//                 sum+=prod;
//                 prod=1;
//             }
//             // System.out.println(m);
//             // System.out.println(sum);
//             System.out.println((x==sum)?"Armstrong":"Not Armstrong");

//             System.out.print("Continue? N for no, any key for yes : ");
//             char c = s.next().charAt(0);

//             if(c=='n'||c=='N'){
//                 break;
//             }
//         }
//         s.close();
//     }
// }
