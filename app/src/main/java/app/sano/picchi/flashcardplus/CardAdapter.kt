package app.sano.picchi.flashcardplus

import android.content.Context
import android.content.res.Resources
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import java.util.*

class CardAdapter(context: Context, layoutResourcesId: Int, objects: List<Card>):
    ArrayAdapter<Card>(context,layoutResourcesId,objects) {

    var mCard: List<Card> = objects

    override fun getCount(): Int {
        return mCard.size
    }

    override fun getItem(position: Int): Card? {
        return mCard[position]
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup):View{


        val (viewHolder, convertView) = if (convertView == null) {
            val inflater = LayoutInflater.from(context)
            val convertView = inflater.inflate(R.layout.card, null)
            val viewHolder = ViewHolder(convertView)

            convertView.tag = viewHolder
            Pair(viewHolder, convertView)

        } else {
            Pair(convertView.tag, convertView)
        }

        val item: Card? = getItem(position)

        if (item != null) {
            (viewHolder as ViewHolder).iconImageView.setImageResource(item.imageId)
            (viewHolder as ViewHolder).titleTextView.text = item.title
            (viewHolder as ViewHolder).contextTextView.text = item.content

        }

        return convertView

    }


        class ViewHolder(view: View) {
            val iconImageView: ImageView = view.findViewById(R.id.icon)
            val titleTextView: TextView = view.findViewById(R.id.title_textView)
            val likeTextView: TextView = view.findViewById(R.id.like_textview)
            val contextTextView: TextView = view.findViewById(R.id.content)
            val likeButton: ImageView = view.findViewById(R.id.like_button)
        }

    }

