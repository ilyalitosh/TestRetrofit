package com.example.litosh.testretrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.litosh.testretrofit.models.Groups;
import com.example.litosh.testretrofit.models.schedule.group.Schedule;
import com.example.litosh.testretrofit.models.schedule.group.ScheduleCore;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private TextView textOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();
        //showGroups();
        showSchedule(620601);
    }

    private void initComponents(){
        textOutput = findViewById(R.id.text_output);
    }

    private void showGroups(){
        App.getBsuirApi().getGroupsData().enqueue(new Callback<List<Groups>>() {
            @Override
            public void onResponse(Call<List<Groups>> call, Response<List<Groups>> response) {
                List<Groups> responseList = response.body();
                StringBuilder s = new StringBuilder();
                for(int i = 0; i < responseList.size(); i++){
                    s.append("Группа: ").append(responseList.get(i).getName()).append(", ")
                            .append("Курс: ").append(responseList.get(i).getCourse()).append("\n");
                }
                textOutput.setText(s.toString());
            }

            @Override
            public void onFailure(Call<List<Groups>> call, Throwable t) {
                System.out.println(t.toString());
            }
        });
    }

    private void showSchedule(int groupName){
        App.getBsuirApi().getSchedule(groupName).enqueue(new Callback<ScheduleCore>() {
            @Override
            public void onResponse(Call<ScheduleCore> call, Response<ScheduleCore> response) {
                ScheduleCore responseList = response.body();
                List<Schedule> schedules = responseList.getSchedules();
                StringBuilder s = new StringBuilder();
                for(int i = 0; i < schedules.size(); i++){
                    for(int j = 0; j < schedules.get(i).getSchedule().size(); j++){
                        s.append(schedules.get(i).getSchedule().get(j).getLessonTime()).append(", ")
                                .append(schedules.get(i).getSchedule().get(j).getSubject()).append("\n");
                    }
                }
                textOutput.setText(s.toString());
            }

            @Override
            public void onFailure(Call<ScheduleCore> call, Throwable t) {
                System.out.println(t.toString());
            }
        });
    }


}
