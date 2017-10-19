package softveloper.com.dreamteam

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class PlayerDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player_detail)

        val imageView = findViewById(R.id.imageView) as ImageView
        val nameTextView = findViewById(R.id.nameTextView) as TextView

        imageView.setImageResource(R.mipmap.ic_launcher)
        nameTextView.text = intent.extras["name"] as CharSequence?
    }
}
