package com.hellcorp.toolbartest

import android.os.Bundle
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setActionBar(toolbar) // Используй setActionBar для android.widget.Toolbar

        val upArrow = resources.getDrawable(R.drawable.baseline_arrow_back_ios_24, null)
        actionBar?.setHomeAsUpIndicator(upArrow)

        actionBar?.setDisplayHomeAsUpEnabled(true) // Показывает кнопку назад
        actionBar?.setHomeButtonEnabled(true) // Включает кнопку назад
        actionBar?.title = "Заголовок" // Устанавливает заголовок
        actionBar?.subtitle = "Tatata"

        toolbar.inflateMenu(R.menu.menu_main)
        toolbar.setOnMenuItemClickListener { item ->
            when (item.itemId) {
                R.id.title_visibility -> {
                    //Обработка нажатия на пункт меню
                    true
                }
                else -> false
            }
        }

        toolbar.setNavigationOnClickListener {
            onBackPressed() // Обрабатывает нажатие кнопки назад
        }
    }
}