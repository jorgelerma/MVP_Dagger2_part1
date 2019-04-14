package com.infos.root.mydaggertwov1.presentation.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.infos.root.mydaggertwov1.R
import com.infos.root.mydaggertwov1.presentation.presenter.MyContract
import com.infos.root.mydaggertwov1.presentation.presenter.ThePresenter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MyContract.view {

    lateinit var presenters: ThePresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenters = ThePresenter(this)

        button1.setOnClickListener(View.OnClickListener {
            val input = first_edittext.text.toString().trim().toInt()
            presenters.calculate(input)
        })
    }

    override fun displayResult(result: Int){

        first_textview.text = result.toString()
    }

}
