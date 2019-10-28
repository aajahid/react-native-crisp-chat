package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;

import android.content.Context;

import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.FrameLayout;


import im.crisp.sdk.Crisp;

public class CrispChatModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public CrispChatModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "CrispChat";
    }

    @ReactMethod
    public void initialize(String websiteId) {
        Crisp.initialize(this.reactContext);
        Crisp.getInstance().setWebsiteId(websiteId);
    }
}
