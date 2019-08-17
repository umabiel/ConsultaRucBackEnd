package store.marathon.backend.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import store.marathon.backend.model.Ruc;
import store.marathon.backend.proxy.RestClientProxy;

import java.io.IOException;

@RestController()
@CrossOrigin(value = "*")
public class RucController {

    @RequestMapping(
            method = RequestMethod.GET,
            value = "/consulta-ruc/{ruc}",
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    Ruc getRucFromProxy(@PathVariable("ruc") String ruc) throws IOException {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://wsruc.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        RestClientProxy clientProxy = retrofit.create(RestClientProxy.class);
        Call<Ruc> rucClientProxy = clientProxy.getRucInfo(ruc);
        Response<Ruc> response = rucClientProxy.execute();

        return response.body();
    }
}
