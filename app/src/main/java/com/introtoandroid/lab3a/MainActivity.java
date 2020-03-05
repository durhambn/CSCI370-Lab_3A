package com.introtoandroid.lab3a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

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

        };
    }

