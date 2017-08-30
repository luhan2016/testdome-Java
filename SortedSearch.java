import java.io.*;
public class SortedSearch {
    
    public static int countNumbers(int[] sortedArray, int lessThan) {
    
    if (sortedArray.length == 1){
        if(sortedArray[0]<lessThan)
            return 1;
        else return 0;
    }
    
    else if(sortedArray.length == 2){
        
        int high=0;
        
        if(sortedArray[0]<lessThan)
            high++;
        
        if(sortedArray[1]<lessThan)
            high++;
        
        return high;
        
    }
    else{
    
    int low = 0, high = sortedArray.length-1; 
    
    /*daca primul element din array este mai mare ca lessThan atunci nu exista niciun nr care se incadreaza in
    conditiile date */    
    if(sortedArray[0]>=lessThan || sortedArray==null)
        return 0; 
        
    while (low <= high) {
        
        int mid = low + ( high -low) / 2; 
        
        if (sortedArray[mid] < lessThan ) {
        
            low = mid + 1;
        }
        
        else {

            high = mid - 1;
        }
    }
        
        return low ;
    }
    }
    
    public static void main(String[] args) {
        //System.out.println(SortedSearch.countNumbers(new int[] {5 }, 7)); verificare pentru un element test fail 2
        //System.out.println(SortedSearch.countNumbers(new int[] {1,2 }, 5));
        System.out.println(SortedSearch.countNumbers(new int[] {-1,1,1,1,1,1 }, 2)); 
    }
}