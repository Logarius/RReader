package git.osc.roland.rreader.module.reader

import android.view.View
import git.osc.roland.rreader.R
import git.osc.roland.rreader.common.base.BaseActivity
import kotlinx.android.synthetic.main.activity_reader.*

class ReaderActivity : BaseActivity() {

    override var contentLayoutId: Int = R.layout.activity_reader

    override fun initComp() {
        screenMenu.topMenuVisibility = View.VISIBLE
    }

    override fun initListener() {

    }

    override fun initData() {

    }


}
