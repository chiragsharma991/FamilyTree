package demo.test.com.test;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;

/**
 * Created by mdenterpriseindia on 9/1/16.
 */
public class Second extends AppCompatActivity
{
    private LinearLayout linearLayout;
    private View addView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        setContentView(R.layout.test);
        super.onCreate(savedInstanceState);
         linearLayout=(LinearLayout)findViewById(R.id.layout);
       // ScrollView scrollView=(ScrollView)findViewById(R.id.scroll);
       // scrollView.setVerticalScrollBarEnabled(true);






    }
    public void click(View view)
    {
        LayoutInflater layoutInflater=(LayoutInflater)getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        addView=layoutInflater.inflate(R.layout.raw,null,false);

        Log.e("on click","log");
        linearLayout.addView(addView);



    }
}
