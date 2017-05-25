package git.osc.roland.rreader.module.reader

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.RelativeLayout
import git.osc.roland.rreader.R
import kotlinx.android.synthetic.main.layout_reader_screen_menu.view.*

/**
 * Created by eka on 2017/5/25.
 */
class ReaderScreenMenu(mContext: Context, attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int): RelativeLayout(mContext, attrs, defStyleAttr, defStyleRes) {

    var topMenuVisibility: Int = View.INVISIBLE
        set(value) {
            menuTop.visibility = value
        }

    var bottomMenuVisibility: Int = View.INVISIBLE
        set(value) {
            menuBottom.visibility = value
        }

    var leftMenuVisibility: Int = View.INVISIBLE
        set(value) {
            menuLeft.visibility = value
        }

    var rightMenuVisibility: Int = View.INVISIBLE
        set(value) {
            menuRight.visibility = value
        }

    init {
        LayoutInflater.from(mContext).inflate(R.layout.layout_reader_screen_menu, this)
        topMenuVisibility = View.INVISIBLE
        bottomMenuVisibility = View.INVISIBLE
        leftMenuVisibility = View.INVISIBLE
        rightMenuVisibility = View.INVISIBLE
    }

    constructor(mContext: Context, attrs: AttributeSet, defStyleAttr: Int): this(mContext, attrs, defStyleAttr, 0)
    constructor(mContext: Context, attrs: AttributeSet): this(mContext, attrs, 0, 0)
    constructor(mContext: Context): this(mContext, null, 0, 0)
}