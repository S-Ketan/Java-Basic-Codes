package JavaBasicCodes;

public class StringTimes {
    public String stringTimes(String str, int n) {
        String output="";
        for(int i=1; i<=n;i++){
            output+=str;
        }
        return output;
    }

    public static void main(String[] args) {
        StringTimes stringTimes = new StringTimes();
        System.out.println(stringTimes.stringTimes("Hello", 3));
        System.out.println(stringTimes.stringTimes("Hello", 0));
        System.out.println(stringTimes.stringTimes("Hello", 1));
    }
}
