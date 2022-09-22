package jp.youmalink.githubapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.EntryPoint
import dagger.hilt.android.AndroidEntryPoint
import jp.youmalink.githubapp.ui.main.MainFragment

@AndroidEntryPoint
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