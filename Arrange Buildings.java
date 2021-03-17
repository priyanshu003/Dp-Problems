/*1. You are given a number n, which represents the length of a road. The road has n plots on it's each side.
2. The road is to be so planned that there should not be consecutive buildings on either side of the road.
3. You are required to find and print the number of ways in which the buildings can be built on both side of roads.*/
import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);
  long n = sc.nextLong();
  long obb = 1;   //oldbuilding building 
  long obs = 1;//oldbuilding space 
  for(long i = 2;i<=n;i++){
      long nbb = obs; //new buildingbuilding
      long nbs = obb + obs;
      obs = nbs;
      obb = nbb;
  }
  
  long total = obs + obb;
  System.out.println(total*total);
 }

}
