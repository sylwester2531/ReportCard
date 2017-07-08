package com.example.android.reportcard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by admin on 2017-07-08.
 */

public class PlayerInfoAdapter extends ArrayAdapter<PlayerInfo> {

    public PlayerInfoAdapter(Context context, ArrayList<PlayerInfo> playerInfo) {
        super(context, 0, playerInfo);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        PlayerInfo playerInfo = getItem(position);

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_club_icon);
        iconView.setImageResource(playerInfo.getmImageResourceId());

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_player);
        nameTextView.setText(playerInfo.getmNamePlayer());

        TextView positionTextView = (TextView) listItemView.findViewById(R.id.position);
        positionTextView.setText(playerInfo.getmPlayerPosition());

        TextView ageTextView = (TextView) listItemView.findViewById(R.id.age);
        ageTextView.setText(playerInfo.getmPlayerAge());

        TextView heightTextView = (TextView) listItemView.findViewById(R.id.height);
        heightTextView.setText(playerInfo.getmPlayerHeight());

        return listItemView;
    }
}
