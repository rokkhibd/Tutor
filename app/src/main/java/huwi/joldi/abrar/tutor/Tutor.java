package huwi.joldi.abrar.tutor;

import android.app.Application;

import com.google.firebase.FirebaseApp;
import com.nostra13.universalimageloader.core.ImageLoader;

import huwi.joldi.abrar.tutor.Utils.UniversalImageLoader;


public class Tutor extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        UniversalImageLoader universalImageLoader = new UniversalImageLoader(this);
        ImageLoader.getInstance().init(universalImageLoader.getConfig());
        //FirebaseApp.initializeApp(this);

//        FirebaseFirestore firestore = FirebaseFirestore.getInstance();
//        FirebaseFirestoreSettings settings = new FirebaseFirestoreSettings.Builder()
//                .setTimestampsInSnapshotsEnabled(true)
//                .build();
//        firestore.setFirestoreSettings(settings);

    }
}
