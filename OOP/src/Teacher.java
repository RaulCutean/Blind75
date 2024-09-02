
public class Teacher extends User {

    public Teacher(){

    }

    void verify(){
        System.out.println("Verifying trough phone");
        setVerified(true);
    }

    public Teacher(String name){
        setName(name);
    }


}
