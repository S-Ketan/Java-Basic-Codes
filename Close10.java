package JavaBasicCodes;

public class Close10 {public int close10(int a, int b) {
    if(Math.abs(a-10)==Math.abs(b-10)){
        return 0;
    } else if(Math.abs(a-10)<Math.abs(b-10)){return a;}
    else{return b;}
}

    public static void main(String[] args) {
        Close10 close10 = new Close10();
        System.out.println(close10.close10(10, 11));
        System.out.println(close10.close10(11, 10));
        System.out.println(close10.close10(10, 12));
    }
}
