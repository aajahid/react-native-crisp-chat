package com.reactlibrary;

import android.content.Context;
import android.widget.LinearLayout;

public class CrispChatLinearLayout extends LinearLayout {

    public CrispChatLinearLayout(Context context) {
        super(context);
        inflate(context, R.layout.crisp_view, this);
    }
}
