package com.example.vamp.javaprogramming;
/**
 * Created by VAMP on 18-Oct-16.
 */


        import android.content.Intent;
        import android.os.Bundle;
        import android.os.PersistableBundle;
        import android.support.annotation.Nullable;
        import android.support.v7.app.AppCompatActivity;

/**
 * Created by VAMP on 17-Sep-16.
 */
public class SplashActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread timer=new Thread(){
            public void run(){
                try {
                    sleep(2000);

                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    Intent i =new Intent(SplashActivity.this,DashboardActivity.class);
                    i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(i);
                }

            }
        };
        timer.start();
    }
    }


