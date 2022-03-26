import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVReaderInJava {


    public List<Course> readCourseFromCSV(String fileName) {
        List<Course> courses = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);

        try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)) {
            String line = br.readLine();
            while (line != null) {
                String[] attributes = line.split(",");
                Course course = createCourse(attributes);
                courses.add(course);
                line = br.readLine();
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return courses;
    }

    public Course createCourse(String[] metadata) {
        int courseNum = Integer.parseInt(metadata[0]);
        String courseName = metadata[1];
        int credits = Integer.parseInt(metadata[2]);
        Boolean oneOrBoth = Boolean.parseBoolean(metadata[3]);
        List pre = Arrays.asList(metadata[4]);
        return new Course(courseNum, courseName, credits, oneOrBoth, pre);
    }

}
