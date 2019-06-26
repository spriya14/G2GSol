/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		while (n-- >0){
		    int a = scan.nextInt();
		    int[] arr = new int[a];
		    
		    for (int k = 0; k<a;k++){
		        arr[k]=scan.nextInt();
		    }
		    List<Integer> res = new ArrayList<Integer>();
		    int flag =0;
		    for (int i =0; i<a-1; i++){
		        
		        for (int j = i+1; j<a;j++){
		            if (arr[j]> arr[i]){
		                res.add(arr[j]);
		                flag+=1;
		                break;
		            }
		           
		        }if (flag == 0){
		            res.add(-1);
		        }
		        
    	    
		    }
		    res.add(-1);
		    System.out.println(res);
		    
		}
	}
}