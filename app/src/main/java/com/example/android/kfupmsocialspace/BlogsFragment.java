package com.example.android.kfupmsocialspace;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BlogsFragment extends Fragment implements View.OnClickListener {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.blogs_fragment, container, false);
        FloatingActionButton fab = view.findViewById(R.id.floating_btn_add_new_blog);
        fab.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(getContext(), AddNewBlogActivity.class);
        startActivity(intent);
    }

    /*
    public void onViewCreated(View view, Bundle savedInstanceState) {
        RelativeLayout ongoing = view.findViewById(R.id.enter_chat);
        ongoing.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ChatActivity.class);
                startActivity(intent);
            }
        });
    }
    */
}
