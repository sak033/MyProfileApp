package com.example.myprofileapp

import android.os.Bundle
import android.text.Html
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val creditScoreTextView = findViewById<TextView>(R.id.credit_score_text)
        val text = "<font color='#FFFFFF'>credit score </font>" +
                "<font color='#00FFAA'>• REFRESH AVAILABLE \t\t\t\t\t\t\t\t</font>" +   "<font color='#FFFFFF'> 757 →</font>"

        creditScoreTextView.text = if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            Html.fromHtml(text, Html.FROM_HTML_MODE_LEGACY)
        } else {
            Html.fromHtml(text)
        }

    }
}
