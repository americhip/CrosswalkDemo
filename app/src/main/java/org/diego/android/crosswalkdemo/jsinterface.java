package org.diego.android.crosswalkdemo;

import org.xwalk.core.JavascriptInterface;

public class jsinterface {
    public jsinterface() {

    }

    @JavascriptInterface
    public String sayHello() {
        return "Hello World!";
    }
    @JavascriptInterface
    public String echo(String str){
        return str;
    }
}
