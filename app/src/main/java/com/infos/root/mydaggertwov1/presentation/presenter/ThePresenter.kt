package com.infos.root.mydaggertwov1.presentation.presenter

import com.infos.root.mydaggertwov1.MultiplyProcess

class ThePresenter(val contexts: MyContract.view){

    lateinit var multiplyProcess: MultiplyProcess

    init {
        multiplyProcess = MultiplyProcess()
    }


    fun calculate(value: Int){

        val result = multiplyProcess.multiply(value)
        contexts.displayResult(result)
    }


}