package com.example.myapplication.Practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.R
import io.realm.Realm
import io.realm.RealmConfiguration
import kotlinx.android.synthetic.main.activity_realm.*

class RealmActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_realm)


        Realm.init(this@RealmActivity)

        // realm을 초기화 할때 이런 방식으로 초기화해줘! 라는 식으로 얘기해야함
        val config: RealmConfiguration = RealmConfiguration.Builder()
            .deleteRealmIfMigrationNeeded()
            .build()
        Realm.setDefaultConfiguration(config)

        // .???()
        // .?AS?() 이런 형식으로 이어가는걸
        // "메소드 체이닝"이라고 한다.
        // 주로 빌더 패턴에 많이 사용된다

        // ream 얻기
        val realm = Realm.getDefaultInstance()

        button_save.setOnClickListener{
            realm.executeTransaction {
                with(it.createObject(School::class.java)) {
                    this.name = "서울대학교"
                    this.location = "서울" // 데이터 생성
                }
            }
        }
        button_load.setOnClickListener{
//            it.where(School::class.java).findFirst() // 첫 번째 데이터 찾기
            
        }
        button_delete.setOnClickListener{

        }


    }
}

