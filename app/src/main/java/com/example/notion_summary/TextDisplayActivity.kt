package com.example.notion_summary
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.notion_summary.R

class TextDisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_display)

        val recognizedText = intent.getStringExtra("recognized_text") ?: ""
        findViewById<TextView>(R.id.text_view).text = recognizedText
    }
}
