package org.kdonev.currencyconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import org.kdonev.currencyconverter.databinding.ActivityMainBinding
import org.kdonev.currencyconverter.model.FixerRates
import org.kdonev.currencyconverter.viewModel.CurrenciesVM

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val rates = FixerRates(this)
        binding.currencies = CurrenciesVM(this, this, rates)
    }
}