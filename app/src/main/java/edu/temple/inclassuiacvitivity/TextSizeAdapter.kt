package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class TextSizeAdapter(_context: Context, _numbers: Array<Int>) : BaseAdapter() {

    private val context = _context
    private val numbers = _numbers

    override fun getCount(): Int {
        //TODO("Not yet implemented")
        return numbers.size
    }

    override fun getItem(position: Int): Any {
        //TODO("Not yet implemented")
        return numbers[position]
    }

    override fun getItemId(position: Int): Long {
        //TODO("Not yet implemented")
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        //TODO("Not yet implemented")
        val textView = TextView(context)

        textView.text = numbers[position].toString()

        textView.textSize = numbers[position].toString().toFloat()

        textView.setPadding(5, 10, 0, 10)

        return textView
    }

}




