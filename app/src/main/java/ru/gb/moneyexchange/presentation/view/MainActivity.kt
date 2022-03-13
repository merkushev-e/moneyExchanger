package ru.gb.moneyexchange.presentation.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.gb.moneyexchange.R
import ru.gb.moneyexchange.presentation.view.main.MainFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }
}