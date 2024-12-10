package JavaBasicCodes;

public class CountXX {
    int countXX(String str) {
        int count=0;
        for(int i =0;i<str.length()-1;i++){
            if(str.startsWith("xx", i)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        CountXX countXX = new CountXX();
        System.out.println( countXX.countXX("axxxbyx"));
        System.out.println( countXX.countXX("axsdckdch"));
        System.out.println( countXX.countXX("axxxbxxxxx"));
        System.out.println( countXX.countXX("xxxibxixx"));

    }
}
