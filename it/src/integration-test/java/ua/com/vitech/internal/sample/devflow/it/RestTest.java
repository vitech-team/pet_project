package ua.com.vitech.internal.sample.devflow.it;

import java.io.IOException;

import okhttp3.OkHttpClient;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;
import ua.com.vitech.internal.sample.devflow.it.tool.UnsafeOkHttpClient;


public class RestTest {

    private static final transient Logger LOGGER = LoggerFactory.getLogger(RestTest.class);

    private String baseUrl;

    private RestApi restApi;

    /**
     * sets fake base url.
     */
    @Before
    public void setUp() {
        OkHttpClient okHttpClient = UnsafeOkHttpClient.getUnsafeOkHttpClient();
        baseUrl = System.getenv("IT_BASE_URL");
        LOGGER.info("IT Base URL = {}", baseUrl);
        Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(ScalarsConverterFactory.create())
            .client(okHttpClient)
            .build();
        restApi = retrofit.create(RestApi.class);
    }

    @Test
    public void test() throws IOException {
        String result = restApi.publicUrl().execute().body();
        Assert.assertEquals("REST response", "public page", result);
    }

}
