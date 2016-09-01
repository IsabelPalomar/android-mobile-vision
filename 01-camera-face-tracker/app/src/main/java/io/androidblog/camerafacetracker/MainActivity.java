package io.androidblog.camerafacetracker;

import android.Manifest;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.vision.CameraSource;
import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.MultiProcessor;
import com.google.android.gms.vision.Tracker;
import com.google.android.gms.vision.face.Face;
import com.google.android.gms.vision.face.FaceDetector;
import com.google.android.gms.vision.face.LargestFaceFocusingProcessor;

import java.io.IOException;

import io.androidblog.camerafacetracker.ui.camera.CameraSourcePreview;
import io.androidblog.camerafacetracker.ui.camera.GraphicOverlay;


/**
 * First steps:
 * 1.- Add Play Services dependency to gradle
 * 2.- Add the CustomViews ()
 * 3.- Build a basic UI
 */

/**
 * 4.- Add Camera permission to Manifest
 * 5.- Add meta-data to manifest
 * 6.- Add Support design dependency
 */

/**
 * 7.- Get CameraSourcePreview and GraphicOverlay views and flipButton
 * 8.- Create onClickListener for flipButton (flip the camera)
 */

/** 9.- Add the EyePhysics, GooglyEyesGraphic and GooglyFaceTracker classes
 * 10.- Check for cameraPermissions and overwrite onRequestPermissions
 * 11.- Add onResume, onPause and onDestroy methods
 */

public class MainActivity extends AppCompatActivity {

    private CameraSourcePreview mPreview;
    private GraphicOverlay mGraphicOverlay;
    private static final String TAG = "MobileVision";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //4.- Get CameraSourcePreview and GraphicOverlay views and flipButton
        mPreview = (CameraSourcePreview) findViewById(R.id.preview);
        mGraphicOverlay = (GraphicOverlay) findViewById(R.id.faceOverlay);
        final Button button= (Button) findViewById(R.id.flipButton);

        //5.- Create onClickListener for flipButton
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "click click");
            }
        });



    }


}

