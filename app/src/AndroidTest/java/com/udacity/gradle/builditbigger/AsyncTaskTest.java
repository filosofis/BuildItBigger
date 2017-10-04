package com.udacity.gradle.builditbigger;
import android.support.test.InstrumentationRegistry;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import java.util.concurrent.TimeUnit;

/**
 * Created by Oscar on 2017-09-10.
 */


@RunWith(JUnit4.class)
public class AsyncTaskTest{

    @Test
    public void jokeTest() throws Exception{
        EndpointsAsyncTask task = new EndpointsAsyncTask(InstrumentationRegistry.getTargetContext());
        task.execute();
        String joke = task.get(3, TimeUnit.SECONDS);
        Assert.assertTrue(joke.length() > 10);
        String nextJoke = task.get(3, TimeUnit.SECONDS);
        Assert.assertTrue(nextJoke.equals(joke));
    }
}