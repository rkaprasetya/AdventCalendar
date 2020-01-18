package com.raka.adventcalendar.presentation.view.main

import androidx.test.rule.ActivityTestRule
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.raka.adventcalendar.R
import org.junit.Rule
import org.junit.Test

class MainActivityTest{

    @get:Rule
    val activityRule = ActivityTestRule(MainActivity::class.java, false,false)

    /**
     * Test to check whether the app launches successfully
     */
    @Test
    fun appLaunchesSuccessfully(){
        ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.tv_date)).check(matches(isDisplayed()))
    }

}