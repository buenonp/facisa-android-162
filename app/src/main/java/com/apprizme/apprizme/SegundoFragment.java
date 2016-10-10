package com.apprizme.apprizme;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by volne on 04/10/2016.
 */
public class SegundoFragment extends Fragment {

    View tela;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        tela = inflater.inflate(R.layout.segundo_layout, container, false);
        return tela;
    }
}
