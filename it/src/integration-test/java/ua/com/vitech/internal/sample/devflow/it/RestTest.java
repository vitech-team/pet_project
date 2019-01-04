package ua.com.vitech.internal.sample.devflow.it;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

import java.io.IOException;

public class RestTest {

    private static final transient Logger LOGGER = LoggerFactory.getLogger(RestTest.class);

    private String baseUrl;

    private RestApi restApi;

    @Before
    public void setUp() {
        baseUrl = System.getenv("IT_BASE_URL");
        LOGGER.info("IT Base URL = {}", baseUrl);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(ScalarsConverterFactory.create())
                .build();
        restApi = retrofit.create(RestApi.class);
    }

    @Test
    public void test() throws IOException {
        String result = restApi.publicUrl().execute().body();
        Assert.assertEquals("REST response", "public page", result);
    }

}
