package nl.entreco.giddyapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        launchViewer()
        finish()
    }

    private fun launchViewer() {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://giddy.entreco.nl/viewer/"))
            .setPackage(packageName)
            .addCategory(Intent.CATEGORY_DEFAULT)
            .addCategory(Intent.CATEGORY_BROWSABLE)
        startActivity(intent)
    }
}
