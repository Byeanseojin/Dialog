package kr.ac.kopo.dialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnDialog = findViewById<Button>(R.id.btnDialog)

        btnDialog.setOnClickListener{
            var placesArr = arrayOf("집","내 집", "내 방")
            var dialog = AlertDialog.Builder(this@MainActivity)
            dialog.setTitle("좋아하는 장소")
            dialog.setIcon(R.drawable.icon1)
            dialog.setItems(placesArr){ d1, which ->
                btnDialog.text = placesArr[which]
            }
            dialog.setPositiveButton("닫기",null)
            dialog.show()
        }
    }
}