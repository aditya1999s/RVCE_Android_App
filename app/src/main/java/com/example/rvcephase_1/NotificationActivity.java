package com.example.rvcephase_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class NotificationActivity extends AppCompatActivity {
    ListView listView;
    TextView textView;
    String[] listItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        listView=(ListView)findViewById(R.id.listView);
        textView=(TextView)findViewById(R.id.textView);
        listItem = getResources().getStringArray(R.array.array_technology);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, listItem);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // TODO Auto-generated method stub
                String value=adapter.getItem(position);
                String va=value.substring(0,2);
                String link="";
                switch (va){
                    case "1 ":
                        link="http://rvce.edu.in/Admission";
                        break;
                    case "2 ":
                        link="https://rvce.edu.in/sites/default/files/BE-ManagementQuotaAdmission2021-22atRVITM";
                        break;
                    case "3 ":
                        link="https://rvce.edu.in/sites/default/files/CIRCULAR%20-%2021%20Apr%202021.pdf";
                        break;
                    case "4 ":
                        link="http://112.133.207.140/cctv/index1.html";
                        break;
                    case "5 ":
                        link="https://rvce.edu.in/sites/default/files/RVCollegeofEngineering2021NIRFDCS.pdf";
                        
                        break;
                    case "6 ":
                        link="https://rvce.edu.in/sites/default/files/SEE-Timetable-ODDSem.pdf";
                        break;
                    case "7 ":link="https://rvce.edu.in/Time-Tables";
                    break;
                    case "8 ":
                        link="http://rvce.edu.in/pg-circular-and-notifications";
                        break;
                    case "9 ":
                        link="https://rvce.edu.in/statutoryapprovals";
                    break;
                    case "10":
                        link="http://rvce.edu.in/NBAApprovals";
                        break;
                    case "11":
                        link="http://rvce.edu.in/campus-safety-records";
                        break;
                }
                Uri uri = Uri.parse( link );
                startActivity( new Intent( Intent.ACTION_VIEW, uri ) );
                Toast.makeText(getApplicationContext(),value,Toast.LENGTH_SHORT).show();

            }
        });
    }
}
