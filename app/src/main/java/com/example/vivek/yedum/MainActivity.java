package com.example.vivek.yedum;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean userNameComplete = false, userEmailComplete = false,
            userPassCorrect = false, userPassAuthCorrect = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView profilePicture = (ImageView) findViewById(R.id.ivProfilePic);

        EditText userName = (EditText) findViewById(R.id.etUserName);
        EditText userEmail = (EditText) findViewById(R.id.etUserEmail);
        EditText userPassword = (EditText) findViewById(R.id.etUserPass);
        EditText userPassAuth = (EditText) findViewById(R.id.etUserPassAuth);

        Button submitButton = (Button) findViewById(R.id.btSubmitRegistration);

        submitButton.setOnClickListener();


    }

    private class SubmitButtonListener implements Button.OnClickListener{

        boolean [] registerComplete;

        SubmitButtonListener(boolean [] registerComplete){
            this.registerComplete = registerComplete;
        }

        @Override
        public void onClick(View view) {
            for (int i=0;i<registerComplete.length;i++){
                if (registerComplete[i]==false)return;
            }

            startActivity(new Intent(MainActivity.this, ));
        }
    }
    private boolean[] registerCorrect(EditText userName, EditText userEmail, EditText userPassword, EditText userPassAuth){
        boolean[] registerComplete = new boolean[]{userNameComplete, userEmailComplete, userPassCorrect, userPassAuthCorrect};

        if (userName.getText().toString().length() != 0) registerComplete[0] = true;
        if (userEmail.getText().toString().length() != 0) registerComplete[1] = true;
        if (userPassword.getText().toString().length() != 0) registerComplete[2] = true;
        if (userPassAuth.getText().toString().length() != 0
                && userPassAuth.getText().toString().equals(userPassword.getText().toString())) {
               registerComplete[3] = true;
        }
        return registerComplete;
    }
}
