package tech.hamid.day15_palindromcheck

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        var btn : Button
        var editText : EditText

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.ButtonCheck);
        editText = findViewById(R.id.editText)

        btn.setOnClickListener {
            val text = editText.text.toString()
            if (ispalindrome(text)) {
                Toast.makeText(this, "Entered word is palindrome ", Toast.LENGTH_SHORT).show()

            } else {

                Toast.makeText(this, "Entered word is not a Palindrome", Toast.LENGTH_SHORT).show()

            }
        }
    }

    private fun ispalindrome(text: String): Boolean {
        val reverseString = text.reversed().toString()
        return text.equals(reverseString, ignoreCase = true)
    }

}