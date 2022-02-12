package com.example.blackhats;

import androidx.appcompat.app.AppCompatActivity;




import android.content.Intent;
import android.os.Bundle;


import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;

import android.widget.TextView;



import com.google.firebase.auth.FirebaseAuth;

import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import androidx.annotation.NonNull;

import android.app.Activity;
import android.net.Uri;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.UploadTask;
import com.squareup.picasso.Picasso;


import javax.annotation.Nullable;


import android.os.Bundle;

public class NotificationActivity extends AppCompatActivity {


    TextView not1, not2, not3, not4;
    FirebaseAuth fAuth;
    FirebaseFirestore fStore;
    String userId;
    ImageView homeButton;
    FirebaseUser user;

    StorageReference storageReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        homeButton = findViewById(R.id.menu);
        Intent data = getIntent();


        not1 = findViewById(R.id.n01);
        not2 = findViewById(R.id.n02);
        not3= findViewById(R.id.n03);
        not4= findViewById(R.id.n04);

        storageReference = FirebaseStorage.getInstance().getReference();

        fAuth = FirebaseAuth.getInstance();
        fStore = FirebaseFirestore.getInstance();
        userId = fAuth.getCurrentUser().getUid();



        userId = fAuth.getCurrentUser().getUid();
        user = fAuth.getCurrentUser();


        storageReference = FirebaseStorage.getInstance().getReference();

        DocumentReference documentReference = fStore.collection("users").document(userId);
        documentReference.addSnapshotListener(this, new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot documentSnapshot, @Nullable FirebaseFirestoreException e) {

                not1.setText(documentSnapshot.getString("Notification01"));
                not2.setText(documentSnapshot.getString("Notification02"));
                not3.setText(documentSnapshot.getString("Notification03"));
                not4.setText(documentSnapshot.getString("Notification04"));


            }


        });

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NotificationActivity.this , HomeActivity.class));
            }
        });




    }
}