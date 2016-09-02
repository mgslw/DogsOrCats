package girlscodefun.com.carordog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /*
    int - integers
    float -
    strin -
    boolean - prawda/fałsz

     */
    int dogVotesCounter = 0;
    int catVotesCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void voteForDog(View view) {
        TextView dogVotes = (TextView) findViewById(R.id.dog_votes);

        dogVotesCounter = dogVotesCounter + 1 ;

        dogVotes.setText("" + dogVotesCounter);
        /*
        ("" + "int") zamienia liczbę (int) na napis (string) tak że może być wyświetlony
         */

    }

    public void voteForCat (View view) {
        TextView catVotes = (TextView) findViewById(R.id.cat_votes);

        catVotesCounter = catVotesCounter + 1;

        catVotes.setText("" + catVotesCounter);
    }
}