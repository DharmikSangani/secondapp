package com.example.secondapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
TextView disinput,disoutput;
Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnce,btnt,btndiv,btnmul,btnsub,btnsum,btne,btndot;
ImageButton imageButton;
String data,temp;
double n1,n2,sum;
String operator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnce = findViewById(R.id.btnce);
        imageButton = findViewById(R.id.btnca);
        btnt = findViewById(R.id.btnt);
        btndiv = findViewById(R.id.btndiv);
        btnmul = findViewById(R.id.btnmul);
        btnsub = findViewById(R.id.btnsub);
        btnsum = findViewById(R.id.btnsum);
        btne = findViewById(R.id.btne);
        btndot = findViewById(R.id.btndot);
        disinput = findViewById(R.id.disinput);
        disoutput = findViewById(R.id.disoutput);



        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnce.setOnClickListener(this);
        imageButton.setOnClickListener(this);
        btnt.setOnClickListener(this);
        btnmul.setOnClickListener(this);
        btndiv.setOnClickListener(this);
        btndot.setOnClickListener(this);
        btnsub.setOnClickListener(this);
        btnsum.setOnClickListener(this);
        btne.setOnClickListener(this);
    }




    @Override
    public void onClick(View view)
    {
        try {
            if(view.getId()==btn0.getId())
            {
                data=disinput.getText().toString();
                temp=data+"0";
                disinput.setText(""+temp);
            }
            if(view.getId()==btn1.getId())
            {
                data=disinput.getText().toString();
                temp=data+"1";
                disinput.setText(""+temp);
            }
            if(view.getId()==btn2.getId())
            {
                data=disinput.getText().toString();
                temp=data+"2";
                disinput.setText(""+temp);
            }
            if(view.getId()==btn3.getId())
            {
                data=disinput.getText().toString();
                temp=data+"3";
                disinput.setText(""+temp);
            }
            if(view.getId()==btn4.getId())
            {
                data=disinput.getText().toString();
                temp=data+"4";
                disinput.setText(""+temp);
            }
            if(view.getId()==btn5.getId())
            {
                data=disinput.getText().toString();
                temp=data+"5";
                disinput.setText(""+temp);
            }
            if(view.getId()==btn6.getId())
            {
                data=disinput.getText().toString();
                temp=data+"6";
                disinput.setText(""+temp);
            }
            if(view.getId()==btn7.getId())
            {
                data=disinput.getText().toString();
                temp=data+"7";
                disinput.setText(""+temp);
            }
            if(view.getId()==btn8.getId())
            {
                data=disinput.getText().toString();
                temp=data+"8";
                disinput.setText(""+temp);
            }
            if(view.getId()==btn9.getId())
            {
                data=disinput.getText().toString();
                temp=data+"9";
                disinput.setText(""+temp);
            }
            if(view.getId()==btndot.getId())
            {
                data=disinput.getText().toString();
                temp=data+".";
                disinput.setText(""+temp);
            }



            if(view.getId()==btnce.getId())
            {
                disoutput.setText("");
                disinput.setText("");
            }


            if (view.getId()==imageButton.getId())
            {
                temp=disinput.getText().toString().substring(0,temp.length()-1);
                disinput.setText(""+temp);
            }


            if (view.getId()==btnsum.getId())
            {
                n1= Double.parseDouble(disinput.getText().toString());
                disinput.setText("");
                operator="sum";
            }
            if (view.getId()==btnsub.getId())
            {
                n1= Double.parseDouble(disinput.getText().toString());
                disinput.setText("");
                operator="sub";
            }
            if (view.getId()==btnmul.getId())
            {
                n1= Double.parseDouble(disinput.getText().toString());
                disinput.setText("");
                operator="mul";
            }
            if (view.getId()==btndiv.getId())
            {
                n1= Double.parseDouble(disinput.getText().toString());
                disinput.setText("");
                operator="div";
            }
            if (view.getId()==btnt.getId())
            {
                n1= Double.parseDouble(disinput.getText().toString());
                disinput.setText("");
                operator="Per";
            }



            if(view.getId()==btne.getId())
            {
                n2=Double.parseDouble(disinput.getText().toString());
                if(operator.equals("sum")) {
                    sum = n1 + n2;
                    disinput.setText("");
                    disoutput.setText("" + sum);
                }
                if (operator.equals("sub"))
                {
                    sum=n1-n2;
                    disinput.setText("");
                    disoutput.setText("" + sum);
                }
                if (operator.equals("mul"))
                {
                    sum=n1*n2;
                    disinput.setText("");
                    disoutput.setText("" + sum);
                }
                if (operator.equals("div"))
                {
                    sum=n1/n2;
                    disinput.setText("");
                    disoutput.setText("" + sum);
                }
                if (operator.equals("Per"))
                {
                    sum=n1*n2/100;
                    disinput.setText("");
                    disoutput.setText("" + sum);
                }
            }
        }
        catch (Exception ex){
            Toast.makeText(this, "something went wrong...", Toast.LENGTH_SHORT).show();
        }
    }
}