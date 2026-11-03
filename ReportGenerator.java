
import java.util.ArrayList;

public class ReportGenerator {

    // Attendance Report
    public static void attendanceReport(Attendance attendance) {

        System.out.println("\n===== ATTENDANCE REPORT =====");

        if (attendance == null) {
            System.out.println("Attendance record not found.");
            return;
        }

        attendance.displayAttendance();
    }

    // Marks Report
    public static void marksReport(ArrayList<Marks> marksList,
                                   int rollNo) {

        System.out.println("\n===== MARKS REPORT =====");

        boolean found = false;

        for (Marks mark : marksList) {

            if (mark.getRollNo() == rollNo) {

                mark.displayMarks();
                System.out.println("--------------------");
                found = true;
            }
        }

        if (!found) {
            System.out.println("Marks records not found.");
        }
    }

    // Academic Performance Report
    public static void performanceReport(ArrayList<Marks> marksList,
                                         int rollNo) {

        int totalMarks = 0;
        int maximumMarks = 0;
        boolean found = false;

        System.out.println("\n===== ACADEMIC PERFORMANCE =====");

        for (Marks mark : marksList) {

            if (mark.getRollNo() == rollNo) {

                totalMarks += mark.getMarksObtained();
                maximumMarks += mark.getMaximumMarks();

                found = true;
            }
        }

        if (!found) {
            System.out.println("No academic records found.");
            return;
        }

        double percentage =
                (totalMarks * 100.0) / maximumMarks;

        System.out.println("Roll Number: " + rollNo);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Maximum Marks: " + maximumMarks);

        System.out.printf("Percentage: %.2f%%\n", percentage);

        if (percentage >= 90) {
            System.out.println("Performance: Excellent");
        } else if (percentage >= 75) {
            System.out.println("Performance: Very Good");
        } else if (percentage >= 60) {
            System.out.println("Performance: Good");
        } else if (percentage >= 50) {
            System.out.println("Performance: Average");
        } else {
            System.out.println("Performance: Needs Improvement");
        }
    }
}
