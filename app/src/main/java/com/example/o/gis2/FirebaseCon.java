package com.example.o.gis2;


import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FirebaseCon {


    public void InsertGI(String Locality, String SubLocality, String Thoroughfare)

    {

        DatabaseReference mRootRef = FirebaseDatabase.getInstance().getReference();
        DatabaseReference siRef = mRootRef.child("Si");
        DatabaseReference gooRef = mRootRef.child("Goo");
        //시간정보도 추가해야할듯
        siRef.setValue(Locality);
        gooRef.setValue(SubLocality);
        //일단 이렇게만

    }

}
