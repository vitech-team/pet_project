package ua.com.vitech.internal.sample.devflow.it;

import java.io.IOException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class RestTest {

  private String baseUrl;

  private RestApi restApi;

  @Before
  public void setUp() {
    baseUrl = System.getenv("IT_BASE_URL");
    baseUrl = "http://localhost:8080";
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
