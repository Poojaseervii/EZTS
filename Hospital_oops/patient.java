package Hospital_oops;

public class patient extends person_name {
    private String disease;

    public patient(String name, int age, String gender, String disease) {
        super(name, age, gender);
        this.disease = disease;
    }

    public void patientOutput() {
        System.out.println("Patient Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Gender: " + getGender());
        System.out.println("Disease: " + disease);
    }
}

