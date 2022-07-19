package com.sportisimo.sportisimo;

import android.util.Log;
import android.webkit.JavascriptInterface;

public class JSInterface {

    private ScanHandler mHandler;
    JSInterface(ScanHandler handler){
      mHandler = handler;
    }
    @JavascriptInterface
    public void returnResult(String result) {
        Log.d("DBR","js: "+result);
        mHandler.onScanned(result);
    }
}
