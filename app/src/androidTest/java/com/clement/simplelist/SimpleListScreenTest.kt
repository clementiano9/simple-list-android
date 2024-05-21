package com.clement.simplelist

import androidx.activity.ComponentActivity
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.clement.simplelist.data.planets
import com.clement.simplelist.screen.SimpleListContent

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class SimpleListScreenTest {
    @get:Rule
    val composeTestRule = createAndroidComposeRule<ComponentActivity>()

    private lateinit var simpleList: String

    @Before
    fun setUp() {
        composeTestRule.activity.apply {
            simpleList = getString(R.string.simple_list)
        }
    }

    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.clement.simplelist", appContext.packageName)
    }

    @Test
    fun test_displays_list() {
        composeTestRule.setContent {
            SimpleListContent(data = planets)
        }
        composeTestRule.onNodeWithText(planets.first()).assertExists()
        composeTestRule.onNodeWithText(planets.last()).assertExists()
    }

    @Test
    fun test_displays_header() {
        composeTestRule.setContent {
            SimpleListContent(data = planets)
        }
        composeTestRule.onNodeWithText(simpleList).assertExists()
    }
}