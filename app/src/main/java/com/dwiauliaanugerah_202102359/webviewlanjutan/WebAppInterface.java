package com.dwiauliaanugerah_202102359.webviewlanjutan;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.webkit.JavascriptInterface;

public class WebAppInterface
{
    private Activity _activity;
    private Context _context;

    public WebAppInterface(Context context, Activity activity)
    {
        _context = context;
        _activity = activity;
    }

    @JavascriptInterface
    public void showSms()
    {
        Intent intent =new Intent(Intent.ACTION_MAIN);
        intent.addCategory((Intent.CATEGORY_APP_MESSAGING));
        _context.startActivity(intent);
    }
}
