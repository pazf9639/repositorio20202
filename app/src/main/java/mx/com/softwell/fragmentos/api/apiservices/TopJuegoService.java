package mx.com.softwell.fragmentos.api.apiservices;

import com.google.gson.JsonObject;
import  retrofit2.Call;
import retrofit2.http.GET;
import okhttp3.Callback;
import okhttp3.Response;
import kotlin.reflect.KCallable;

import retrofit2.http.GET;
import retrofit2.http.Path;

public interface TopJuegoService {
    @GET("top")
    Call<JsonObject> getAll();

    @GET("top/{id}")
    Call<JsonObject> getByID(@Path("id") int id);
}
