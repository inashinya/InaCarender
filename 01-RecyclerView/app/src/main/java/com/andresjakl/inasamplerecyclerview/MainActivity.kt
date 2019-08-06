package com.andresjakl.inasamplerecyclerview

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import com.andresjakl.inasamplerecyclerview.Constants.Companion.KEY1_1
import kotlinx.android.synthetic.main.activity_main.*

/**
 * 画面1のアクティビティ
 * リサイクラービューを表示する
 * タップするとtextを画面2へ渡し遷移する
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /**
         * アクティビティにビューを配置
         */
        setContentView(R.layout.activity_main)
        /**
         *LayoutManagerの設定
         */
        Sample_RecyclerView.layoutManager = LinearLayoutManager(this)
        /**
         *Adapterの設定　AdapterをViewに割り当てる
         */
        var sampleData = createSampleData()
        Sample_RecyclerView.adapter = SampleRecyclerViewAdapter(sampleData, { sampleData: SampleData -> sampleDataClicked(sampleData) })
        /**
         *区切り線の表示
         */
        Sample_RecyclerView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
    }

    /**
     * クリックすると画面2へ遷移する

    private fun sampleDataClicked(sampleData: SampleData) {
        val showSecondActivityIntent = Intent(this, SecondActivity::class.java)
        /**
         * activity_secondへ遷移
         * SampleDataのidをKEY_1として渡す
         */
        showSecondActivityIntent.putExtra(KEY1_1, sampleData.id)
        startActivity(showSecondActivityIntent)
    }
    */


}
