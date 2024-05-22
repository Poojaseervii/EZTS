package Hospital_oops;

public class nurse extends person_name {
    private int roomNo;

    public nurse(String name, int age, String gender, int roomNo) {
        super(name, age, gender);
        this.roomNo = roomNo;
    }

    public void roomnoOutput() {
        System.out.println("Nurse Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Gender: " + getGender());
        System.out.println("Room Number: " + roomNo);
    }
}

