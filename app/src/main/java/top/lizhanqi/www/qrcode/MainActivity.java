package top.lizhanqi.www.qrcode;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import top.lizhanqi.www.zxing.scanner.CaptureActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ab(View view) {
        startActivityForResult(new Intent(this,CaptureActivity.class),88);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode==RESULT_OK){
            if (data!=null){
                String result = data.getStringExtra("result");
                Toast.makeText(MainActivity.this,result,Toast.LENGTH_SHORT).show();
            }
        }
    }
}
