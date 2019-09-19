
package com.example.esoshiki;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.GridView;

public class Bangal_banjonborno extends AppCompatActivity {
    private GridView btn_banjonborno;
    String []banjonborno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangal_banjonborno);

        btn_banjonborno=findViewById(R.id.btn_banjonBorno);
        banjonborno=getResources().getStringArray(R.array.Bangla_BanjonBorno);

        CustomAdapter customAdapter=new CustomAdapter(this,banjonborno);
        btn_banjonborno.setAdapter(customAdapter);

    }
}
