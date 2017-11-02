package `in`.akshatagrawal.customimageview

import `in`.akshatagrawal.customcolorimageview.CustomImageView
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var ivCustom: CustomImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ivCustom = findViewById(R.id.iv_custom);
        ivCustom?.setTintColor(resources.getColor(R.color.colorAccent))
    }
}
