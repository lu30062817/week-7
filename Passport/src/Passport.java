public abstract class Passport {
    int number;
    AgeAdapter age;

    abstract void setNumber(int number);

    public int VerificationValidation(int units){
        return units*number;
    }
}