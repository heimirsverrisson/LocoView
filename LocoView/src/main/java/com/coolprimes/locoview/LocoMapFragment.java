package com.coolprimes.locoview;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.MapFragment;

/**
 * Created by Heimir Sverrisson on 12/1/13.
 */
public class LocoMapFragment extends MapFragment {
    private static final String D_TAG = "LocoMapFragment";

    public LocoMapFragment(){
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if(BuildConfig.DEBUG){
            Log.d(D_TAG, "LocoMapFragment.onCreateView");
        }
        return inflater.inflate(R.id.loco_map, container, false);
    }

    public static Fragment newInstance(Activity parentActivity){
        if(BuildConfig.DEBUG){
            Log.d(D_TAG, "LocoMapFragment.newInstance");
        }
        MapFragment mapFragment = MapFragment.newInstance();
        FragmentTransaction fragmentTransaction = parentActivity.getFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.loco_map, mapFragment);
        fragmentTransaction.commit();
        return mapFragment;
    }
}