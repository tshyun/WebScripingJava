import java.util.List;

public class Course {
    private int courseNum;
    private String courseName;
    private int credits;
    private Boolean oneOrBoth; //one of is True, Both is false
    private List<Integer> pre;

    //EFFECTS: default constructor
    public Course(int cnum, String cname, int cr, Boolean oneOf, List<Integer> loc) {
        courseNum = cnum;
        courseName = cname;
        credits = cr;
        oneOrBoth = oneOf;
        pre = loc;
    }

    public int getCourseNum() {
        return courseNum;
    }

    public String getCourseName() {
        return courseName;
    }

    public Boolean checkPreOneof() {
        return oneOrBoth;
    }

    public List<String> coursePre() {
        if (oneOrBoth) {


        }
    }


}
