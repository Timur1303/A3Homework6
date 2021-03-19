package kg.app.a3homework6;

import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.Test;

import kg.app.a3homework6.ui.MainActivity;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class ActivityMainTest {

    @Rule
    public ActivityScenarioRule rule = new ActivityScenarioRule<>(MainActivity.class);


    @Test
    public void addClickTest() {
        onView(withId(R.id.et_operator_one)).perform(typeText("32"));
        onView(withId(R.id.et_operator_two)).perform(typeText("12"));
        onView(withId(R.id.btn_add)).perform(click());

        onView(withId(R.id.tv_result)).check(matches(withText("44")));
    }
}
