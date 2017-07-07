package git.osc.roland.rreader.main

import android.support.v4.view.ViewPager.OnPageChangeListener
import git.osc.roland.rreader.R
import git.osc.roland.rreader.common.base.BaseActivity
import git.osc.roland.rreader.common.view.BottomTabBar
import git.osc.roland.rreader.common.view.BottomTabBarItem
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layout_common_header.*

class MainActivity : BaseActivity(), OnPageChangeListener, BottomTabBar.OnTabItemCheckChangedListener {

    override var contentLayoutId: Int = R.layout.activity_main

    override fun initComp() {
        tvTitle.text = TAG

        val item1 = BottomTabBarItem(this)
        val item2 = BottomTabBarItem(this)

        item1.setIcon(R.drawable.bookshelf_blue, R.drawable.bookshelf)
        item2.setIcon(R.drawable.setting_blue, R.drawable.setting)

        item1.setTitle(R.string.str_bookshelf)
        item2.setTitle(R.string.str_settings)

        bottomTabBar.addItem(item1)
        bottomTabBar.addItem(item2)

        contentPager.adapter = ContentPagerAdapter(supportFragmentManager)
    }

    override fun initListener() {
        contentPager.addOnPageChangeListener(this)
        bottomTabBar.setTabItemCheckChangedListener(this)
    }

    override fun initData() {
        bottomTabBar.checkItem(0)
    }

    override fun onPageScrollStateChanged(state: Int) {

    }

    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {

    }

    override fun onPageSelected(position: Int) {
        bottomTabBar.checkItem(position)
    }

    override fun onChange(index: Int) {
        contentPager.currentItem = index
    }
}
