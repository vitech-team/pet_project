package ua.com.vitech.internal.sample.devflow.it;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RestApi {

  @GET("public")
  Call<String> publicUrl();

}
