package com.example.walisongo;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailWali extends AppCompatActivity {

    int ID_WALI;
    TextView tvNamaWali, tvDetailWali;
    ImageView ivWali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_wali);

        //id dari layout
        tvNamaWali = findViewById(R.id.tvNamaSunan);
        tvDetailWali = findViewById(R.id.tvDeskripsi);
        ivWali = findViewById(R.id.ivFoto);

        ID_WALI = getIntent().getIntExtra("KEY_ID", 0);
        if (ID_WALI == 0) {
            tvNamaWali.setText(getString(R.string.sGresik));
            tvDetailWali.setText(getString(R.string.sGresikDes));
            ivWali.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),
                    R.drawable.sunan_gresik));
        }else if (ID_WALI == 1){
            tvNamaWali.setText(getString(R.string.sAmpel));
            tvDetailWali.setText(getString(R.string.sAmpelDes));
            ivWali.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),
                    R.drawable.sunan_ampel));
        }else if (ID_WALI == 1) {
            tvNamaWali.setText(getString(R.string.sAmpel));
            tvDetailWali.setText(getString(R.string.sAmpelDes));
            ivWali.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),
                    R.drawable.sunan_ampel));
        }else if (ID_WALI == 1) {
            tvNamaWali.setText(getString(R.string.sAmpel));
            tvDetailWali.setText(getString(R.string.sAmpelDes));
            ivWali.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),
                    R.drawable.sunan_ampel));
        }

    }
}
