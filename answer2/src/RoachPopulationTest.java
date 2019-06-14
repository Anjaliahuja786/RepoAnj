/*
 * Anjali Ahuja
 * Student ID : 991544446
 * PROG24178 Object Oriented Programming 2 - Java
 */

/**
 *
 * @author User
 */
public class RoachPopulationTest {
    public static void main(String[] args) {
        RoachPopulation number = new RoachPopulation(10);
        
        for(int i =1;i<5;i++) {
            number.waitForDoubling();
            number.spray();
            System.out.println(number.getRoaches());
        }
    }
    
}
