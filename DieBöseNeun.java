package JavaBasicCodes;

public class DieBöseNeun {
    public boolean sollÜbersprüngen(int num){
        if(num%9==0){
            return true;
        }
        String str=String.valueOf(num);
        if(str.contains("9")){
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        DieBöseNeun dbn = new DieBöseNeun();
        System.out.println(dbn.sollÜbersprüngen(5));
        System.out.println(dbn.sollÜbersprüngen(18));
        System.out.println(dbn.sollÜbersprüngen(49));
    }
}
