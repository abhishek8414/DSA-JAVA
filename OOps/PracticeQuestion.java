public class PracticeQuestion {
    public static void main(String[] args) {
        
        
    }
    
}
/*Create a class Student with properties name, rollNo, marks. 
Use encapsulation (private fields + getters/setters).*/

class Student{
    private String name;
    private int rollNo;
    private double marks ;

    //getter - to read the value
    public String getName(){
        return name;
    }

    // setter - set/ to update the value 
     public void setName(String name){
        this.name=name;
    }

}

