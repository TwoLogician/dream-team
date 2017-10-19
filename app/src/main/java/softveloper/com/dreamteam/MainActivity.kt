package softveloper.com.dreamteam

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity(), AdapterView.OnItemClickListener {

    private val dreamTeams = listOf("Kristaps Porzingis", "Damian Lillard", "Jimmer Fredette", "Rasheed Wallance", "Adam Morrison")
    private lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ArrayAdapter<String>(applicationContext, android.R.layout.simple_list_item_1, dreamTeams)

        listView = findViewById(R.id.listView) as ListView
        listView.adapter = adapter
        listView.onItemClickListener = this
    }

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        val intent = Intent(applicationContext, PlayerDetailActivity::class.java)
        intent.putExtra("name", dreamTeams[position])
        startActivity(intent)
    }
}
