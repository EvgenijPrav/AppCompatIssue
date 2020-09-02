package by.praviloffevg.appcompatissue

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.app.BaseContextWrappingDelegate
import kotlinx.android.synthetic.main.activity_main.greetingTV

class MainActivity : AppCompatActivity() {

    private var baseContextWrappingDelegate: AppCompatDelegate? = null

    override fun getDelegate() = baseContextWrappingDelegate ?: BaseContextWrappingDelegate(super.getDelegate()).apply {
        baseContextWrappingDelegate = this
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        greetingTV.text = getString(R.string.greeting_text)

        supportFragmentManager.beginTransaction()
            .add(R.id.fragmentContainer, BlankFragment.newInstance())
            .commit()
    }
}
