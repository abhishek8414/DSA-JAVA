
public class OOPS {

    public static void main(String[] args) {


        // now  pen class  oblect 
        Pen p1=new Pen();
        p1.color="red";
        p1.tip=5;
        System.out.println("Pen class output");
        System.out.println(p1.color+" "+p1.tip);




        // Now Student class  Marks ka Percentage find karne 
        Student s1 = new Student();
        s1.name="Abhishek Kumar Sharma ";
        s1.age =20;
        s1.calcPercentage(90, 85, 99);
        System.out.println(s1.name+"= Percentage% => "+s1.percentage);

    }

}

// this is a class  which is name is Student 
class Student {
    String name;
    int age;
    // to calculate percentage of our cgpa 
    float percentage;  // dataType float
    void calcPercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3; 
    }

}


// Create Classes and Oblect :-
class Pen {
    String color;
    int tip;

    void SetColor(String newColor) {
        color = newColor;
    }
    void SetTip(int newTip) {
        tip = newTip;
    }
}
