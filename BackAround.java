package JavaBasicCodes;

public class BackAround {
    public String backAround(String str) {
        String a;
        if(str.length()<=1){
            a=str;
        }else{
            a = str.substring(str.length()-1);

        }
        return a+str+a;
    }

    public static void main(String[] args) {
        BackAround ba = new BackAround();
        System.out.println(ba.backAround("a"));
        System.out.println(ba.backAround("ab"));
        System.out.println(ba.backAround("code"));
        System.out.println(ba.backAround(""));
    }
}
