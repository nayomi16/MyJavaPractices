package IQ;

public class StringReverse {

    public static void main(String[] args) {
        String str="lochana ##$#@!@$$%% aa";
        String revstr="";

        /*for(int i=str.length()-1; i>=0; i--){
            revstr+=str.charAt(i);
        }

        System.out.println(revstr);*/
/*

        String[] s = str.split(" ");
        for (int i=s.length-1; i>=0; i--){
            revstr+=s[i]+" ";
        }
        System.out.println(revstr);
*/

        /*StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println(stringBuffer.reverse());
*/

        str=str.replaceAll("[^a-zA-z0-9]", "");
        System.out.println(str);

    }
}
