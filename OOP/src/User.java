import javax.swing.*;

public abstract class User {

   private String name;
   private String _membership = "Bronze";
   private Boolean _verified = false ;



    void setVerified(boolean verified) {
        _verified = verified;

    }
    boolean getVerified() {

        return _verified;
    }
    void verify(){
        System.out.println("Verifying...");
        setVerified(true);
    }
    public String toString() {
        return getName() + " " + getMembership();
    }
    public boolean equals(User u2) {
        if (getName() == u2.getName() && getMembership() == u2.getMembership()){
            return true;
        }
        else{
            return false ;
        }
    }

    public User(){

    }

   public User(String name){
        setName(name);

   }

   public User(String name , String membership){

       setName(name);
       setMembership(membership);
   }

    void setName(String name){
        this.name = name;

    }
    String getName(){
        return name;
    }
    void setMembership(String membership) {
        _membership = membership;
    }
    void setMembership(Membership membership){
        _membership = membership.name();
    }
    public enum Membership {
        Bronze , Silver , Gold;
    }

    String getMembership() {
        return _membership;
    }


}
