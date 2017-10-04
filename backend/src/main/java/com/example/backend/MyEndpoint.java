/*
   For step-by-step instructions on connecting your Android application to this backend module,
   see "App Engine Java Endpoints Module" template documentation at
   https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/HelloEndpoints
*/

package com.example.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import javax.inject.Named;
import com.example.JokeSource;

/**
 * An endpoint class we are exposing
 */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.example.com",
                ownerName = "backend.example.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    /**
     * A simple endpoint method that retrives a Joke from our JokeSource java library
     */
    JokeSource jokeSource = new JokeSource();
    @ApiMethod(name = "sayHi")
    public MyBean sayHi(){
        MyBean response = new MyBean();
        String joke = jokeSource.getJoke();
        response.setData(joke);
        return response;
    }

}
