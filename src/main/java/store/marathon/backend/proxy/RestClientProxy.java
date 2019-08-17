package store.marathon.backend.proxy;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import store.marathon.backend.model.Ruc;

public interface RestClientProxy {
    @GET("Ruc2WS_JSON.php?tipo=2&token=cXdlcnR5bGFtYXJja19zYUBob3RtYWlsLmNvbXF3ZXJOeQ==")
    Call<Ruc> getRucInfo(@Query("ruc") String ruc);
}
