/**
 * This class implements the factory design pattern
 */

public class PassportFactory {
    public Passport getItem(String Conduct, String age){
        if(Conduct == null){
            return null;
        }
        if(Conduct.equalsIgnoreCase("Address")) {
            Passport g= new Address();
            ((Address) g).selectAge(age);
            return g;
        }
        else if(Conduct.equalsIgnoreCase("Certificates")){
            Passport g= new Certificates();
            ((Certificates) g).selectAge(age);
            return g;
        }
        else if(Conduct.equalsIgnoreCase("Identity")) {
            Passport g= new Identity();
            ((Identity) g).selectAge(age);
            return g;
        }
        return null;
    }
}