package com.example.recyclerview14_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import java.sql.Driver

class MainActivity : AppCompatActivity() {
    private val adapterObj : ListAdapter = ListAdapter(this)
    val models : MutableList<User> = mutableListOf()
    var count: Int = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recycler_View.adapter = adapterObj
        recycler_View.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        recycler_View.addItemDecoration(DividerItemDecoration(this,DividerItemDecoration.VERTICAL))
        setData(count)
    }
    private fun setData(n: Int){
        repeat(n){
            var model: User = User("Title $count","Description $count",count)
            models.add(model)
            count++
        }
        adapterObj.setDataListAdapter(models)
    }

    fun onItemClicked(n:Int) {
        setData(n)
    }
}