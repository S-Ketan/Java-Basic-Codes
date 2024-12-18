package JavaBasicCodes;

public class Last2 {
    public int last2(String str) {
        int count=0;
        if(str.length()<2){return 0;}
        String end=str.substring(str.length()-2,str.length());
        for(int i=0;i<str.length()-2;i++){
            if(str.substring(i,i+2).equals(end)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Last2 last2 = new Last2();
        System.out.println( last2.last2("xxxyyy"));
        System.out.println( last2.last2("xxxyyyzzz"));
        System.out.println( last2.last2("xxxyyyzzzxyyy"));
    }
}
