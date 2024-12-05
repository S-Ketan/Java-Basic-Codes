package JavaBasicCodes;

public class parrotTrouble {
    public static void main(String[] args) {
        parrotTrouble pt = new parrotTrouble();
        System.out.println(pt.parrotTrouble(true, 5 ));
        System.out.println(pt.parrotTrouble(false, 5));
        System.out.println(pt.parrotTrouble(true, 4));
    }
    public boolean parrotTrouble(boolean talking, int hour) {
        if(talking){
            if( (hour >= 7 && hour <= 20)){
                return false;
            }else{
                return true;
            }
        }else{
            return false;
        }
    }

}
