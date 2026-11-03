
public class Marks {

    private int rollNo;
    private String subject;
    private int marksObtained;
    private int maximumMarks;

    // Constructor
    public Marks(int rollNo, String subject,
                 int marksObtained, int maximumMarks) {

        this.rollNo = rollNo;
        this.subject = subject;
        this.marksObtained = marksObtained;
        this.maximumMarks = maximumMarks;
    }

    // Getters
    public int getRollNo() {
        return rollNo;
    }

    public String getSubject() {
        return subject;
    }

    public int getMarksObtained() {
        return marksObtained;
    }

    public int getMaximumMarks() {
        return maximumMarks;
    }

    // Update marks
    public void setMarksObtained(int marksObtained) {
        this.marksObtained = marksObtained;
    }

    // Calculate percentage
    public double getPercentage() {
        if (maximumMarks <= 0) {
            return 0;
        }

        return (marksObtained * 100.0) / maximumMarks;
    }

    // Display marks
    public void displayMarks() {

        System.out.println("\n--- STUDENT MARKS ---");
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Subject: " + subject);
        System.out.println("Marks Obtained: " + marksObtained);
        System.out.println("Maximum Marks: " + maximumMarks);

        System.out.printf("Percentage: %.2f%%\n",
                          getPercentage());
    }
}
