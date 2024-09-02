import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

      HashMap<String , String> fun = new HashMap<>();

      fun.put("Bobbyjoe1996" , "password");
      fun.put("Bobbyjoe1997" , "password1");
      fun.put("Bobbyjoe1998" , "password2");

      System.out.println(fun);

      fun.remove("Bobbyjoe1996");

      System.out.println(fun);

      fun.replace("Bobbyjoe1997" , "password23");
      System.out.println(fun);


    }
}