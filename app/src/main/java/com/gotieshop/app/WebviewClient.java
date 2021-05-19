package com.gotieshop.app;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebviewClient extends WebViewClient {

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        if(Uri.parse(String.valueOf(request)).getHost().endsWith("gotieshop.com"))
        {
            return false;
        }
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(String.valueOf(request)));
        view.getContext().startActivity(intent);
        return true;
    }
}
