package git.osc.roland.rreader.module.bookshelf;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import git.osc.roland.rreader.R;

/**
 * Created by Roland on 2017/7/6.
 */

public class BookShelfFragment extends Fragment {

    private String[] names = new String[] {
            "神奇异形在哪里？",
            "神奇异形在哪里？",
            "神奇异形在哪里？",
            "神奇异形在哪里？",
            "神奇异形在哪里？"
    };

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View contentView = inflater.inflate(R.layout.fragment_bookshelf, container, false);

        GridView bookshelf = (GridView) contentView.findViewById(R.id.bookshelf);
        bookshelf.setAdapter(booksAdapter);

        return contentView;
    }

    private BaseAdapter booksAdapter = new BaseAdapter() {

        @Override
        public int getCount() {
            return names.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder holder;
            if (convertView == null) {
                convertView = getLayoutInflater(null).inflate(R.layout.layout_bookshelf_item, null);
                holder = new ViewHolder();
                holder.cover = (ImageView) convertView.findViewById(R.id.cover);
                holder.name = (TextView) convertView.findViewById(R.id.name);
                convertView.setTag(holder);
            } else {
                holder = (ViewHolder) convertView.getTag();
            }

            holder.name.setText(names[position]);

            return convertView;
        }

        class ViewHolder {
            ImageView cover;
            TextView name;
        }
    };
}
