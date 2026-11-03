
public class Student {

    // Personal information
    private int rollNo;
    private String name;
    private String dob;
    private String gender;
    private String phone;
    private String email;
    private String address;

    // Academic information
    private String department;
    private int year;

    // Constructor
    public Student(int rollNo, String name, String dob,
                   String gender, String phone,
                   String email, String address,
                   String department, int year) {

        this.rollNo = rollNo;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.department = department;
        this.year = year;
    }

    // Getters
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public String getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getDepartment() {
        return department;
    }

    public int getYear() {
        return year;
    }

    // Setters for updating details
    public void setName(String name) {
        this.name = name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Display student details
    public void displayStudent() {
        System.out.println("\n--- STUDENT DETAILS ---");
        System.out.println("Roll Number : " + rollNo);
        System.out.println("Name        : " + name);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Gender      : " + gender);
        System.out.println("Phone       : " + phone);
        System.out.println("Email       : " + email);
        System.out.println("Address     : " + address);
        System.out.println("Department  : " + department);
        System.out.println("Year        : " + year);
    }
}
