package git.osc.roland.rreader.common.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by eka on 2017/5/25.
 */
abstract class BaseActivity: AppCompatActivity() {

    val TAG: String = javaClass.simpleName

    open val contentLayoutId: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (contentLayoutId > 0) {
            setContentView(contentLayoutId)
            initComp()
            initListener()
            initData()
        } else {
            finish()
        }
    }

    abstract fun initComp()
    abstract fun initListener()
    abstract fun initData()

}