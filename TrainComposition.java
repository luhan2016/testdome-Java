import java.util.LinkedList;

public class TrainComposition extends Exception{
   
    LinkedList<Integer> train = new LinkedList<>();
    
    public void attachWagonFromLeft(int wagonId) {
     
        train.addLast(wagonId);
    }

    public void attachWagonFromRight(int wagonId) {
        
        train.addFirst(wagonId);
    }

    public int detachWagonFromLeft() {
       
        if (train.isEmpty())
            
            throw new UnsupportedOperationException("The train is empty");
        
        else{  
            
            int removedWagonId = train.getLast();
            train.removeLast();
            return removedWagonId;
        }
    }

    public int detachWagonFromRight() {
        if (train.isEmpty())
            
            throw new UnsupportedOperationException("The train is empty");
        
        else{  
       
        int removedWagonId = train.getFirst();
        train.removeFirst();
        return removedWagonId;
        }
    }

    public static void main(String[] args) {
        TrainComposition tree = new TrainComposition();
       // tree.attachWagonFromLeft(7);
        //tree.attachWagonFromLeft(13);
        System.out.println(tree.detachWagonFromRight()); // 7 
        System.out.println(tree.detachWagonFromLeft()); // 13
    }
}