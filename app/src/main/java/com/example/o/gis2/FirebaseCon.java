package com.example.o.gis2;


import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ServerValue;

public class FirebaseCon {


    public void InsertGI(String Locality, String SubLocality, String Thoroughfare)

    {

        DatabaseReference mRootRef = FirebaseDatabase.getInstance().getReference();
        DatabaseReference locationRef = mRootRef.child("Location");
        String key = locationRef.push().getKey();
        DatabaseReference uid = locationRef.child(key).child("UID");
        DatabaseReference AddressStr = locationRef.child(key).child("Address");
        DatabaseReference siRef = AddressStr.child("Si");
        DatabaseReference gooRef = AddressStr.child("Goo");
        DatabaseReference regTime = locationRef.child(key).child("Timestamp");
        //시간정보도 추가해야할듯

        uid.setValue(FirebaseAuth.getInstance().getCurrentUser().getUid());
        siRef.setValue(Locality);
        gooRef.setValue(SubLocality);
        regTime.setValue(ServerValue.TIMESTAMP);
        //regTime.setValue()
        //일단 이렇게만

    }

}
