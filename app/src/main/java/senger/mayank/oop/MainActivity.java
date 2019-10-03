package senger.mayank.oop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnThrowJab;
    Boxer myBoxer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnThrowJab = findViewById(R.id.btnThrowJab);

        //
        myBoxer = new Boxer(2, 400, 900);
        //   Log.i("MyTag", myBoxer.toString());

        //   QuickBoxer quickBoxer = new QuickBoxer();
        //   Log.i("MyTag", quickBoxer.toString());

        //   quickBoxer.punchSpeed = 900;
        //   Log.i("MyTag","Punch Speed :"  +quickBoxer.punchSpeed +
        //          "Punch Power :" + quickBoxer.punchPower);

        //   quickBoxer.punchPower = 500;
        //   quickBoxer.punchSpeed = 700;
        //   Log.i("MyTag","Punch Speed :"  +quickBoxer.punchSpeed +
        //           "Punch Power :" + quickBoxer.punchPower);


        //   Log.i("MyTag",(new Boxer()) + "");
        //   Log.i("MyTag",(new Boxer()) + "");
        QuickBoxer quickBoxer = new QuickBoxer(500, 700, 20, 30, 500);

        myBoxer.setNumberOfGloves(10);
        Log.i("MyTag", myBoxer.getNumberOfGloves() + "");


        myBoxer.setStamina(40);

        Boxer newBoxer = new Boxer(4, 50, 80);
    //    Log.i("MyTag", "New Boxer Stamina" + newBoxer.stamina);

    //    newBoxer.stamina = 70;
   //     Log.i("MyTag", "My Boxer Stamina" + myBoxer.stamina);


        Boxer.setStamina(20);
        Log.i("MyTag", "All Boxer Stamina : " + newBoxer.getStamina());

        myBoxer.throwJab();





    }

    public void throwJabIsClicked(View buttonView){

        Toast.makeText(MainActivity.this, myBoxer.throwJab(),
                Toast.LENGTH_LONG).show();

    }
}
