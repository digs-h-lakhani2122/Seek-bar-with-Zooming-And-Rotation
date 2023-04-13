package coatocl.exaatocl.seekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Toast;

public class screen2 extends AppCompatActivity {

    ImageView imageView;
    SeekBar seekBar;
    Button button,button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        imageView = findViewById(R.id.imageView);
        seekBar = findViewById(R.id.seekBar);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            float rotate=36;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser)
            {
//                right rotate
                    rotate = ((progress*10.0f + rotate));
                    imageView.setRotation(rotate);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(screen2.this,"ROTATING is:"+rotate,Toast.LENGTH_SHORT).show();
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(screen2.this,screen1.class);
                startActivity(intent);
            }
        });


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(screen2.this,"U R AT FORWARD.",Toast.LENGTH_SHORT).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(screen2.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
