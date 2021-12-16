package mx.edu.tarea.isc.Tareap4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtuser, txtcontra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtuser = findViewById(R.id.txtusuario);
        txtcontra = findViewById(R.id.txtcontra);
    }

    public void onclic(View v){
        String user = "Mateo";
        String pass = "Android2021";
        if(user.equals(txtuser.getText().toString()) && pass.equals(txtcontra.getText().toString())){
            Toast.makeText(this, "Redireccionando", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, ValidadoActivity.class);
            intent.putExtra("usuario",txtuser.getText().toString());
            intent.putExtra("numero",0);
            startActivity(intent);
            finish();
        } else {
            Toast.makeText(this, "Error de usuario y/o contraseña", Toast.LENGTH_LONG).show();
        }
    }
}