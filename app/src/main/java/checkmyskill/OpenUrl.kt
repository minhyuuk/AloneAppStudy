package checkmyskill

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_openurl.*

class OpenUrl : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_openurl)


        // 버튼을 누르면 실행되는 코드
        Open.setOnClickListener{
            val address = EditText.text.toString() // 문자를 string 형으로 받아온다
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(address)) // intent에 address의 값을 받아온다
            startActivity(intent) // activity를 실행한다
        }

        // EditText의 글자를 인식하는 메서드 오버라이딩
        EditText.addTextChangedListener(object : TextWatcher{

            // Log를 찍으며 의미를 파악할 수 있음
            override fun afterTextChanged(s: Editable?) {
                if(s.toString() == "abc") {
                    Log.d("edit", "text is abc!")
                }
                Log.d("edit", "afterTextChanged : $s")
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                Log.d("edit", "beforeTextChanged : $s")
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                Log.d("edit", "onTextChanged : $s")
            }
        })




    }


}