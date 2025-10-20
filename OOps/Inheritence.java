public class Inheritence {
      public static void main(String[] args) {
        //Fish class 
        Fish f=new Fish();
        f.eat();
        f.swim();
        
        //Birds
        Bird b=new Bird();
        b.eat();
        b.fly();
        
        //Elephant 
        Elephant e=new Elephant();
        e.eat();
        e.walk();    
    }
    
}




class Animal{
    void eat(){
        System.out.println("Animal is eating ");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("Fish is Swimming ");

    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("Bird is flying ");
    }
}
class Elephant extends Animal{
    void walk(){
        System.out.println("elephant is  walking .");
    }
}