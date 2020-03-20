package com.example.etanker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
<<<<<<< HEAD
import android.widget.TextView;
=======
>>>>>>> changed layout color
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
<<<<<<< HEAD
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

import javax.annotation.Nullable;

public class customerDashboard extends AppCompatActivity {
    LinearLayout logout;
    FirebaseAuth fAuth;
    TextView name;
    TextView phoneNumber;
    FirebaseFirestore firestoredb;
    String userID;

=======

public class customerDashboard extends AppCompatActivity {

    LinearLayout logout;
>>>>>>> changed layout color

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_dashboard);

<<<<<<< HEAD
        logout=findViewById(R.id.logout);
        fAuth=FirebaseAuth.getInstance();
        name=findViewById(R.id.name);
        phoneNumber=findViewById(R.id.phoneNumber);
        fAuth=FirebaseAuth.getInstance();
        firestoredb=FirebaseFirestore.getInstance();


        userID=fAuth.getCurrentUser().getUid();

        DocumentReference documentReference=firestoredb.collection("customers").document(userID);
        documentReference.addSnapshotListener(this, new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot documentSnapshot, @Nullable FirebaseFirestoreException e){
                name.setText(documentSnapshot.getString("name"));
                phoneNumber.setText(documentSnapshot.getString("phone"));

            }
        });



        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(customerDashboard.this, "Logged out successfully...", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(),loginActivity.class));
                finish();
                }
        });


=======
        logout=(LinearLayout)findViewById(R.id.logout);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(customerDashboard.this,loginActivity.class));
                Toast.makeText(customerDashboard.this, "Logged out successfully...", Toast.LENGTH_SHORT).show();
            }
        });

>>>>>>> changed layout color
    }
}
