package com.example.au_result;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CGPAActivity extends AppCompatActivity {

    private EditText edtText1,edtText2,edtText3,edtText4,edtText5,edtText6;
    private Button btn1;
    private TextView txtMark;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_g_p_a);

        edtText1 = findViewById(R.id.edtText1);
        edtText2 = findViewById(R.id.edtText2);
        edtText3 = findViewById(R.id.edtText3);
        edtText4 = findViewById(R.id.edtText4);
        edtText5 = findViewById(R.id.edtText5);
        edtText6 = findViewById(R.id.edtText6);

        btn1 = findViewById(R.id.btn1);

        txtMark = findViewById(R.id.txtMark);



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String e1 = edtText1.getText().toString();
                String e2 = edtText2.getText().toString();
                String e3 = edtText3.getText().toString();
                String e4 = edtText4.getText().toString();
                String e5 = edtText5.getText().toString();
                String e6 = edtText6.getText().toString();
                if (e1.isEmpty() || e2.isEmpty() || e3.isEmpty() || e4.isEmpty() || e5.isEmpty() || e6.isEmpty()){
                    txtMark.setText("Please fill all the GPA !!!");
                }else{
                    float avg = Float.parseFloat(e1)+Float.parseFloat(e2)+Float.parseFloat(e3)+Float.parseFloat(e4)+Float.parseFloat(e5)+Float.parseFloat(e6);
                    float m = avg/6;
                    txtMark.setText("Your CGPA  upto 6th sem is : "+ String.format("%.2f",m));
                }
            }
        });


    }
}