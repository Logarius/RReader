package git.osc.roland.rreader.common.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roland on 2017/7/6.
 */

public class BottomTabBar extends LinearLayout {

    private static final String TAG = BottomTabBar.class.getSimpleName();

    private Context mContext;

    private List<BottomTabBarItem> items = new ArrayList<>();

    private LinearLayout.LayoutParams layoutParams = new LayoutParams(0, LinearLayout.LayoutParams.WRAP_CONTENT, 1);

    private int checkedIndex = -1;

    private OnTabItemCheckChangedListener tabItemCheckChangedListener;

    public interface OnTabItemCheckChangedListener {
        void onChange(int index);
    }

    public BottomTabBar(Context context) {
        this(context, null, 0);
    }

    public BottomTabBar(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public BottomTabBar(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
        removeAllViews();
    }

    public void addItem(BottomTabBarItem item) {
        if (item != null) {
            items.add(item);
            item.setClickable(true);
            item.setOnClickListener(onClickListener);
            addView(item, layoutParams);
        }
    }

    public void setTabItemCheckChangedListener(OnTabItemCheckChangedListener tabItemCheckChangedListener) {
        this.tabItemCheckChangedListener = tabItemCheckChangedListener;
    }

    public void checkItem(int index) {
        if (index >= 0 && items.size() > index && checkedIndex != index) {
            BottomTabBarItem item = items.get(index);
            item.setChecked(true);
            if (checkedIndex >= 0) {
                items.get(checkedIndex).setChecked(false);
            }
            checkedIndex = index;
            if (tabItemCheckChangedListener != null) {
                tabItemCheckChangedListener.onChange(checkedIndex);
            }
        }
    }

    private OnClickListener onClickListener = new OnClickListener() {
        @Override
        public void onClick(View v) {
            BottomTabBarItem item = (BottomTabBarItem) v;
            checkItem(items.indexOf(item));
        }
    };
}