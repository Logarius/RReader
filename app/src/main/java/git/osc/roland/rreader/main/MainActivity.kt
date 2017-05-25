package git.osc.roland.rreader.main

import git.osc.roland.rreader.R
import git.osc.roland.rreader.common.base.BaseActivity
import kotlinx.android.synthetic.main.layout_common_header.*

class MainActivity : BaseActivity() {

    override val contentLayoutId: Int = R.layout.activity_main

    override fun initComp() {
        tvTitle.text = TAG
    }

    override fun initListener() {

    }

    override fun initData() {

    }
}
