package com.vignan.table_layout;
import android.os.Bundle;
import android.widget.HorizontalScrollView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TableLayout tableLayout;
    private YourDatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tableLayout = findViewById(R.id.tableLayout);
        databaseHelper = new YourDatabaseHelper(this);

        // Retrieve all student records from the database
        List<Student> studentList = databaseHelper.getAllStudents();

        // Add header row (fixed headers)
        addHeaderRow();

        // Add data rows (scrollable content)
        for (Student student : studentList) {
            addDataRow(student);
        }
    }

    private void addHeaderRow() {
        TableRow headerRow = new TableRow(this);
        headerRow.setBackgroundColor(getResources().getColor(R.color.header_bg_color));

        addHeaderCell(headerRow, "Regd. No.");
        addHeaderCell(headerRow, "Name");
        addHeaderCell(headerRow, "Year");
        addHeaderCell(headerRow, "Section");
        addHeaderCell(headerRow, "Dept");
        addHeaderCell(headerRow, "Branch");

        tableLayout.addView(headerRow);
    }

    private void addHeaderCell(TableRow row, String text) {
        TextView textView = createTextView(text);
        textView.setTextColor(getResources().getColor(R.color.header_text_color));
        row.addView(textView);
    }

    private void addDataRow(Student student) {
        TableRow dataRow = new TableRow(this);

        addDataCell(dataRow, student.getRollNo());
        addDataCell(dataRow, student.getName());
        addDataCell(dataRow, student.getYear());
        addDataCell(dataRow, student.getSection());
        addDataCell(dataRow, student.getCourse());
        addDataCell(dataRow, student.getBranch());

        tableLayout.addView(dataRow);
    }

    private void addDataCell(TableRow row, String text) {
        TextView textView = createTextView(text);
        row.addView(textView);
    }

    private TextView createTextView(String text) {
        TextView textView = new TextView(this);
        textView.setText(text);
        textView.setPadding(8, 8, 8, 8);
        textView.setTextColor(getResources().getColor(R.color.text_color));
        return textView;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Close the database connection when the activity is destroyed
        if (databaseHelper != null) {
            databaseHelper.close();
        }
    }
}
