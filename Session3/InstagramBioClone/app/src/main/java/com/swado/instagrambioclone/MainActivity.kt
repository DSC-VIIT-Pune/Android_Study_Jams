package com.swado.instagrambioclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.lang.Integer.parseInt

class MainActivity : AppCompatActivity() {

    //varibles related to text
    lateinit var name :TextView;
    lateinit var work :TextView;
    lateinit var desc :TextView;
    lateinit var followers:TextView;

    //varibles related to editText
    lateinit var nameEdit : EditText;
    lateinit var workEdit :EditText;
    lateinit var descEdit :EditText;


    //varible related to buttons
     lateinit var editBtn:Button;
    lateinit var doneBtn:Button;
    lateinit var followBtn:Button;




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name=findViewById(R.id.profileName);
        work=findViewById(R.id.profileWork);
        desc=findViewById(R.id.profileDesc);
        followers=findViewById(R.id.noFollowers);

        nameEdit=findViewById(R.id.profileNameEdit);
        workEdit=findViewById(R.id.profileWorkEdit);
        descEdit=findViewById(R.id.profileDescEdit);


        editBtn=findViewById(R.id.editBtn);
        followBtn=findViewById(R.id.followBtn);
        doneBtn=findViewById(R.id.doneBtn);

        editBtn.setOnClickListener(View.OnClickListener {

            name.visibility=GONE;
            work.visibility= GONE;
            desc.visibility=GONE;

            nameEdit.visibility= VISIBLE;
            workEdit.visibility= VISIBLE;
            descEdit.visibility= VISIBLE;


            editBtn.visibility= GONE;
            doneBtn.visibility= VISIBLE;

        })

        doneBtn.setOnClickListener(View.OnClickListener {

            name.visibility= VISIBLE;
            work.visibility= VISIBLE;
            desc.visibility= VISIBLE;


            name.setText(nameEdit.text);
            work.setText(workEdit.text);
            desc.setText(descEdit.text);


            nameEdit.visibility= GONE;
            workEdit.visibility= GONE;
            descEdit.visibility= GONE;


            editBtn.visibility= VISIBLE;
            doneBtn.visibility= GONE;

        })


        followBtn.setOnClickListener(View.OnClickListener {

            var a= parseInt(followers.text.toString());

            a+=1;
            followers.setText(a.toString());

        })



    }
}