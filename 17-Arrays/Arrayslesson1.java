import java.util.Arrays;

public class Arrayslesson1 {

    public static void main(String[] args )
    {
        int numbers[] = {1,2,3,4,5};

        numbers[2]= 6;  //update a value

        //System.out.println(numbers[1]); //print out by index number
        //System.out.println(numbers[2]);

        // Dynamic array

        int nums[] = new int[4]; // we can tell how many element going to hold
        // array name index number = init the value
        nums[0]= 2;
        nums[1]= 4;
        nums[2]= 6;
        nums[3]= 8;

        //System.out.println(nums[3]);

        for( int i=0 ; i <nums.length; i++){
            System.out.println(nums[i]);

    }
        System.out.println("--------------");
        System.out.println(nums.length);
    }
}
