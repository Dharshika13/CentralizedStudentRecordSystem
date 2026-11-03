
public class StudentLinkedList {

    // Node class
    static class Node {
        Student student;
        Node next;

        Node(Student student) {
            this.student = student;
            this.next = null;
        }
    }

    // Head points to first node
    Node head = null;

    // Add student
    public void addStudent(Student student) {

        // Check duplicate roll number
        if (searchStudent(student.getRollNo()) != null) {
            System.out.println("Roll number already exists!");
            return;
        }

        Node newNode = new Node(student);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }

        System.out.println("Student added successfully!");
    }

    // Search student
    public Student searchStudent(int rollNo) {

        Node temp = head;

        while (temp != null) {

            if (temp.student.getRollNo() == rollNo) {
                return temp.student;
            }

            temp = temp.next;
        }

        return null;
    }

    // Display all students
    public void displayStudents() {

        if (head == null) {
            System.out.println("No student records found.");
            return;
        }

        Node temp = head;

        while (temp != null) {
            temp.student.displayStudent();
            temp = temp.next;
        }
    }

    // Delete student
    public void deleteStudent(int rollNo) {

        if (head == null) {
            System.out.println("No records available.");
            return;
        }

        if (head.student.getRollNo() == rollNo) {
            head = head.next;
            System.out.println("Student deleted successfully!");
            return;
        }

        Node temp = head;

        while (temp.next != null &&
               temp.next.student.getRollNo() != rollNo) {

            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Student not found!");
        } else {
            temp.next = temp.next.next;
            System.out.println("Student deleted successfully!");
        }
    }

    // Update student name
    public void updateStudent(int rollNo, String newName) {

        Student student = searchStudent(rollNo);

        if (student == null) {
            System.out.println("Student not found!");
        } else {
            student.setName(newName);
            System.out.println("Student updated successfully!");
        }
    }
}
