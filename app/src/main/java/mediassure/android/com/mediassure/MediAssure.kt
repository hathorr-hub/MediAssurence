package mediassure.android.com.mediassure

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager


class MediAssure : Activity() {

    private var SPLASH_TIME_OUT = 6000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        requestWindowFeature(Window.FEATURE_NO_TITLE)

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_medi_assure)

        Handler().postDelayed(
                {
                    startActivity(Intent(this, LandingScreen::class.java))
                    overridePendingTransition(R.anim.abc_fade_in, R.anim.abc_fade_out)
                    finish()
                }, SPLASH_TIME_OUT.toLong())
    }
}




