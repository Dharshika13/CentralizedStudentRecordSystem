
public class Attendance {

    private int rollNo;
    private int totalDays;
    private int presentDays;

    // Constructor
    public Attendance(int rollNo) {
        this.rollNo = rollNo;
        this.totalDays = 0;
        this.presentDays = 0;
    }

    // Constructor for loading saved attendance
    public Attendance(int rollNo, int totalDays, int presentDays) {
        this.rollNo = rollNo;
        this.totalDays = totalDays;
        this.presentDays = presentDays;
    }

    // Mark attendance
    public void markAttendance(boolean present) {
        totalDays++;

        if (present) {
            presentDays++;
        }

        System.out.println("Attendance recorded successfully!");
    }

    // Calculate percentage
    public double getPercentage() {
        if (totalDays == 0) {
            return 0;
        }

        return (presentDays * 100.0) / totalDays;
    }

    // Getters
    public int getRollNo() {
        return rollNo;
    }

    public int getTotalDays() {
        return totalDays;
    }

    public int getPresentDays() {
        return presentDays;
    }

    // Display attendance
    public void displayAttendance() {
        System.out.println("\n--- ATTENDANCE DETAILS ---");
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Total Days: " + totalDays);
        System.out.println("Present Days: " + presentDays);
        System.out.printf("Attendance Percentage: %.2f%%\n",
                          getPercentage());
    }
}
