package com.riet.myapplication

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val intent=intent(this,"second activity::class java")
        (intent)
        <actvity="second activity"

        exparted="true"
        parent activityname="main activity"
        finish()
        </activity>

        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.riet.myapplication", appContext.packageName)

    }
}