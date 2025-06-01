public class OPP2 {

    public static void main (String[]args){

        Dog myDog = new Dog();

        myDog.bark();
    }

}


class Animal {

    //properties
    String breed;
    String color;
    int age ;
    String registerDate;


    //Constructor A constructor is a special method that is automatically called when you create a new object of a class.
    public Animal (String breed, String color,int age,String register){
         this.breed=breed;
         this.color=color;
         this.age=age;
         this.registerDate=registerDate;
    }

    //Behavior
    public void bark(){

        System.out.println("WOOf WOOf");
    }

}

class Dog {

    // field type animal
    Animal dog;

    //constructor
    public Dog (){
        dog = new Animal("BullDog","black",3,"2023-12-12");
    }

    public void bark(){
        dog.bark();
    }


}