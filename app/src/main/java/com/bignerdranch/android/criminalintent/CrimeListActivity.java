package com.bignerdranch.android.criminalintent;

import androidx.fragment.app.Fragment;

public class CrimeListActivity extends SingleFragmentActivity{
    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_masterdetail;
    }
}
