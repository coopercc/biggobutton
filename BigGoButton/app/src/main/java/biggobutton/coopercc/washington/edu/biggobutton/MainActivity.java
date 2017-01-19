package biggobutton.coopercc.washington.edu.biggobutton;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    Button button;
    int clickCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        button = (Button)findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCount++;
                button.setText("Button clicked " + clickCount + " times!");
                Log.i("MainActivity", "Button was clicked " + clickCount);
            }
        });

    }
}
