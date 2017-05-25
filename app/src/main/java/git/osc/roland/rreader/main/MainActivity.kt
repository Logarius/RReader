package git.osc.roland.rreader.main

import android.content.Intent
import android.view.View
import git.osc.roland.rreader.R
import git.osc.roland.rreader.common.base.BaseActivity
import git.osc.roland.rreader.module.reader.ReaderActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layout_common_header.*

class MainActivity : BaseActivity(), View.OnClickListener {

    override val contentLayoutId: Int = R.layout.activity_main

    override fun initComp() {
        tvTitle.text = TAG
    }

    override fun initListener() {
        btnReader.setOnClickListener(this)
    }

    override fun initData() {

    }

    override fun onClick(v: View?) {
        val intent: Intent? = when (v?.id) {
            R.id.btnReader -> Intent(this@MainActivity, ReaderActivity::class.java)

            else -> null
        }

        if (intent != null) {
            startActivity(intent)
        }
    }
}
