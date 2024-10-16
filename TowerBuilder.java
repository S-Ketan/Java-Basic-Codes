import java.util.*;
public class TowerBuilder {
    public static String[] towerBuilder(int nFloors)
    {
      int width = nFloors*2-1;
      String []tower= new String[nFloors];
      for(int i =0; i<nFloors;i++){
        int stars = 2*(i+1)-1;
        int spaces = (width -stars)/2;
        
        String floor = " ".repeat(spaces)+"*".repeat(stars)+" ".repeat(spaces);
        tower[i]= floor;
      }
      return tower;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of floors you want in the tower : ");
       int n = sc.nextInt();
        String[] tower = towerBuilder(n);
         for (int i = 0; i < tower.length; i++) {
          System.out.println(tower[i]);   
         }
    }
}
