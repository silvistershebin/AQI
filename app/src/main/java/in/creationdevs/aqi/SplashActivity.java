package in.creationdevs.aqi;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {
    Handler handler;
    TextView load,textViewmit,know;
    ImageView image,legend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        load = findViewById(R.id.textview_load);
        textViewmit = findViewById(R.id.mitwpu);
        image = findViewById(R.id.image);
        know = findViewById(R.id.know);
        legend = findViewById(R.id.legend);

        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.mytransition);
        load.startAnimation(myanim);
        textViewmit.startAnimation(myanim);
        image.startAnimation(myanim);
        know.startAnimation(myanim);
        legend.startAnimation(myanim);


        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(SplashActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },5000);
    }
}