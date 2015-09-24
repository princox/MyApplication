package com.example.com.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText edit1;
    EditText edit2;
    Button btnAdd;
    Button btnMul;
    Button btnDiv;
    Button btnMod;
    Button btnSub;
    TextView textResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edit1 = (EditText) findViewById(R.id.Edit1);
        EditText edit2 = (EditText) findViewById(R.id.Edit2);
        Button btnAdd = (Button) findViewById(R.id.BtnAdd);
        Button btnSub = (Button) findViewById(R.id.BtnSub);
        Button btnMul = (Button) findViewById(R.id.BtnMul);
        Button btnDiv = (Button) findViewById(R.id.BtnDiv);
        Button btnMod = (Button) findViewById(R.id.BtnMod);
        TextView textResult = (TextView) findViewById(R.id.TextResult);

        String num1, num2;
        Integer result;
        btnAdd.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnMod.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        String strNum1 = edit1.getText().toString();
        String strNum2 = edit2.getText().toString();

        if(strNum1.length()==0 || strNum2.length()==0){
            Toast.makeText(getApplicationContext(),"숫자를 넣어주세요", Toast.LENGTH_SHORT).show();
        }
        else{
        }
        switch (v.getId()){
            case R.id.BtnAdd:
                break;
            case R.id.BtnDiv:
                break;
            case R.id.BtnSub:
                Double i1 = Double.parseDouble(edit1.getText().toString());
                Double i2 = Double.parseDouble(edit2.getText().toString());
                Double i3 = i1-i2;
                textResult.setText(i3.toString());
                break;
            case R.id.BtnMul:
                break;
        }
    }
    //
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
}
