package com.introtoandroid.lab3a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView list;
    ArrayList<Student> students = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.student);

        Student student;


        student = new Student();
        student.setFirstName("Brandi");
        student.setLastName("Durham");
        student.setMajor("CS");
        students.add(student);

        student = new Student();
        student.setFirstName("Bree");
        student.setLastName("Harmon");
        student.setMajor("BioEd");
        students.add(student);

        student = new Student();
        student.setFirstName("Meena");
        student.setLastName("Rahimi");
        student.setMajor("CS");
        students.add(student);

        student = new Student();
        student.setFirstName("Kelly");
        student.setLastName("Ackerly");
        student.setMajor("PSY");
        students.add(student);

        student = new Student();
        student.setFirstName("Quinn");
        student.setLastName("Williams");
        student.setMajor("PHY");
        students.add(student);

        StudentAdapter adapter = new StudentAdapter(getApplicationContext(), students);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast t = Toast.makeText(getApplicationContext(), students.get(i).getFirstName() + " selected", Toast.LENGTH_SHORT);
                t.show();
            }
        });

        list.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast t = Toast.makeText(getApplicationContext(), students.get(i).getMajor() + " selected", Toast.LENGTH_SHORT);
                t.show();
                return true;
            }
        });
    }
}

