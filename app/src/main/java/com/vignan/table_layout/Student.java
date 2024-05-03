package com.vignan.table_layout;

public class Student {
    private String rollNo;
    private String name;
    private String course;
    private String branch;
    private String year;
    private String semester;
    private String section;

    public Student(String rollNo, String name, String course, String branch, String year, String semester, String section) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
        this.branch = branch;
        this.year = year;
        this.semester = semester;
        this.section = section;
    }

    public String getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public String getBranch() {
        return branch;
    }

    public String getYear() {
        return year;
    }

    public String getSemester() {
        return semester;
    }

    public String getSection() {
        return section;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo='" + rollNo + '\'' +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", branch='" + branch + '\'' +
                ", year='" + year + '\'' +
                ", semester='" + semester + '\'' +
                ", section='" + section + '\'' +
                '}';
    }
}
