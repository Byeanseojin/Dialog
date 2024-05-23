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
            // 라이도 버튼 목록 대화상자
            var placesArr = arrayOf("집","내 집", "내 방")
            var selectArr = booleanArrayOf(false, true, false)
            var dialog = AlertDialog.Builder(this@MainActivity)
            dialog.setTitle("좋아하는 장소")
            dialog.setIcon(R.drawable.icon1)
            dialog.setSingleChoiceItems(placesArr, 1){ d1, which ->
                btnDialog.text = placesArr[which]
            }
            dialog.setPositiveButton("닫기",null)
            dialog.show()
        }
    }
}