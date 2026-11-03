
import java.io.*;

public class StudentFileHandler {

    private static final String FILE_NAME = "students.txt";

    // Save student records
    public static void saveStudents(StudentLinkedList list) {

        try {
            PrintWriter writer = new PrintWriter(
                new FileWriter(FILE_NAME)
            );

            StudentLinkedList.Node temp = list.head;

            while (temp != null) {

                Student s = temp.student;

                writer.println(
                    s.getRollNo() + "|" +
                    s.getName() + "|" +
                    s.getDob() + "|" +
                    s.getGender() + "|" +
                    s.getPhone() + "|" +
                    s.getEmail() + "|" +
                    s.getAddress() + "|" +
                    s.getDepartment() + "|" +
                    s.getYear()
                );

                temp = temp.next;
            }

            writer.close();
            System.out.println("Student records saved!");

        } catch (IOException e) {
            System.out.println("Error saving student records.");
        }
    }

    // Load student records
    public static void loadStudents(StudentLinkedList list) {

        File file = new File(FILE_NAME);

        if (!file.exists()) {
            return;
        }

        try {
            BufferedReader reader = new BufferedReader(
                new FileReader(file)
            );

            String line;

            while ((line = reader.readLine()) != null) {

                String[] data = line.split("\\|", -1);

                if (data.length == 9) {

                    Student student = new Student(
                        Integer.parseInt(data[0]),
                        data[1], data[2], data[3],
                        data[4], data[5], data[6],
                        data[7], Integer.parseInt(data[8])
                    );

                    list.addStudent(student);
                }
            }

            reader.close();

        } catch (IOException | NumberFormatException e) {
            System.out.println("Error loading student records.");
        }
    }
}

