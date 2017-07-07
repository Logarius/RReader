package git.osc.roland.rreader.module.bookshelf;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import git.osc.roland.rreader.R;

/**
 * Created by Roland on 2017/7/6.
 */

public class BookShelfFragment extends Fragment {

    private View contentView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        contentView = inflater.inflate(R.layout.fragment_bookshelf, container, false);

        return contentView;
    }
}
