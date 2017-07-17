package com.mobile.gpa_calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by Abdul Ahad on 10/15/2016.
 */
public class Semester extends AppCompatActivity {

    //double cal = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.semester);

        /*final Spinner spinner = (Spinner) findViewById(R.id.GrCourse1);
        spinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Spinner credit1 = (Spinner) findViewById(R.id.CrCourse1);
                if(!spinner.getSelectedItem().toString().equals("Gr") && !credit1.getSelectedItem().toString().equals("Cr")){
                    cal = GPA(spinner.getSelectedItem().toString(),credit1.getSelectedItem().toString());
                }
                EditText gpa = (EditText) findViewById(R.id.GPA);
                gpa.setText(""+cal);
            }
        });*/
        Button btnCal = (Button) findViewById(R.id.Cal);

        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //EditText cgpa = (EditText) findViewById(R.id.CGPA);
                //TextView textViewC = (TextView) findViewById(R.id.credit);

                //double numC = Double.parseDouble(cgpa.getText().toString());
                //double numCre = Double.parseDouble(textViewC.getText().toString());


                Spinner spinner1 = (Spinner) findViewById(R.id.GrCourse1);
                Spinner spinner2 = (Spinner) findViewById(R.id.GrCourse2);
                Spinner spinner3 = (Spinner) findViewById(R.id.GrCourse3);
                Spinner spinner4 = (Spinner) findViewById(R.id.GrCourse4);
                Spinner spinner5 = (Spinner) findViewById(R.id.GrCourse5);
                Spinner spinner6 = (Spinner) findViewById(R.id.GrCourse6);

                Spinner credit1  = (Spinner) findViewById(R.id.CrCourse1);
                Spinner credit2  = (Spinner) findViewById(R.id.CrCourse2);
                Spinner credit3  = (Spinner) findViewById(R.id.CrCourse3);
                Spinner credit4  = (Spinner) findViewById(R.id.CrCourse4);
                Spinner credit5  = (Spinner) findViewById(R.id.CrCourse5);
                Spinner credit6  = (Spinner) findViewById(R.id.CrCourse6);

                double cal = 0,creditHr = 0;

                if(!spinner1.getSelectedItem().toString().equals("Gr") && !credit1.getSelectedItem().toString().equals("Cr")){
                    creditHr = Double.parseDouble(credit1.getSelectedItem().toString());
                    cal = GPA(spinner1.getSelectedItem().toString(),credit1.getSelectedItem().toString());

                }
                if(!spinner2.getSelectedItem().toString().equals("Gr") && !credit2.getSelectedItem().toString().equals("Cr")) {
                    cal = cal + GPA(spinner2.getSelectedItem().toString(), credit2.getSelectedItem().toString());
                    creditHr = creditHr + Double.parseDouble(credit2.getSelectedItem().toString());
                }
                if(!spinner3.getSelectedItem().toString().equalsIgnoreCase("Gr") && !credit3.getSelectedItem().toString().equalsIgnoreCase("Cr")) {
                    cal = cal + GPA(spinner3.getSelectedItem().toString(), credit3.getSelectedItem().toString());
                    creditHr = creditHr + Double.parseDouble(credit3.getSelectedItem().toString());
                }
                if(!spinner4.getSelectedItem().toString().equalsIgnoreCase("Gr") && !credit4.getSelectedItem().toString().equalsIgnoreCase("Cr")) {
                    cal = cal + GPA(spinner4.getSelectedItem().toString(), credit4.getSelectedItem().toString());
                    creditHr = creditHr + Double.parseDouble(credit4.getSelectedItem().toString());
                }
                if(!spinner5.getSelectedItem().toString().equalsIgnoreCase("Gr") && !credit5.getSelectedItem().toString().equalsIgnoreCase("Cr")) {
                    cal = cal + GPA(spinner5.getSelectedItem().toString(), credit5.getSelectedItem().toString());
                    creditHr = creditHr + Double.parseDouble(credit5.getSelectedItem().toString());
                }
                if(!spinner6.getSelectedItem().toString().equalsIgnoreCase("Gr") && !credit6.getSelectedItem().toString().equalsIgnoreCase("Cr")) {
                    cal = cal + GPA(spinner6.getSelectedItem().toString(), credit6.getSelectedItem().toString());
                    creditHr = creditHr + Double.parseDouble(credit6.getSelectedItem().toString());
                }
                double total = cal/creditHr;
                EditText credit = (EditText) findViewById(R.id.SemesterCredits);
                credit.setText(""+creditHr);

                EditText gpa = (EditText) findViewById(R.id.GPA);
                gpa.setText(""+total);


                //cgpa

                //numC = ((numC*numCre) + cal)/(numCre+creditHr);
                //numCre = numCre + creditHr;
                //cgpa.setText(""+"numC");
                //textViewC.setText(""+"numCre");
            }
        });



    }
    public double GPA(String grade,String Credithr){
        double gradePoints = 0, num = Double.parseDouble(Credithr);
        if(grade.equals("A+")){gradePoints = gradePoints + (num*4.0);}
        else if(grade.equals("A-")){gradePoints = gradePoints + (num*3.7);}
        else if(grade.equals("B+")){gradePoints = gradePoints + (num*3.3);}
        else if(grade.equals("B")){gradePoints = gradePoints + (num*3.0);}
        else if(grade.equals("B-")){gradePoints = gradePoints + (num*2.7);}
        else if(grade.equals("C+")){gradePoints = gradePoints + (num*2.3);}
        else if(grade.equals("C")){gradePoints = gradePoints + (num*2.0);}
        else if(grade.equals("C-")){gradePoints = gradePoints + (num*1.7);}
        else if(grade.equals("F")){gradePoints = gradePoints + (num*0);}
        else;
        return gradePoints;}
}