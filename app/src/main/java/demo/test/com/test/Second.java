package demo.test.com.test;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;

/**
 * Created by mdenterpriseindia on 9/1/16.
 */
public class Second extends AppCompatActivity
{
    private RelativeLayout relativeLayout;
    private View addView;
    private RelativeLayout.LayoutParams params1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        setContentView(R.layout.test);
        super.onCreate(savedInstanceState);
         relativeLayout=(RelativeLayout) findViewById(R.id.layout);
       // ScrollView scrollView=(ScrollView)findViewById(R.id.scroll);
       // scrollView.setVerticalScrollBarEnabled(true);
         params1=new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
        ImageView imageView=(ImageView)findViewById(R.id.yyyy);
        params1.addRule(RelativeLayout.BELOW,imageView.getId());
        params1.addRule(RelativeLayout.START_OF,imageView.getId());






    }
    public void click(View view)
    {
        LayoutInflater layoutInflater=(LayoutInflater)getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        addView=layoutInflater.inflate(R.layout.raw,null,false);
        ImageView imageView1=(ImageView)addView.findViewById(R.id.image1);
        ImageView imageView2=(ImageView)addView.findViewById(R.id.image2);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("click on under 1","log");
                LayoutInflater layoutInflater=(LayoutInflater)getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                addView=layoutInflater.inflate(R.layout.raw,null,false);
                params1.addRule(RelativeLayout.BELOW,view.getId());
                params1.addRule(RelativeLayout.END_OF,view.getId());
                relativeLayout.addView(addView,params1);

                // ImageView imageView1=(ImageView)addView.findViewById(R.id.image1);
              //  ImageView imageView2=(ImageView)addView.findViewById(R.id.image2);

            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("click on under 2","log");
                LayoutInflater layoutInflater=(LayoutInflater)getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                addView=layoutInflater.inflate(R.layout.raw,null,false);
                //ImageView imageView1=(ImageView)addView.findViewById(R.id.image1);
                //ImageView imageView2=(ImageView)addView.findViewById(R.id.image2);

                params1.addRule(RelativeLayout.BELOW,view.getId());
                params1.addRule(RelativeLayout.END_OF,view.getId());
                relativeLayout.addView(addView,params1);

            }
        });



        Log.e("on click","log");
        relativeLayout.addView(addView,params1);



    }
}
