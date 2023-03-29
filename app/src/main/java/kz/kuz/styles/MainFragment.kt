package kz.kuz.styles

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class MainFragment : Fragment() {
    // добавлены два класса TitleActivity и TitleActivity2 с примерами дизайна кнопок
    // TitleActivity - с использованием материального дизайна
    // TitleActivity2 - с использованием обычного дизайна
    // в файл themes.xml были добавлены два стиля:
    // на основе MaterialComponents - с использованием материального дизайна
    // на основе AppCompat - с обычным дизайном
    // для проверки загружаемый класс нужно определить в манифесте
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        activity?.setTitle(R.string.toolbar_title)
        return inflater.inflate(R.layout.fragment_main, container, false)
    }
}