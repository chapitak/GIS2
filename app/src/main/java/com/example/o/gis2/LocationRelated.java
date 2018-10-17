package com.example.o.gis2;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.util.Log;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.lang.String;

public class LocationRelated {
    //주소 넣어주는 함수
    public  Address toAddress(Context context, double Latitude, double Longitude, String TAG ) {

        try {
            Geocoder geocoder = new Geocoder(context, Locale.KOREA);
            List<Address> addresses = geocoder.getFromLocation(Latitude,Longitude,1);

            if (addresses.size() >0) {
                Address address = addresses.get(0);
                //mAddressText.setText(String.format(address.getAddressLine(0).toString()));
                //AddressArray = String.format(address.getAddressLine(0).toString()).split(" ");

                //mAddressText.setText(String.format("\n[%s]\n[%s]\n[%s]",address.getLocality(),address.getSubLocality(), address.getThoroughfare()));
                //AddressArray[0],AddressArray[1],AddressArray[2])); getLocality()가 서울특별시. getSubLocality()는 종로구 , getThoroughfare는 원서동.
                // ));
                return  address;
            }
        } catch (IOException e) {
            Log.e(TAG, "Failed in using Geocoder",e);
        }

    }



}
