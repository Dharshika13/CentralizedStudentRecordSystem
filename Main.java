
static void addStudent() {

    System.out.print("Enter Roll Number: ");
    int rollNo = sc.nextInt();
    sc.nextLine();

    if (studentList.searchStudent(rollNo) != null) {
        System.out.println("Roll number already exists!");
        return;
    }

    System.out.print("Enter Name: ");
    String name = sc.nextLine();

    System.out.print("Enter Date of Birth: ");
    String dob = sc.nextLine();

    System.out.print("Enter Gender: ");
    String gender = sc.nextLine();

    System.out.print("Enter Phone: ");
    String phone = sc.nextLine();

    System.out.print("Enter Email: ");
    String email = sc.nextLine();

    System.out.print("Enter Address: ");
    String address = sc.nextLine();

    System.out.print("Enter Department: ");
    String department = sc.nextLine();

    System.out.print("Enter Year: ");
    int year = sc.nextInt();

    Student student = new Student(
        rollNo, name, dob, gender, phone,
        email, address, department, year
    );

    studentList.addStudent(student);
    StudentFileHandler.saveStudents(studentList);
}
