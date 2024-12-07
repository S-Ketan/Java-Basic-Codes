package JavaBasicCodes;

public class diff21 {
    public static void main(String[] args) {
        diff21 d21 = new diff21();
        System.out.println(d21.diff21(19));
        System.out.println(d21.diff21(10));
        System.out.println(d21.diff21(21));
        System.out.println(d21.diff21(29));
    }
    public int diff21(int n) {
        if(n>21){
            return (n -21)*2;
        }else{
            return 21-n;
        }
    }

}
