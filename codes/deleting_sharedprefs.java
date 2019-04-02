 public static void deleteCredentials(@NonNull Context context) {
    SharedPreferences.Editor editor = context.getSharedPreferences(
        context.getPackageName(), Context.MODE_PRIVATE).edit();
    editor.clear();
    editor.apply();
}