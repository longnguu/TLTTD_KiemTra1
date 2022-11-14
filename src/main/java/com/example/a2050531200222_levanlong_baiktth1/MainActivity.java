package com.example.a2050531200222_levanlong_baiktth1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    boolean kt=true;
 //   public static Database database;
    ConstraintLayout mMainLayout;
    EditText passLogin,usernameLogin;
    SharedPreferences sharedPreferences;
    CheckBox checkBox;
    Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sharedPreferences = getSharedPreferences("Datalogin",MODE_PRIVATE);
        usernameLogin = (EditText) findViewById(R.id.usernamelogin);
        passLogin = (EditText) findViewById(R.id.passLogin);
        checkBox = (CheckBox) findViewById(R.id.rememberCB);
        buttonLogin = (Button) findViewById(R.id.btlogin);

        if (sharedPreferences.getBoolean("checked",false)==true){
            usernameLogin.setText(sharedPreferences.getString("taikhoan",""));
            passLogin.setText(sharedPreferences.getString("matkhau",""));
            checkBox.setChecked(true);
        }else checkBox.setChecked(false);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (usernameLogin.getText().toString().equals("levanlong") && passLogin.getText().toString().equals("2050531200222")) {
                    Toast.makeText(MainActivity.this, "Đăng nhập thành công", Toast.LENGTH_SHORT).show();
                    Intent intent= new Intent(MainActivity.this,ListCaSi.class);
                    startActivity(intent);
                    checkRemember();
                }
                else Toast.makeText(MainActivity.this,"Sai thông tin tài khoản hoặc mật khẩu",Toast.LENGTH_SHORT).show();
            }
        });


    }
    private void checkRemember() {
        String us=usernameLogin.getText().toString().trim()+"";
        String pas= passLogin.getText().toString().trim()+"";
        if (checkBox.isChecked()) {
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("taikhoan", us);
            editor.putString("matkhau", pas);
            editor.putBoolean("checked", true);
            editor.commit();
        }else {
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("taikhoan", us);
            editor.putString("matkhau", pas);
            editor.putBoolean("checked", false);
            editor.commit();
        }

    }
}