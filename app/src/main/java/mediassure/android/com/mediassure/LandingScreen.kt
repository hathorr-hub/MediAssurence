package mediassure.android.com.mediassure

import android.app.Activity
import android.os.Bundle
import android.os.PersistableBundle

/**
 * Created by BlueFrog on 09-11-2017.
 */

class LandingScreen : Activity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.landing_screen)
    }
}
