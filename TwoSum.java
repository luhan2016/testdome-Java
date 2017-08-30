import java.util.HashMap; 

public class TwoSum {
    public static int[] findTwoSum(int[] list, int sum) {
        
         if(list==null || list.length<2)
        return null;
 
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    for(int i=0; i<list.length; i++){
        if(map.containsKey(list[i])){
            return new int[]{map.get(list[i]), i};
        }else{
            map.put(sum-list[i], i);
        }
    }
 
    return null;
        
    }

    public static void main(String[] args) {
        int[] indices = findTwoSum(new int[] { 1, 3, 5, 7, 9 }, 12);
        System.out.println(indices[0] + " " + indices[1]);
    }
}
