package demo.test.com.test;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    private LinearLayout linearLayout;
    private Button button;
    private View newview;
    private EditText editText;
    int x=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
         linearLayout=(LinearLayout)findViewById(R.id.linearlayout);
         button=(Button)findViewById(R.id.trigger);
         editText=(EditText)findViewById(R.id.edit);

    }
    public void trigger(View view)
    {
        LayoutInflater layoutInflater=(LayoutInflater)getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
         newview=layoutInflater.inflate(R.layout.raw1,null,false);
        final Button remove=(Button)newview.findViewById(R.id.delete);
        remove.setTag(x);
        x++;
        TextView textView=(TextView)newview.findViewById(R.id.txt);
        if(editText.length()!=0)
        {
            //Log.e("length !=0","log");
            textView.setText(editText.getText().toString());

        }else
        {
            textView.setText("Empty");

        }
        remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              /*  View hidden=findViewById(R.id.hidden);
                ViewGroup parent=(ViewGroup)hidden.getParent();
                parent.removeViewAt(2);*/
               int tag= (int) remove.getTag();
                Log.e("tag name",""+tag);
                linearLayout.removeView((View)view.getParent());
                //Log.e("parentview",""+parent);

                //commitsdfsdfdsfasdfasdf
            }
        });

       linearLayout.addView(newview);
    }
}
