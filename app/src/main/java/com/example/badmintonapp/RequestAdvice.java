package com.example.badmintonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RequestAdvice extends AppCompatActivity {

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference userReference;

    EditText nameField;
    EditText emailField;
    EditText topicField;
    EditText descriptionField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_advice);

        nameField = (EditText) findViewById(R.id.name_edit_field);
        emailField = (EditText) findViewById(R.id.email_edit_field);
        topicField =(EditText) findViewById(R.id.topic_edit_field);
        descriptionField = (EditText) findViewById(R.id.description_edit_field);
        userReference = database.getReference("CoachAdvice");

    }

    public void sendToFirebase(View view) {
        String name = nameField.getText().toString();
        String email = emailField.getText().toString();
        String topic = topicField.getText().toString();
        String description = descriptionField.getText().toString();

        CoachAdvice coachAdvice = new CoachAdvice(name,email,topic,description);
        userReference.push().setValue(coachAdvice);
    }
}
