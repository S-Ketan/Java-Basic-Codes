package JavaBasicCodes;

public class AltPair {
    public String altPairs(String str) {
        String result="";
        int i=0;
        String ministring ="";
        while(i<=str.length()-1){
            if(i==str.length()-2 || i==str.length()-1){ministring =str.substring(i);}
            else{
                ministring = str.substring(i,i+2);}
            i+=4;
            result+=ministring;
        }
        return result ;
    }

    public static void main(String[] args) {
        AltPair ap = new AltPair();
        System.out.println(ap.altPairs("Hello"));
        System.out.println(ap.altPairs("Hi"));
        System.out.println(ap.altPairs("Heeololeo"));
        System.out.println(ap.altPairs("Helloo"));
    }
}
