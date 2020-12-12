package chitra.helloworld.aboutus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener{
  private EditText name,email,subject,number,message;
   private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        number = findViewById(R.id.number);
        subject = findViewById(R.id.sub);
        message = findViewById(R.id.message);
        btn = findViewById(R.id.button);
        btn.setOnClickListener(this);
    }
            public void onClick(View view) {

                Toast.makeText(this,"Message Sent",Toast.LENGTH_SHORT).show();

            }
    }







