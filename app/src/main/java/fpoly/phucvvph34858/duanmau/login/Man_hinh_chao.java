package fpoly.phucvvph34858.duanmau.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import fpoly.phucvvph34858.duanmau.R;

public
class Man_hinh_chao extends AppCompatActivity {

    @Override
    protected
    void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_man_hinh_chao);
        Handler handler= new Handler ();
        handler.postDelayed (new Runnable () {
            @Override
            public
            void run() {
                Intent intent = new Intent(Man_hinh_chao.this, Login.class);
                startActivity(intent);
            }
        },2000);
    }
}