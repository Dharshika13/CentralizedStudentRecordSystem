
import java.io.*;
import java.util.ArrayList;

public class MarksFileHandler {

    private static final String FILE_NAME = "marks.txt";

    // Save marks records
    public static void saveMarks(ArrayList<Marks> marksList) {

        try (PrintWriter writer =
             new PrintWriter(new FileWriter(FILE_NAME))) {

            for (Marks m : marksList) {

                writer.println(
                    m.getRollNo() + "|" +
                    m.getSubject() + "|" +
                    m.getMarksObtained() + "|" +
                    m.getMaximumMarks()
                );
            }

            System.out.println("Marks records saved!");

        } catch (IOException e) {
            System.out.println("Error saving marks.");
        }
    }

    // Load marks records
    public static void loadMarks(ArrayList<Marks> marksList) {

        File file = new File(FILE_NAME);

        if (!file.exists()) {
            return;
        }

        try (BufferedReader reader =
             new BufferedReader(new FileReader(file))) {

            String line;

            while ((line = reader.readLine()) != null) {

                String[] data = line.split("\\|");

                if (data.length == 4) {

                    int rollNo = Integer.parseInt(data[0]);
                    String subject = data[1];
                    int obtained = Integer.parseInt(data[2]);
                    int maximum = Integer.parseInt(data[3]);

                    if (maximum > 0 && obtained >= 0
                            && obtained <= maximum) {

                        Marks mark = new Marks(
                            rollNo, subject, obtained, maximum
                        );

                        marksList.add(mark);
                    }
                }
            }

        } catch (IOException | NumberFormatException e) {
            System.out.println("Error loading marks.");
        }
    }
}

