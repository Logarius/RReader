package git.osc.roland.rreader.main;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

import git.osc.roland.rreader.module.bookshelf.BookShelfFragment;
import git.osc.roland.rreader.module.settings.SettingsFragment;

/**
 * Created by Roland on 2017/7/6.
 */

public class ContentPagerAdapter extends FragmentPagerAdapter {

    private List<Fragment> fragments = new ArrayList<>();

    public ContentPagerAdapter(FragmentManager fm) {
        super(fm);
        fragments.add(new BookShelfFragment());
        fragments.add(new SettingsFragment());
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments == null ? 0 : fragments.size();
    }
}
