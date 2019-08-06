package com.andresjakl.inasamplerecyclerview

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.sample_list_item.view.*

/**
 *リサイクラービューアダプター
 */
class SampleRecyclerViewAdapter(val sampleItemList: List<SampleData>, val clickListener: (SampleData) -> Unit) :
        RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    /**
     *ViewHolderを作る
     *
     * return SampleViewHolder(view)
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.sample_list_item, parent, false)
        return SampleViewHolder(view)
    }

    /**
     * ViewHolderを通してデータをViewに設定する　バインド
     */
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        (holder as SampleViewHolder).bind(sampleItemList[position], clickListener)
    }

    /**
     * データの要素数を返す
     */
    override fun getItemCount() = sampleItemList.size


    /**
     *ViewHolderを作る　ViewHolderは、モデルから、それらの対応したViewに値を割り当てる
     * onCreateViewHolder(ViewGroup, int)
     */
    class SampleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: SampleData, clickListener: (SampleData) -> Unit) {
            itemView.SampleList_id.text = item.id
            itemView.setOnClickListener { clickListener(item) }
        }
    }
}