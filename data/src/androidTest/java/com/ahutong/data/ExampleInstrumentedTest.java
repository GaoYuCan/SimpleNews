package com.ahutong.data;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.ahutong.data.test", appContext.getPackageName());
    }

    @Test
    public void testNewsDataSource() {
        final Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        try {
            final InputStream jsonInputStream = NewsDataSource.getNewsJson(appContext);
            final BufferedReader br = new BufferedReader(new InputStreamReader(jsonInputStream));
            String temp = null;
            while ((temp = br.readLine()) != null) {
                System.out.println(temp);
            }
            jsonInputStream.close();
            br.close();
            assertTrue(true);
        } catch (IOException e) {
            e.printStackTrace();
            fail(e.getMessage());
        }
    }
}