package reminder.example.namespace;

import android.app.Activity;
import android.os.Bundle;
import org.apache.cordova.*;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ReminderActivity extends DroidGap {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        super.loadUrl("file:///android_asset/www/index.html");
    }
}