package org.sopt.kotlin.controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import org.sopt.kotlin.R
import org.sopt.kotlin.adapter.DataAdapter
import org.sopt.kotlin.model.Data
import java.util.*

class MainActivity : AppCompatActivity() {

    var adapter = DataAdapter()
    var listView : ListView? = null

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter.source = sample()

        listView = findViewById(R.id.listView) as ListView
        listView?.adapter = adapter
    }

    fun sample() : ArrayList<Data> {

        var list = ArrayList<Data>()

        list.add(Data("Lorem ipsum dolor sit amet, consectetur adipiscing elit.", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut gravida leo nec turpis condimentum vulputate."))
        list.add(Data("Suspendisse eget quam ut elit rutrum finibus in in turpis.", "Nunc sollicitudin a ex eu efficitur."))
        list.add(Data("Phasellus pharetra velit nec massa elementum, a lacinia dui hendrerit.", "Phasellus auctor purus id condimentum iaculis."))
        list.add(Data("Fusce sit amet felis pulvinar, vehicula enim mollis, sollicitudin enim.", "Vestibulum efficitur massa at tellus pharetra dictum."))
        list.add(Data("Mauris tincidunt ipsum eu lacus ullamcorper vulputate.", "Phasellus iaculis, tortor viverra blandit dapibus, mi velit dictum massa, sit amet aliquam lectus eros a purus."))
        list.add(Data("Ut eu eros vulputate, commodo sem eget, tristique augue.", "Etiam pretium nunc et lectus mattis hendrerit."))

        return list;
    }
}
