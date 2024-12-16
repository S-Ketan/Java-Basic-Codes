package JavaBasicCodes;

public class StringYak {
    public String stringYak(String str) {
        int end=str.length()-1;
        String result="";
        if(str.charAt(str.length()-3)=='y'&&str.charAt(str.length()-1)=='k'){
            end=str.length()-3;
        }
        for(int i=0; i<=end;i++){

            if((i+2<str.length()) && str.charAt(i)=='y'&&str.charAt(i+2)=='k' ){
                i+=2;
            }else{
                result+=str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        StringYak yak=new StringYak();
        System.out.println(yak.stringYak("yak"));
        System.out.println(yak.stringYak("yakpak"));
        System.out.println(yak.stringYak("yak123ya"));
        System.out.println(yak.stringYak("yakxxxyak"));

    }
}
