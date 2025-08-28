public class MyException {
    public static void main(String[] args) {
        UserDefinedException sc = new UserDefinedException();
        try {
            sc.validate(19);
            sc.validate(12);

        }
        catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
