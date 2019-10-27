package com.reactlibrary;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;


public class CrispChatWindow extends SimpleViewManager<CrispChatLinearLayout> {

    public static final String REACT_CLASS = "RCTCrispChatWindow";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    public CrispChatLinearLayout createViewInstance(ThemedReactContext reactContext) {
        return new CrispChatLinearLayout(reactContext);
    }
}