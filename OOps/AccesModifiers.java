
public class AccesModifiers {

    public static void main(String[] args) {

        //BankAccount name Class  Ka object ban rahe hai 
        BankAccount MyAccount = new BankAccount();

        MyAccount.username="Abhishek kumar Sharma";
        MyAccount.setPassword("Abhishek@12345");

        //MyAccount.setPassword("Sharmaji@11232660");

        //  to print username and password
        System.out.println("Username ="+ MyAccount.username); //ptint User name line 
        System.out.println("Password ="+ MyAccount.getPassword()); // noy can see private password
    }
}
class BankAccount{
    public String username;
    private String Password;


    //setter 
    public void setPassword(String password){
        this.Password=password;

    }
    // getter to get the private password 
    public String getPassword(){
        return Password;
    }


}




// class BankAccount {

//     public String name;
//     private  String password; // password is always privete because no anyone can excess tha password  

//     public void setPassword(String pwd) { 
//         // in any reasion user want to print password then i write this finction
//         password = pwd;
//     }
//     public String getpassword(){ // safe way to read private data 
//         return password;
//     }
// }
