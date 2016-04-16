package com.test.dmin.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by dmin on 2016/4/14.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
