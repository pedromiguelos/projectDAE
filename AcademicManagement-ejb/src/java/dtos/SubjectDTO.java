package dtos;

import java.io.Serializable;

public class SubjectDTO  implements Serializable{

    private int code;
    private String name;
    private int courseCode;
    private String courseName;
    private int courseYear;
    private String scholarYear;   

    public SubjectDTO() {
    }

    public SubjectDTO(int code, String name, int courseCode, String courseName, int courseYear, String scholarYear) {
        this.code = code;
        this.name = name;
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.courseYear = courseYear;
        this.scholarYear = scholarYear;
    }
    
    public void reset(){
        this.code = 0;
        this.name = null;
        this.courseCode = 0;
        this.courseName = null;
        this.courseYear = 0;
        this.scholarYear = null;        
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseYear() {
        return courseYear;
    }

    public void setCourseYear(int courseYear) {
        this.courseYear = courseYear;
    }

    public String getScholarYear() {
        return scholarYear;
    }

    public void setScholarYear(String scholarYear) {
        this.scholarYear = scholarYear;
    }
}
