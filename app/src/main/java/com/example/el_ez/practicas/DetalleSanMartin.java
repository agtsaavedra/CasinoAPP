package com.example.el_ez.practicas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class DetalleSanMartin extends AppCompatActivity {

    String nomcas;

    TextView txtDetalleTragamonedas;
    TextView txtDetallePersonas;
    TextView txtDetallesMFS;
    TextView txtDetalleGastronomia;
    TextView txtDetalleMesas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_san_martin);

        MostrarTragamonedasSanMartin();
        MostrarGastronomiaSanMartin();
        MostrarMesasSanMartin();
        MostrarPersonasSanMartin();
        MostrarMaquinasSanMartin();
    }


    //Metodos Muestra

    public void MostrarTragamonedasSanMartin(){

        nomcas = "San Martin";

        String url = "https://ezequiel1697.000webhostapp.com/consulta_tragamonedas.php?&nomcas=" + nomcas;

        RequestQueue queue = Volley.newRequestQueue(this);

        txtDetalleTragamonedas = (TextView)findViewById(R.id.txtTragamonedasSanMartin);

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {

                try {
                    JSONArray array = response.getJSONArray("Casino");
                    for (int i = 0; i < array.length(); i++) {
                        JSONObject consulta = array.getJSONObject(i);
                        double suma1 = 0;
                        String txtSuma;
                        suma1 = consulta.getDouble("SUMA");
                        txtSuma = Double.toString(suma1);
                        txtDetalleTragamonedas.setText(txtSuma);

                    }


                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        queue.add(request);



    }


    public void MostrarGastronomiaSanMartin(){

        nomcas = "San Martin";

        String url = "https://ezequiel1697.000webhostapp.com/consulta_gastronomia.php?&nomcas=" + nomcas;

        RequestQueue queue = Volley.newRequestQueue(this);

        txtDetalleGastronomia = (TextView)findViewById(R.id.txtGastronomiaSanMartin);

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {

                try {
                    JSONArray array = response.getJSONArray("Casino");
                    for (int i = 0; i < array.length(); i++) {
                        JSONObject consulta = array.getJSONObject(i);
                        double suma1 = 0;
                        String txtSuma;
                        suma1 = consulta.getDouble("SUMA");
                        txtSuma = Double.toString(suma1);
                        txtDetalleGastronomia.setText(txtSuma);

                    }


                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        queue.add(request);



    }


    public void MostrarMesasSanMartin(){

        nomcas = "San Martin";

        String url = "https://ezequiel1697.000webhostapp.com/consulta_mesas.php?&nomcas=" + nomcas;

        RequestQueue queue = Volley.newRequestQueue(this);

        txtDetalleMesas = (TextView)findViewById(R.id.txtMesasSanMartin);

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {

                try {
                    JSONArray array = response.getJSONArray("Casino");
                    for (int i = 0; i < array.length(); i++) {
                        JSONObject consulta = array.getJSONObject(i);
                        double suma1 = 0;
                        String txtSuma;
                        suma1 = consulta.getDouble("SUMA");
                        txtSuma = Double.toString(suma1);
                        txtDetalleMesas.setText(txtSuma);

                    }


                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        queue.add(request);



    }

    public void MostrarPersonasSanMartin(){

        nomcas = "San Martin";

        String url = "https://ezequiel1697.000webhostapp.com/consulta_personas.php?&nomcas=" + nomcas;

        RequestQueue queue = Volley.newRequestQueue(this);

        txtDetallePersonas = (TextView)findViewById(R.id.txtPersonasSanMartin);

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {

                try {
                    JSONArray array = response.getJSONArray("Casino");
                    for (int i = 0; i < array.length(); i++) {
                        JSONObject consulta = array.getJSONObject(i);
                        double suma1 = 0;
                        String txtSuma;
                        suma1 = consulta.getDouble("SUMA");
                        txtSuma = Double.toString(suma1);
                        txtDetallePersonas.setText(txtSuma);

                    }


                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        queue.add(request);



    }

    public void MostrarMaquinasSanMartin(){

        nomcas = "San Martin";

        String url = "https://ezequiel1697.000webhostapp.com/consulta_maquinafs.php?&nomcas=" + nomcas;

        RequestQueue queue = Volley.newRequestQueue(this);

        txtDetallesMFS = (TextView)findViewById(R.id.txtMaquinasFSSanMartin);

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {

                try {
                    JSONArray array = response.getJSONArray("Casino");
                    for (int i = 0; i < array.length(); i++) {
                        JSONObject consulta = array.getJSONObject(i);
                        double suma1 = 0;
                        String txtSuma;
                        suma1 = consulta.getDouble("SUMA");
                        txtSuma = Double.toString(suma1);
                        txtDetallesMFS.setText(txtSuma);

                    }


                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        queue.add(request);



    }

}
