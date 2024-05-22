package Hospital_oops;

public class doctor extends person_name {
    private String speciality;

    public doctor(String name, int age, String gender, String speciality) {
        super(name, age, gender);
        this.speciality = speciality;
    }

    public void doctorOutput() {
        System.out.println("Doctor Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Gender: " + getGender());
        System.out.println("Speciality: " + speciality);
    }
}
