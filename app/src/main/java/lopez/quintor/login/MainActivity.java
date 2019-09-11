package lopez.quintor.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etNombre, etPass;
    Button btnIngresar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //match con la vista
        setContentView(R.layout.activity_main);
        //match de los widgets
        etNombre = findViewById(R.id.etNombre);
        etPass = findViewById(R.id.etPass);
        btnIngresar = findViewById(R.id.btnIngresar);

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombreUsuario = etNombre.getText().toString();
                String password = etPass.getText().toString();

                if (nombreUsuario.isEmpty()|| password.isEmpty()){
                    //nombre de usuario vacio
                    mensajito( "El usuario o contrasena estan vacios");

                }else{
                    if (nombreUsuario.equals("francisco") && password.equals("1234")){
                        //Imprimir Bienvenido
                        mensajito("Bienvenido!!");
                    } else {
                        //Imprimir datos erroneos
                        mensajito("Los Datos son erroneos");
                    }
                }

            }
        });

    }
    public void mensajito(String mensaje){
        Toast.makeText( this, mensaje, Toast.LENGTH_LONG).show();
    }
}
