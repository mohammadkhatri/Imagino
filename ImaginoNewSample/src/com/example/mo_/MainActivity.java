package com.example.mo_;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.ImageView;
import com.mohammad.imagino.Imagino;

public class MainActivity extends Activity {

	Button b1,b2,b3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final ImageView img = (ImageView) findViewById(R.id.imageView1);
		final Animation a = new ScaleAnimation(0, 1, 0, 1, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
		a.setFillAfter(true);
		a.setDuration(500);
		//Round and default image , fadeIn(Default) Anim
		b1=(Button) findViewById(R.id.button1);
		//Square with custom Animation without default Image
		b2=(Button) findViewById(R.id.button2);
		//Round and default image Custom Anim
		b3=(Button) findViewById(R.id.button3);
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			//Toast.makeText(MainActivity.this, "clicked1", Toast.LENGTH_SHORT).show();	
				Imagino.setImageFromWeb(MainActivity.this.getApplicationContext(), img, "http://www.allure.com/images/hair-ideas/2012/05/oval-face-shape-hairstyles-jessica-alba.jpg" , R.drawable.ic_launcher , true , new Animation(){});
			}
		});
		b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
//				Toast.makeText(MainActivity.this, "clicked2", Toast.LENGTH_SHORT).show();
				Imagino.setImageFromWeb(MainActivity.this.getApplicationContext(), img, "http://www.allure.com/images/hair-ideas/2012/05/oval-face-shape-hairstyles-jessica-alba.jpg" , -1 , false ,a);
			}
		});
		b3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
//				Toast.makeText(MainActivity.this, "clicked3", Toast.LENGTH_SHORT).show();
				Imagino.setImageFromWeb(MainActivity.this.getApplicationContext(), img, "http://www.allure.com/images/hair-ideas/2012/05/oval-face-shape-hairstyles-jessica-alba.jpg" , R.drawable.ic_launcher , true ,a);
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
