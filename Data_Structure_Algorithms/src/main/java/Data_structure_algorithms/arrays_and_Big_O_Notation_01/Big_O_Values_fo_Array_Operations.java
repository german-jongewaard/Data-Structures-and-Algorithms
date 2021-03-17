/*
 * Big-O Values fo Array Operations
 *
 * by Germán Jongewaard
 *
 */
package Data_structure_algorithms.arrays_and_Big_O_Notation_01;

/**
 *
 * @author Germán Jongewaard
 */
public class Big_O_Values_fo_Array_Operations {
    public static void main(String[] args){
        
        int[] intArray = new int[7];
        
        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;
     
        int index = -1;
        for(int i = 0; i < intArray.length; i++){
            if (intArray[i] == 7){
                index = i;
                break;
            }
        }    
        System.out.println("index = " + index);
    }    
}
