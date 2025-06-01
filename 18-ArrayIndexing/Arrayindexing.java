public class Arrayindexing {

    public static void main(String[] args){

        //create a dynamic Array
        int number[] = new int[5];

        //loop throw the Array and add the new value to the array
        for (int i=0; i< number.length;i++)
        {
            number[i]=i+1;
        }

        System.out.println(number[0]);
        System.out.println(number[1]);
        System.out.println(number[2]);
        System.out.println(number[3]);
        System.out.println(number[4]);
        System.out.println("________________");
        //how to find an index of an element in array
        // create an Array
        String Words[] = {"appels","Oranges","Bananas","Watermellons"};

        // every array start with 0 index so
        int index = -1;
        String target = "Oranges";

        // we loop throw it
        for (int i=0; i<Words.length; i++)
        {
            if(Words[i].equals(target)){
                index=i;
                break;
            }
        }
        System.out.println("index: "+ index);
        System.out.println("-------------------");


        int[] numbers2 = {5, 12, 7, 20, 9};
        int target2 = 20;

        int index2 = -1; // default if not found

        for (int i = 0; i < numbers2.length; i++) {
            if (numbers2[i] == target2) {
                index2 = i;
                break; // stop after finding the first match
            }
        }
        System.out.println("index: "+ index2);

        if (index2 != -1) {
            System.out.println("Index of " + target2 + " is: " + index2);
        } else {
            System.out.println("Element not found.");
        }


    }

}
