package nl.entreco.giddyapp.viewer

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class ViewerActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewer)
    }

    fun launchProfile(view: View){
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://giddy.entreco.nl/profile/"))
            .setPackage(packageName)
            .addCategory(Intent.CATEGORY_DEFAULT)
            .addCategory(Intent.CATEGORY_BROWSABLE)
        startActivity(intent)
    }
}