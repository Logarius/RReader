package git.osc.roland.rreader.main

import android.content.Intent
import android.os.Handler
import git.osc.roland.rreader.R
import git.osc.roland.rreader.common.base.BaseActivity
import kotlinx.android.synthetic.main.layout_common_header.*

class WelcomeActivity : BaseActivity() {

    override var contentLayoutId: Int = R.layout.activity_welcome

    override fun initComp() {
        tvTitle.text = TAG
    }

    override fun initListener() {

    }

    override fun initData() {
        welcomeHandler.sendEmptyMessageDelayed(0, 1000)
    }

    private val welcomeHandler = Handler(Handler.Callback {
        val intent = Intent(this@WelcomeActivity, MainActivity::class.java)
        startActivity(intent)
        finish()
        true
    })
}
