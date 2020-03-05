package com.example.etanker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class customerDashboard extends AppCompatActivity {

    LinearLayout logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_dashboard);

        logout=(LinearLayout)findViewById(R.id.logout);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(customerDashboard.this,loginActivity.class));
                Toast.makeText(customerDashboard.this, "Logged out successfully...", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
