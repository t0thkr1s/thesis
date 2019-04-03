@LargeTest
@RunWith(AndroidJUnit4.class)
public class DeleteDataTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Rule
    public GrantPermissionRule mGrantPermissionRule =
        GrantPermissionRule.grant(
                "android.permission.READ_EXTERNAL_STORAGE",
                "android.permission.WRITE_EXTERNAL_STORAGE");

    @Before
    public void setSharedPref() {
        SharedPrefUtil.saveCredentials(
                getInstrumentation().getTargetContext(), 
                "test", "test");
        mActivityTestRule.launchActivity(new Intent());
    }

    @Test
    public void deleteDataTest() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        onView(allOf(withId(R.id.delete_data),
                childAtPosition(
                        childAtPosition(
                                withId(R.id.action_bar),
                                1),
                        0),
                isDisplayed())).perform(click());

        onView(allOf(withId(android.R.id.button1),
                childAtPosition(
                        childAtPosition(
                                withId(R.id.buttonPanel),
                                0),
                        3))).perform(scrollTo(), click());
    }
}