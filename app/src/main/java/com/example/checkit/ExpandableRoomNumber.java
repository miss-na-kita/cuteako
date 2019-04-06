package com.example.checkit;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.io.StringWriter;
import java.text.StringCharacterIterator;

public class ExpandableRoomNumber extends BaseExpandableListAdapter {

    Context context;


    String[]roomnumber={
            "Room 301",
            "Room 302"
    };

    String[][] schedule= {{
            "room 301 scheduel \n\n" +
                    "room 301 schedule \n" +
                    "room 301 schedule"},

            {"room 302 schedule \n" +
                    "room 302 schedule 1"},


            {"room 303 schedule \n" +
                    "room 303 schedule 1"}
            };

    public ExpandableRoomNumber(Context context) {
        this.context = context;
    }

    @Override
    public int getGroupCount() {
        return roomnumber.length;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return schedule[groupPosition].length;
    }

    @Override
    public Object getGroup(int groupPosition) {
        return roomnumber[groupPosition];
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return schedule[groupPosition].length;
    }

    @Override
    public long getGroupId(int groupPosition) {
        return roomnumber[groupPosition].length();
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {

        String roomnumber = (String)getGroup(groupPosition);
        if (convertView == null){
            LayoutInflater inflater = (LayoutInflater)this.context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.room_number,null);
        }
        TextView roomnumber2=convertView.findViewById(R.id.RoomNumber);
        roomnumber2.setTypeface(null, Typeface.BOLD);
        roomnumber2.setText(roomnumber);
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        final String scheduleFaq = (String)getChild(groupPosition, childPosition);
        if (convertView==null){
            LayoutInflater inflater=(LayoutInflater)this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.room_number,null);
        }
        TextView schedule=convertView.findViewById(R.id.RoomNumber);
        schedule.setText(scheduleFaq);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
}
