public static void saveCredentials(@NonNull Context context, String username, String password) {
    SharedPreferences.Editor editor = context.getSharedPreferences(context.getPackageName(), Context.MODE_PRIVATE).edit();
    editor.putString(Constants.USERNAME_KEY, username);
    editor.putString(Constants.PASSWORD_KEY, password);
    editor.apply();
}