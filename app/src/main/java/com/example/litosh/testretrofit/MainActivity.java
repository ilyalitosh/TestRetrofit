package com.example.litosh.testretrofit;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.litosh.testretrofit.adapters.ViewPagerAdapter;
import com.example.litosh.testretrofit.models.Student;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private ViewPagerAdapter vpAdapter;
    private ViewPager vp;
    private EditText inputFirstName;
    private EditText inputSecondName;
    private EditText inputBirthday;
    private EditText inputClass;
    private EditText inputLetterOfClass;
    private EditText inputAddress;
    private TextView showingStudent;
    private Button addStudentButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vp = findViewById(R.id.view_pager);
        initAdapter();
        vp.setAdapter(vpAdapter);
    }

    private void initComponents(View v1, View v2){
        inputAddress = v1.findViewById(R.id.input_address);
        inputFirstName = v1.findViewById(R.id.input_firstName);
        inputSecondName = v1.findViewById(R.id.input_secondName);
        inputBirthday = v1.findViewById(R.id.input_birthday);
        inputClass = v1.findViewById(R.id.input_class);
        inputLetterOfClass = v1.findViewById(R.id.input_letterOfClass);
        addStudentButton = v1.findViewById(R.id.add_student_button);

        showingStudent = v2.findViewById(R.id.text_output);
    }

    private void initAdapter(){
        LayoutInflater layoutInflater = getLayoutInflater();
        View v1 = layoutInflater.inflate(R.layout.add_student_item, null);
        View v2 = layoutInflater.inflate(R.layout.show_students_item, null);
        List<View> views = new ArrayList<>();
        views.add(v1);
        views.add(v2);
        vpAdapter = new ViewPagerAdapter(views);

        initComponents(v1, v2);
        initListeners();
    }

    private boolean isNotEmptyInputs(){
        boolean isNotEmpty = false;
        if(inputFirstName.getText().toString().equals("")){
            isNotEmpty = true;
        }else if(inputSecondName.getText().toString().equals("")){
            isNotEmpty = true;
        }else if(inputBirthday.getText().toString().equals("")){
            isNotEmpty = true;
        }else if(inputClass.getText().toString().equals("")){
            isNotEmpty = true;
        }else if(inputLetterOfClass.getText().toString().equals("")){
            isNotEmpty = true;
        }else if(inputAddress.getText().toString().equals("")){
            isNotEmpty = true;
        }
        return isNotEmpty;
    }

    private void initListeners(){
        addStudentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isNotEmptyInputs()){
                    Toast.makeText(MainActivity.this, "Какое-то поле пустое", Toast.LENGTH_SHORT).show();
                }else{
                    addStudent(inputFirstName.getText().toString(),
                            inputSecondName.getText().toString(),
                            inputAddress.getText().toString(),
                            inputBirthday.getText().toString(),
                            Integer.valueOf(inputClass.getText().toString()),
                            inputLetterOfClass.getText().toString());
                }
            }
        });
        vp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
                switch (position){
                    case 0:

                        break;
                    case 1:
                        showStudents();
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });
    }

    private void showStudents(){
        App.getSchoolApi().getStudents().enqueue(new Callback<List<Student>>() {
            @Override
            public void onResponse(Call<List<Student>> call, Response<List<Student>> response) {
                List<Student> studentList = response.body();
                StringBuilder s = new StringBuilder();
                for(int i = 0; i < studentList.size(); i++){
                    s.append("id: ").append(studentList.get(i).getId())
                            .append(", Фамилия: ").append(studentList.get(i).getSecondName())
                            .append(", Имя: ").append(studentList.get(i).getFirstName())
                            .append("\n");
                }
                showingStudent.setText(s.toString());
            }

            @Override
            public void onFailure(Call<List<Student>> call, Throwable t) {
                System.out.println(t.toString());
            }
        });
    }

    private void addStudent(String firstName, String secondName, String address,
                            String birthday, int _class, String letterOfClass){
        Student student = new Student();
        student.setFirstName(firstName);
        student.setSecondName(secondName);
        student.setAddress(address);
        student.setBirthday(birthday);
        student.setClass_(_class);
        student.setLetterOfClass(letterOfClass);
        App.getSchoolApi().addStudent(student).enqueue(new Callback<Student>() {
            @Override
            public void onResponse(Call<Student> call, Response<Student> response) {
                Toast.makeText(MainActivity.this,
                        "Успешное добавление",
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<Student> call, Throwable t) {
                System.out.println(t.toString());
            }
        });
    }

}
