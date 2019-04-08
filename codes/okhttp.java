OkHttpClient okHttpClient = new OkHttpClient();

RequestBody formBody = new MultipartBody.Builder()
        .setType(MultipartBody.FORM)
        .addFormDataPart("apk", file.getName(), RequestBody.create(MediaType.parse(Constants.APK_MEDIA_TYPE), file))
        .build();

 HttpUrl httpUrl = new HttpUrl.Builder()
        .scheme(Constants.PROTOCOL) // protocol scheme
        .host(Constants.HOST) // host name or IP
        .port(Constants.PORT) // port number
        .addPathSegment("upload") // path segment
        .build();

final Request request = new Request.Builder()
        .url(httpUrl)
        .header("Authorization", "Basic " + // authorization header
            SharedPrefUtil.getCredentials(getApplicationContext()))
        .post(formBody)
        .build();

okHttpClient.newCall(request).enqueue(new Callback() {
    @Override
    public void onFailure(final Call c, final IOException e) {
        // ... snip ...
    }

    @Override
    public void onResponse(Call c, final Response response) {
        // ... snip ...
    }
});