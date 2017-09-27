package cn.edu.gdmec.android.button;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TestButton extends AppCompatActivity {
    private Button btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_test_button );
        btn1=(Button)findViewById ( R.id.button1 );
        btn2=(Button)findViewById ( R.id.button2 );
        btn1.setWidth ( 150 );
        btn2.setWidth ( 100 );
        btn1.setText ( "按钮一" );
        btn2.setText ( "按钮二" );
        btn1.setTextColor ( Color.GREEN );
        btn2.setTextColor ( Color.RED );
        btn1.setTextSize ( 30 );
        btn2.setTextSize ( 20 );
        btn2.setBackgroundColor ( Color.GREEN );

        btn1.setOnClickListener ( new Button.OnClickListener ()
        {
            @Override
            public void onClick(View arg0){
                Toast toast=Toast.makeText ( TestButton.this, "你点击了按钮"+btn1.getText ().toString (), Toast.LENGTH_SHORT );
                toast.setGravity ( Gravity.TOP,0,150 );
                toast.show ();
            }
        });
        btn2.setOnClickListener ( new Button.OnClickListener ()
        {
            @Override
            public void onClick(View v) {
                TestButton.this.finish ();
            }
        });
    }
}
