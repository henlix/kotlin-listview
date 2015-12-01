package org.sopt.kotlin.adapter

import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import org.sopt.kotlin.R
import org.sopt.kotlin.model.Data
import java.util.*

class DataAdapter : BaseAdapter() {

    class ViewHolder (var v : View?) {

        public var textViewTitle : TextView
        public var textViewDescription : TextView

        init {

            textViewTitle = v?.findViewById(R.id.textViewTitle) as TextView
            textViewDescription = v?.findViewById(R.id.textViewDescription) as TextView
        }
    }

    private var _source: ArrayList<Data>? = null
    public var source : ArrayList<Data>?
        get() { return _source }
        set(v) {

            this._source = v
            this.notifyDataSetChanged()
        }

    override fun getItem(position: Int): Any? {

        return when (position) {

            in 0..source!!.size - 1 -> { source!![position] }
            else -> { null }
        }
    }

    override fun getCount(): Int = source!!.size
    override fun getItemId(position: Int): Long { return (getItem(position) as Data).id }

    override fun getView(position: Int, view: View?, parent: ViewGroup?): View? {

        var item = getItem(position) as Data
        var v = view ?: View.inflate(parent?.context, R.layout.layout_item, null)
        var holder = (v.tag?: ViewHolder(v)) as ViewHolder

        holder.textViewTitle.text = item.title;
        holder.textViewDescription.text = item.description;

        return v
    }

}

