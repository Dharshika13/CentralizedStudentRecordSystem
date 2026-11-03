
import java.io.*;
import java.util.ArrayList;

public class AttendanceFileHandler {

    private static final String FILE_NAME = "attendance.txt";

    // Save attendance records
    public static void saveAttendance(ArrayList<Attendance> list) {

        try (PrintWriter writer =
             new PrintWriter(new FileWriter(FILE_NAME))) {

            for (Attendance a : list) {
                writer.println(
                    a.getRollNo() + "|" +
                    a.getTotalDays() + "|" +
                    a.getPresentDays()
                );
            }

            System.out.println("Attendance records saved!");

        } catch (IOException e) {
            System.out.println("Error saving attendance.");
        }
    }

    // Load attendance records
    public static void loadAttendance(ArrayList<Attendance> list) {

        File file = new File(FILE_NAME);

        if (!file.exists()) {
            return;
        }

        try (BufferedReader reader =
             new BufferedReader(new FileReader(file))) {

            String line;

            while ((line = reader.readLine()) != null) {

                String[] data = line.split("\\|");

                if (data.length == 3) {

                    int rollNo = Integer.parseInt(data[0]);
                    int totalDays = Integer.parseInt(data[1]);
                    int presentDays = Integer.parseInt(data[2]);

                    Attendance attendance = new Attendance(
                        rollNo, totalDays, presentDays
                    );

                    list.add(attendance);
                }
            }

        } catch (IOException | NumberFormatException e) {
            System.out.println("Error loading attendance.");
        }
    }
}

