package remindme.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import remindme.fragment.ExampleFragment;

/**
 * Created by Pro-rock on 21.03.2016.
 */
public class TabsPagerFragmentAdapter extends FragmentPagerAdapter {

    private String[] tabs;

    public TabsPagerFragmentAdapter(FragmentManager fm) {
        super(fm);
        tabs = new String[] {
                "Tab 1",
                "Напоминания",
                "Tab 2"
        };
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                break;
            case 1:
                return ExampleFragment.getInstance();

            case 2:
                break;
        }
        return ExampleFragment.getInstance();
    }

    @Override
    public int getCount() {
        return tabs.length;
    }
}
