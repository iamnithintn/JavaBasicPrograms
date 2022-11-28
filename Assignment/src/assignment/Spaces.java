package assignment;
public class Spaces {
    public static void main(String[] args) {
        String s = "hi  hello  bye    hi";
        int i;
        String s1="";


        for(i=0;i<s.length();i++){
                                                                                                    // char c1 = s.charAt(i);
                                                                                                    // char c2 = s.charAt(i+1);
            if(s.charAt(i)!=' '){
                s1+=s.charAt(i);
            }
            else if(s.charAt(i)==' '&& s.charAt(i+1)!=' ' ){
                s1+=s.charAt(i);
            }

        }                                                                                            // if(c[i]==' '&& c[i+1]==' '){
                                                                                                    //     s1+="";
                                                                                                    // }
                                                                                                    // else if(c[i]==' ' && c[i+1]!=' '){
                                                                                                    //     s1+=c[i+1];
                                                                                                    // }
        
        System.out.println(s1);                                                                     // System.out.println(s1);
                                                                                                    //     for(j=1;j<c.length;j++){
                                                                                                    //         if(c[i]==' ' && c[j]==' '){
                                                                                                    //             s1+="";
                                                                                                    //         }
                                                                                                    //         else if (c[i]==' ' && c[j]!=' '){
                                                                                                    //             s1+=c[j];
                                                                                                    //         }
                                                                                                    //     }
                                                                                                    // }
                                                                                                    // System.out.println(s1);
        
    }
}
