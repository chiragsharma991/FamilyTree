package demo.test.com.test;

import android.app.ActivityManager;
import android.app.ProgressDialog;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.graphics.Bitmap;
import android.provider.Browser;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import demo.test.com.test.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


       binding1=DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding1.trigar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final ProgressDialog progressDialog=new ProgressDialog(MainActivity.this);
                progressDialog.setMessage("loading......");
                progressDialog.setCancelable(false);
                progressDialog.show();

               String url="https://www.youtube.com/";
                binding1.web.getSettings().setLoadsImagesAutomatically(true);
                binding1.web.getSettings().setJavaScriptEnabled(true);
                binding1.web.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                binding1.web.getSettings().setLoadWithOverviewMode(true);
                binding1.web.getSettings().setUseWideViewPort(true);
                binding1.web.getSettings().setBuiltInZoomControls(true);
                Log.e("jump start","log");


                binding1.web.setWebViewClient(new WebViewClient() {
                    @Override
                    public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                        Toast.makeText(MainActivity.this,description,Toast.LENGTH_SHORT).show();
                    }

                    @Override
                                                  public void onPageStarted(WebView view, String url, Bitmap favicon) {
                                                      Log.e("on pagestarted","log");
                                                  }

                                                  @Override
                                                  public void onPageFinished(WebView view, String url) {
                                                      Log.e("on page finished","log");
                                                      progressDialog.dismiss();
                                                  }
                                              });
                Log.e("jumped","log");
                binding1.web.loadUrl(url);





            }
        });







    }


}
