package com.hy.news.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.hy.news.base.BasePage;

/**
 * Created by xy on 2016/1/26.
 */
public class InServicePage extends BasePage {
    public InServicePage(Context ctx) {
        super(ctx);
    }

    @Override
    public View initView(LayoutInflater inflater) {
        TextView textView=new TextView(mContext);
        textView.setText("我是第三页");
        return textView;
    }

    @Override
    public void initData() {

    }
}
