package eu.heiconnect.android.webservice;

import com.android.volley.VolleyError;

public class HeiConnectError extends VolleyError {

    private Error resultError;

    public HeiConnectError(Error resultError) {
        this.resultError = resultError;
    }
}