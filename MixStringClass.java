package JavaBasicCodes;

public class MixStringClass {
    public String mixString(String a, String b) {
        int minLength= Math.min(a.length(),b.length());
        String result="";
        for(int i=0;i<minLength;i++){
            result+=a.charAt(i);
            result+=b.charAt(i);
        }
        if(minLength==a.length()){
            result+=b.substring(minLength);
        }
        else if(minLength==b.length()){
            result+=a.substring(minLength);
        }
        return result;
    }

    public static void main(String[] args) {
        MixStringClass obj = new MixStringClass();
        System.out.println(obj.mixString("adsd","bdfsdd"));
        System.out.println(obj.mixString("sd","b"));
        System.out.println(obj.mixString("ad","bdfsd"));
    }
}
