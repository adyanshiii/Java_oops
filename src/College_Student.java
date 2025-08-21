public class College_Student extends Student1 {
    public int roll_no;

    public College_Student(String address, int roll_no) {
        super(address);
        this.roll_no = roll_no;
    }
    public void show_roll_no(){
        System.out.println("Roll no is: "+roll_no);
    }
}
