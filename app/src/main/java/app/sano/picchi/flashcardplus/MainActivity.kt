package app.sano.picchi.flashcardplus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mCards : ArrayList<Card> = arrayListOf()
        val mCardAdapter : CardAdapter

        mCards.add(Card(R.drawable.m,
            getString(R.string.jump_title),
            getString(R.string.jump_content),
            getString(R.string.jump_mean))
        )

        mCards.add(Card(R.drawable.president,
            getString(R.string.president_title),
            getString(R.string.president_content),
            getString(R.string.president_mean))
        )

        mCardAdapter = CardAdapter(this,R.layout.card,mCards)
        listView.adapter = mCardAdapter


    }
}
