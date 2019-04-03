codeView = view.findViewById(R.id.codeView);
codeView.setTheme(CodeViewTheme.RAILSCASTS).fillColor();
codeView.getSettings().setBuiltInZoomControls(true);
codeView.getSettings().setDisplayZoomControls(false);
codeView.getSettings().setTextZoom(50);
codeView.setWebViewClient(new WebViewClient() {
    @Override
    public void onPageStarted(WebView view, String url, Bitmap b) {
        super.onPageStarted(view, url, b);
        Log.d(Constants.TAG, "onPageStarted: loading page");
    }
    
    @Override
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);
        Log.d(Constants.TAG, "onPageFinished: page loaded");
        loading.setVisibility(View.GONE);
    }
});