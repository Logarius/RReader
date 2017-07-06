package git.osc.roland.rreader.common.view;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import git.osc.roland.rreader.R;

/**
 * Created by Roland on 2017/7/6.
 */

public class BottomTabBarItem extends RelativeLayout {

    private static final String TAG = BottomTabBarItem.class.getSimpleName();

    private Context mContext;

    private ImageView icon;

    private TextView title;

    private boolean checked = false;

    private int iconChecked = 0, iconUnchecked = 0;

    private int titleChecked, titleUnchecked;

    public BottomTabBarItem(Context context) {
        super(context, null, 0);
        this.mContext = context;
        LayoutInflater.from(context).inflate(R.layout.layout_bottom_tab_bar_item, this);

        icon = (ImageView) findViewById(R.id.icon);
        title = (TextView) findViewById(R.id.title);

        titleChecked = titleUnchecked = Color.BLACK;
        setChecked(checked);
    }

    public void setTitle(int id) {
        title.setText(id);
    }

    public void setIcon(int iconChecked, int iconUnchecked) {
        this.iconChecked = iconChecked;
        this.iconUnchecked = iconUnchecked;
        setChecked(checked);
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;

        if (iconChecked > 0 && iconUnchecked > 0) {
            icon.setImageResource(checked ? iconChecked : iconUnchecked);
        }
        title.setTextColor(checked ? titleChecked : titleUnchecked);
    }
}
