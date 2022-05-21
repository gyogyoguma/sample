package com.example.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.weatherapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
//    ActivityMainBindingをbindingで利用できるようにする
//    lateinit で宣言することにより、初期化タイミングを onCreate() 呼び出しまで遅延させている
//    疑問点① onCreateの初めに宣言しても良いのでは？
    private lateinit var binding: ActivityMainBinding

    //savedInstanceState: Bundleは異常終了時もデータを保持するために利用
    //異常終了時のif()判定の材料として使える　
    override fun onCreate(savedInstanceState: Bundle?) {
        //super:親クラスのコンストラクタを読みだしている
        super.onCreate(savedInstanceState)

        //ActivityMainBindingのLayoutをbindingに保持する
        binding = ActivityMainBinding.inflate(layoutInflater)

        //binding.rootで今回の場合は、activity_main.xmlのLinerLayoutを呼び出し画面に表示させる
        setContentView(binding.root)
    }
}