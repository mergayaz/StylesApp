package kz.kuz.styles

import android.graphics.Point
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class TitleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_title)

        // получаем размер экрана
        val display = windowManager.defaultDisplay
        val size = Point()
        display.getSize(size)

        // устанавливаем высоту ConstraintLayout равной максимальному размеру экрана минус
        // высота Statusbar, для того, чтобы при горизонтальном положении экрана кнопки не
        // заходили друг на друга и не выходили за край экрана
        val titleLayoutView = findViewById<View>(R.id.title_layout)
        titleLayoutView.layoutParams.height = Math.max(size.x, size.y) -
                (24 * resources.displayMetrics.density).toInt()
    }
}