package fpoly.phucvvph34858.duanmau.login;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import fpoly.phucvvph34858.duanmau.R;

public class Welcom extends AppCompatActivity {
TextView textView;
ImageView imageView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcom);
        textView=findViewById (R.id.textwelcome);
        imageView=findViewById (R.id.logo);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Welcom.this, Man_hinh_chao.class);
                startActivity(intent);
            }
        },1000);
    }
}