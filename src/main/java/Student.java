public class Student {
    public String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private String firstName;
    public int age;

    public Student(String name) {
        firstName = name;
    }

    public void print() {
        System.out.println(firstName);
    }
}