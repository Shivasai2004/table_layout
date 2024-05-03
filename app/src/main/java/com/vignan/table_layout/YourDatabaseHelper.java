package com.vignan.table_layout;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class YourDatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "students.db";
    private static final int DATABASE_VERSION = 1;

    public YourDatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Create your student table
        db.execSQL("CREATE TABLE students (" +
                "roll_no TEXT PRIMARY KEY," +
                "name TEXT," +
                "course TEXT," +
                "branch TEXT," +
                "year TEXT," +
                "semester TEXT," +
                "section TEXT)");

        // Insert sample data if needed
        insertSampleData(db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Upgrade logic if needed
    }

    private void insertSampleData(SQLiteDatabase db) {
        // Insert sample student records into the database
        insertStudent(db, "211FA18049", "CHIGURUPATI VARSHA", "Engineering", "AIML", "3rd", "2nd", "A");
        insertStudent(db, "211FA18002", "PETTELA VINAYA PADMA SRI HARSHITHA", "Engineering", "AIML", "3rd", "2nd", "A");
        insertStudent(db, "211FA18003", "ALLU HEMANTH", "Engineering", "AIML", "3rd", "2nd", "A");
        insertStudent(db, "211FA18138", "MANNE LAKSHMI CHETANA", "Engineering", "AIML", "3rd", "2nd", "A");
        insertStudent(db, "211FA18063", "KATIKA VEERA VENKATA ABHINAV", "Engineering", "AIML", "3rd", "2nd", "A");
        insertStudent(db, "211FA18015", "SEELAM RUCHITHA MAHI", "Engineering", "AIML", "3rd", "2nd", "A");
        insertStudent(db, "211FA18041", "NAGALINGAM HARIKA", "Engineering", "AIML", "3rd", "2nd", "A");
        insertStudent(db, "211FA18013", "BONAGIRI SAI GEETHA", "Engineering", "AIML", "3rd", "2nd", "A");
        insertStudent(db, "211FA18062", "Mayookh Bethi", "Engineering", "AIML", "3rd", "2nd", "A");
        insertStudent(db, "211FA18004", "KALWA ESWAR", "Engineering", "AIML", "3rd", "2nd", "A");
        insertStudent(db, "211FA18061", "GUDAPATI RAVI TEJA", "Engineering", "AIML", "3rd", "2nd", "A");
        insertStudent(db, "211FA18011", "KORLEPARA TEJA SURYA NARAYANA", "Engineering", "AIML", "3rd", "2nd", "A");
        insertStudent(db, "211FA18045", "VISLEKSHA KURVA", "Engineering", "AIML", "3rd", "2nd", "A");
        insertStudent(db, "211FA18046", "JAGRUTHA ADITYA KODURU", "Engineering", "AIML", "3rd", "2nd", "A");
        insertStudent(db, "211FA18068", "HARSHITA ALLAMSETTY", "Engineering", "AIML", "3rd", "2nd", "A");
        insertStudent(db, "211FA18065", "ALLAMPALLI MOULI VENKATA DIWAKAR", "Engineering", "AIML", "3rd", "2nd", "A");
        insertStudent(db, "211FA18007", "KHAREEDU NARENDRA", "Engineering", "AIML", "3rd", "2nd", "A");
        insertStudent(db, "211FA18031", "GUDIVADA SRIHITHA", "Engineering", "AIML", "3rd", "2nd", "A");
        insertStudent(db, "211FA18006", "TRIPURARI PRAVEEN", "Engineering", "AIML", "3rd", "2nd", "A");
        insertStudent(db, "211FA18014", "VANGARA MAHENDRA NAGA VENKAT", "Engineering", "AIML", "3rd", "2nd", "A");
        insertStudent(db, "211FA18048", "ILLA ARAVIND", "Engineering", "AIML", "3rd", "2nd", "A");
        insertStudent(db, "211FA18018", "SIDDAMSETTI VAMSI KRISHNA", "Engineering", "AIML", "3rd", "2nd", "A");
        insertStudent(db, "211FA18047", "GRANDHI CHAKRI SAI SRIRAM", "Engineering", "AIML", "3rd", "2nd", "A");
        insertStudent(db, "211FA18017", "CHIKKUDU SRI VARDHAN", "Engineering", "AIML", "3rd", "2nd", "A");
        insertStudent(db, "211FA18043", "L.SAI AKASH", "Engineering", "AIML", "3rd", "2nd", "A");
        insertStudent(db, "211FA18053", "MUPPALLA SOWMYA", "Engineering", "AIML", "3rd", "2nd", "A");
        insertStudent(db, "211FA18029", "KOTHA PAVANKALYAN", "Engineering", "AIML", "3rd", "2nd", "A");
        insertStudent(db, "211FA18010", "JULURI SHIVA SAI", "Engineering", "AIML", "3rd", "2nd", "A");
        insertStudent(db, "211FA18066", "DIVVELA BANDHAVI", "Engineering", "AIML", "3rd", "2nd", "A");
        insertStudent(db, "211FA18051", "P LEELA VENKATA SIVA SAI", "Engineering", "AIML", "3rd", "2nd", "A");
        insertStudent(db, "211FA18055", "YARAVEDA MANVITHA", "Engineering", "AIML", "3rd", "2nd", "A");
        insertStudent(db, "211FA18056", "VEMPATI VENKATA BHASKARA PRAVANYA", "Engineering", "AIML", "3rd", "2nd", "A");
        insertStudent(db, "211FA18050", "MANNEM NAVEEN KUMAR REDDY", "Engineering", "AIML", "3rd", "2nd", "A");
        insertStudent(db, "211FA18060", "DUGGEMPUDI KARTHIK REDDY", "Engineering", "AIML", "3rd", "2nd", "A");
        insertStudent(db, "211FA18027", "GRANDHI NAGA VENKATA SREEJA", "Engineering", "AIML", "3rd", "2nd", "A");
        insertStudent(db, "211FA18016", "MADDALA SRAVYA SREE", "Engineering", "AIML", "3rd", "2nd", "A");
        insertStudent(db, "211FA18057", "PRAYAGA VATHSALYA SRI VIJAYA", "Engineering", "AIML", "3rd", "2nd", "A");
        insertStudent(db, "211FA18026", "VANTALA SWAMYNATH", "Engineering", "AIML", "3rd", "2nd", "A");
        insertStudent(db, "211FA18058", "PUTTA VENKATA SAI ROHITH", "Engineering", "AIML", "3rd", "2nd", "A");
        insertStudent(db, "211FA18067", "GUNJI MARESH", "Engineering", "AIML", "3rd", "2nd", "A");
        insertStudent(db, "211FA18030", "GOGINENI CHAITANYA KRISHNA", "Engineering", "AIML", "3rd", "2nd", "A");
        insertStudent(db, "211FA18052", "PINGALI HEMANTH SAI VIKAS", "Engineering", "AIML", "3rd", "2nd", "A");
        insertStudent(db, "211FA18025", "GUNDUBOYINA ADI NARAYANA REDDY", "Engineering", "AIML", "3rd", "2nd", "A");
        insertStudent(db, "211FA18042", "M VENKATA RANGA SATYA PALLAVI", "Engineering", "AIML", "3rd", "2nd", "A");
        insertStudent(db, "211FA18012", "TANNA HEMANDRA", "Engineering", "AIML", "3rd", "2nd", "A");
        insertStudent(db, "211FA18035", "GURRAM VISHNU VARDAN REDDY", "Engineering", "AIML", "3rd", "2nd", "A");
        insertStudent(db, "211FA18019", "TIRIVEEDHI ANIL KUMAR", "Engineering", "AIML", "3rd", "2nd", "A");
        insertStudent(db, "211FA18037", "ATHOTA KOTESWARA RAO", "Engineering", "AIML", "3rd", "2nd", "A");
        insertStudent(db, "211FA18040", "AVULA YASASWI", "Engineering", "AIML", "3rd", "2nd", "A");
        insertStudent(db, "211FA18033", "SARIKONDA BHARGAV RAMA RAJU", "Engineering", "AIML", "3rd", "2nd", "A");
        insertStudent(db, "211FA18028", "UNDRAKONDA ANANTH LAKSHMI SRINIVAS", "Engineering", "AIML", "3rd", "2nd", "A");
        insertStudent(db, "211FA18032", "PALADUGU MOHANA SAI", "Engineering", "AIML", "3rd", "2nd", "A");
        insertStudent(db, "211FA18022", "KOLLI DHRUVA KUMAR REDDY", "Engineering", "AIML", "3rd", "2nd", "A");
        insertStudent(db, "211FA18020", "ANNAM KOMAL SAI MANI NAGA VAIBHAV", "Engineering", "AIML", "3rd", "2nd", "A");
        insertStudent(db, "211FA18021", "MUDDA KAPIL RAJ", "Engineering", "AIML", "3rd", "2nd", "A");
    }


    private void insertStudent(SQLiteDatabase db, String rollNo, String name, String course,
                               String branch, String year, String semester, String section) {
        String insertQuery = "INSERT INTO students (roll_no, name, course, branch, year, semester, section) " +
                "VALUES ('" + rollNo + "', '" + name + "', '" + course + "', '" +
                branch + "', '" + year + "', '" + semester + "', '" + section + "')";
        db.execSQL(insertQuery);
    }

    public List<Student> getAllStudents() {
        List<Student> studentList = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM students", null);

        if (cursor.moveToFirst()) {
            do {
                @SuppressLint("Range") String rollNo = cursor.getString(cursor.getColumnIndex("roll_no"));
                @SuppressLint("Range") String name = cursor.getString(cursor.getColumnIndex("name"));
                @SuppressLint("Range") String course = cursor.getString(cursor.getColumnIndex("course"));
                @SuppressLint("Range") String branch = cursor.getString(cursor.getColumnIndex("branch"));
                @SuppressLint("Range") String year = cursor.getString(cursor.getColumnIndex("year"));
                @SuppressLint("Range") String semester = cursor.getString(cursor.getColumnIndex("semester"));
                @SuppressLint("Range") String section = cursor.getString(cursor.getColumnIndex("section"));

                Student student = new Student(rollNo, name, course, branch, year, semester, section);
                studentList.add(student);
            } while (cursor.moveToNext());
        }

        cursor.close();
        db.close();

        return studentList;
    }
}
