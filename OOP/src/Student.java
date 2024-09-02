public class Student extends User{

    private Boolean _verified = false ;


    public Student(String name){
        setName(name);
    }

    void verify(){
        System.out.println("Verifying trough email");
        setVerified(true);
    }


    public Student(boolean verified){
        setVerified(verified);
    }

    void setVerified(boolean verified) {
        _verified = verified;

    }
    boolean getVerified() {

        return _verified;
    }
}
