package rmu.mtlab.helloandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button go;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // คำสั้งในการแสดง layout ที่ต้องการ
        setContentView(R.layout.activity_main);

        // อ้างไปหา id ใน layout
        go=(Button)findViewById(R.id.btnGo);

        // คำสั่งในการคลิกปุ่ม
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //คำสั่งในการเปลี่ยนหน้า Activity
                Intent act2=new Intent(getApplicationContext(),Activity2.class);
                startActivity(act2);
            }
        });

    }// end Oncreate
}// end class
