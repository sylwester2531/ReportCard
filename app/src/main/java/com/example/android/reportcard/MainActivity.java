package com.example.android.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<PlayerInfo> playerInfo = new ArrayList<>();
        playerInfo.add(new PlayerInfo(R.drawable.okc, "Rusell Westbrook", "PG", "28", "1,90m"));
        playerInfo.add(new PlayerInfo(R.drawable.cav, "LeBron James", "Forward", "32", "2,03m"));
        playerInfo.add(new PlayerInfo(R.drawable.cav, "Kyrie Irving", "Obrońca", "25", "1,90m"));
        playerInfo.add(new PlayerInfo(R.drawable.bulls, "Rajon Rondo", "Ropzgrywający", "32", "1,85m"));
        playerInfo.add(new PlayerInfo(R.drawable.bulls, "Dwyane Wade", "Guard", "35", "1,93m"));
        playerInfo.add(new PlayerInfo(R.drawable.wizzard, "Marcin Gortat", "Srodkowy", "33", "2,11m"));
        playerInfo.add(new PlayerInfo(R.drawable.heat, "Chris Bosh", "Srodkowy-skrzydłowy", "33", "2,11m"));
        playerInfo.add(new PlayerInfo(R.drawable.cav, "Kevin Love", "Srodkowy-skrzydłowy", "28", "2,08m"));
        playerInfo.add(new PlayerInfo(R.drawable.mav, "Dirk Nowitzki", "Srodkowy-skrzydłowy", "39", "2,13m"));
        playerInfo.add(new PlayerInfo(R.drawable.antonio, "Rudy Gay", "Napastnik", "30", "2,03m"));
        playerInfo.add(new PlayerInfo(R.drawable.okc, "Paul George", "Napastnik", "27", "2,06m"));
        playerInfo.add(new PlayerInfo(R.drawable.heat, "Tyler Johnson", "Obrońca", "25", "1,93m"));

        PlayerInfoAdapter adapter = new PlayerInfoAdapter(this, playerInfo);
        ListView listView = (ListView) findViewById(R.id.player_list);
        listView.setAdapter(adapter);

    }
}
