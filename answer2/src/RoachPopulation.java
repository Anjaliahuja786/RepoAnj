/*
 * Anjali Ahuja
 * Student ID : 991544446
 * PROG24178 Object Oriented Programming 2 - Java
 */

/**
 *
 * @author User
 */
public class RoachPopulation {
    int populationCount = 0;
    
    public RoachPopulation(int populationCount) {
        this.populationCount = populationCount;//construto taking size of initial population
   
    }
    public void waitForDoubling() {
        populationCount = this.populationCount*2;//doubles the populationCount
    }
    public void spray() {
        double num = populationCount;
        double x;
        x = populationCount/10.0;
        num = num-x;
        populationCount = (int)num;
        
    }//spray method reduces the populationCount by 10%
    public int getRoaches(){
        return populationCount;
    }
}
