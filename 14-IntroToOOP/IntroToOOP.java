


public class IntroToOOP {


    public static void main(String[] args){

    //to be able to use the Addition class we most create instance or Object
        // of the class
        // Class name reference Variable name = new the Type of this instance or Object  the Class name with ()
        Addition add = new Addition(1,2);


        // to use the method that inside the class we call the instance name with the methode name.
        add.add();
    }

}

class Addition {
    int a;
    int b;

    // Constructor to initialize values
    public Addition(int a, int b){
        this.a = a;
        this.b = b;
    }

    // This method uses the instance variables directly
    public void add(){
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }
}
