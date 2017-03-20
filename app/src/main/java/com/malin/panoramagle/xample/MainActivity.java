package com.malin.panoramagle.xample;

import android.hardware.SensorEvent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import com.panoramagl.PLICamera;
import com.panoramagl.PLISceneElement;
import com.panoramagl.PLIView;
import com.panoramagl.PLImage;
import com.panoramagl.PLManager;
import com.panoramagl.PLSphericalPanorama;
import com.panoramagl.PLView;
import com.panoramagl.PLViewListener;
import com.panoramagl.enumerations.PLCameraAnimationType;
import com.panoramagl.hotspots.PLIHotspot;
import com.panoramagl.ios.UITouch;
import com.panoramagl.ios.structs.CGPoint;
import com.panoramagl.ios.structs.UIAcceleration;
import com.panoramagl.loaders.PLILoader;
import com.panoramagl.structs.PLPosition;
import com.panoramagl.transitions.PLITransition;
import com.panoramagl.utils.PLUtils;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    PLManager plManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        plManager = new PLManager(this);
        plManager.setContentView(R.layout.activity_main);
        plManager.onCreate();

        PLSphericalPanorama panorama = new PLSphericalPanorama();
        panorama.getCamera().lookAt(30.0f, 90.0f);



        panorama.setImage(new PLImage(PLUtils.getBitmap(this, R.raw.sighisoara_sphere), false));
        plManager.setPanorama(panorama);

        plManager.setListener(new PLViewListener() {
            @Override
            public void onTouchesBegan(PLIView view, List<UITouch> touches, MotionEvent event) {
                super.onTouchesBegan(view, touches, event);
            }

            @Override
            public void onTouchesMoved(PLIView view, List<UITouch> touches, MotionEvent event) {
                super.onTouchesMoved(view, touches, event);
            }

            @Override
            public void onTouchesEnded(PLIView view, List<UITouch> touches, MotionEvent event) {
                super.onTouchesEnded(view, touches, event);
            }

            @Override
            public boolean onShouldBeginTouching(PLIView view, List<UITouch> touches, MotionEvent event) {
                return super.onShouldBeginTouching(view, touches, event);
            }

            @Override
            public void onDidBeginTouching(PLIView view, List<UITouch> touches, MotionEvent event) {
                super.onDidBeginTouching(view, touches, event);
            }

            @Override
            public boolean onShouldMoveTouching(PLIView view, List<UITouch> touches, MotionEvent event) {
                return super.onShouldMoveTouching(view, touches, event);
            }

            @Override
            public void onDidMoveTouching(PLIView view, List<UITouch> touches, MotionEvent event) {
                super.onDidMoveTouching(view, touches, event);
            }

            @Override
            public boolean onShouldEndTouching(PLIView view, List<UITouch> touches, MotionEvent event) {
                return super.onShouldEndTouching(view, touches, event);
            }

            @Override
            public void onDidEndTouching(PLIView view, List<UITouch> touches, MotionEvent event) {
                super.onDidEndTouching(view, touches, event);
            }

            @Override
            public boolean onShouldAccelerate(PLIView view, UIAcceleration acceleration, SensorEvent event) {
                return super.onShouldAccelerate(view, acceleration, event);
            }

            @Override
            public void onDidAccelerate(PLIView view, UIAcceleration acceleration, SensorEvent event) {
                super.onDidAccelerate(view, acceleration, event);
            }

            @Override
            public boolean onShouldBeginInertia(PLIView view, CGPoint startPoint, CGPoint endPoint) {
                return super.onShouldBeginInertia(view, startPoint, endPoint);
            }

            @Override
            public void onDidBeginInertia(PLIView view, CGPoint startPoint, CGPoint endPoint) {
                super.onDidBeginInertia(view, startPoint, endPoint);
            }

            @Override
            public boolean onShouldRunInertia(PLIView view, CGPoint startPoint, CGPoint endPoint) {
                return super.onShouldRunInertia(view, startPoint, endPoint);
            }

            @Override
            public void onDidRunInertia(PLIView view, CGPoint startPoint, CGPoint endPoint) {
                super.onDidRunInertia(view, startPoint, endPoint);
            }

            @Override
            public void onDidEndInertia(PLIView view, CGPoint startPoint, CGPoint endPoint) {
                super.onDidEndInertia(view, startPoint, endPoint);
            }

            @Override
            public boolean onShouldBeingScrolling(PLIView view, CGPoint startPoint, CGPoint endPoint) {
                return super.onShouldBeingScrolling(view, startPoint, endPoint);
            }

            @Override
            public void onDidBeginScrolling(PLIView view, CGPoint startPoint, CGPoint endPoint) {
                super.onDidBeginScrolling(view, startPoint, endPoint);
            }

            @Override
            public void onDidEndScrolling(PLIView view, CGPoint startPoint, CGPoint endPoint) {
                super.onDidEndScrolling(view, startPoint, endPoint);
            }

            @Override
            public boolean onShouldBeginZooming(PLIView view) {
                return super.onShouldBeginZooming(view);
            }

            @Override
            public void onDidBeginZooming(PLIView view, CGPoint startPoint, CGPoint endPoint) {
                super.onDidBeginZooming(view, startPoint, endPoint);
            }

            @Override
            public boolean onShouldRunZooming(PLIView view, float distance, boolean isZoomIn, boolean isZoomOut) {
                return super.onShouldRunZooming(view, distance, isZoomIn, isZoomOut);
            }

            @Override
            public void onDidRunZooming(PLIView view, float distance, boolean isZoomIn, boolean isZoomOut) {
                super.onDidRunZooming(view, distance, isZoomIn, isZoomOut);
            }

            @Override
            public void onDidEndZooming(PLIView view) {
                super.onDidEndZooming(view);
            }

            @Override
            public boolean onShouldReset(PLIView view) {
                return super.onShouldReset(view);
            }

            @Override
            public void onDidReset(PLIView view) {
                super.onDidReset(view);
            }

            @Override
            public void onDidBeginCameraAnimation(PLIView view, Object sender, PLICamera camera, PLCameraAnimationType type) {
                super.onDidBeginCameraAnimation(view, sender, camera, type);
            }

            @Override
            public void onDidEndCameraAnimation(PLIView view, Object sender, PLICamera camera, PLCameraAnimationType type) {
                super.onDidEndCameraAnimation(view, sender, camera, type);
            }

            @Override
            public void onDidResetCamera(PLIView view, Object sender, PLICamera camera) {
                super.onDidResetCamera(view, sender, camera);
            }

            @Override
            public void onDidLookAtCamera(PLIView view, Object sender, PLICamera camera, float pitch, float yaw, boolean animated) {
                super.onDidLookAtCamera(view, sender, camera, pitch, yaw, animated);
            }

            @Override
            public void onDidRotateCamera(PLIView view, Object sender, PLICamera camera, float pitch, float yaw, float roll) {
                super.onDidRotateCamera(view, sender, camera, pitch, yaw, roll);
            }

            @Override
            public void onDidFovCamera(PLIView view, Object sender, PLICamera camera, float fov, boolean animated) {
                super.onDidFovCamera(view, sender, camera, fov, animated);
            }

            @Override
            public void onDidOverElement(PLIView view, PLISceneElement element, CGPoint screenPoint, PLPosition scene3DPoint) {
                super.onDidOverElement(view, element, screenPoint, scene3DPoint);
            }

            @Override
            public void onDidClickElement(PLIView view, PLISceneElement element, CGPoint screenPoint, PLPosition scene3DPoint) {
                super.onDidClickElement(view, element, screenPoint, scene3DPoint);
            }

            @Override
            public void onDidOutElement(PLIView view, PLISceneElement element, CGPoint screenPoint, PLPosition scene3DPoint) {
                super.onDidOutElement(view, element, screenPoint, scene3DPoint);
            }

            @Override
            public void onDidOverHotspot(PLIView view, PLIHotspot hotspot, CGPoint screenPoint, PLPosition scene3DPoint) {
                super.onDidOverHotspot(view, hotspot, screenPoint, scene3DPoint);
            }

            @Override
            public void onDidClickHotspot(PLIView view, PLIHotspot hotspot, CGPoint screenPoint, PLPosition scene3DPoint) {
                super.onDidClickHotspot(view, hotspot, screenPoint, scene3DPoint);
            }

            @Override
            public void onDidOutHotspot(PLIView view, PLIHotspot hotspot, CGPoint screenPoint, PLPosition scene3DPoint) {
                super.onDidOutHotspot(view, hotspot, screenPoint, scene3DPoint);
            }

            @Override
            public void onDidBeginTransition(PLIView view, PLITransition transition) {
                super.onDidBeginTransition(view, transition);
            }

            @Override
            public void onDidProcessTransition(PLIView view, PLITransition transition, int progressPercentage) {
                super.onDidProcessTransition(view, transition, progressPercentage);
            }

            @Override
            public void onDidStopTransition(PLIView view, PLITransition transition, int progressPercentage) {
                super.onDidStopTransition(view, transition, progressPercentage);
            }

            @Override
            public void onDidEndTransition(PLIView view, PLITransition transition) {
                super.onDidEndTransition(view, transition);
            }

            @Override
            public void onDidBeginLoader(PLIView view, PLILoader loader) {
                super.onDidBeginLoader(view, loader);
            }

            @Override
            public void onDidCompleteLoader(PLIView view, PLILoader loader) {
                super.onDidCompleteLoader(view, loader);
            }

            @Override
            public void onDidStopLoader(PLIView view, PLILoader loader) {
                super.onDidStopLoader(view, loader);
            }

            @Override
            public void onDidErrorLoader(PLIView view, PLILoader loader, String error) {
                super.onDidErrorLoader(view, loader, error);
            }
        });


//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        setTitle(getString(R.string.app_name));

    }

    @Override
    protected void onResume() {
        super.onResume();
        plManager.onResume();
    }

    @Override
    protected void onPause() {
        plManager.onPause();
        super.onPause();
    }
    @Override
    protected void onDestroy() {
        plManager.onDestroy();
        super.onDestroy();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return plManager.onTouchEvent(event);
    }
}
