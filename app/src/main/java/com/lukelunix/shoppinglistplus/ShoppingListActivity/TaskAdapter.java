package com.lukelunix.shoppinglistplus.ShoppingListActivity;

import android.content.Context;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import com.lukelunix.shoppinglistplus.R;


public class TaskAdapter extends ArrayAdapter<Task> {

    private Context context;
    private ArrayList<Task> taskList;
    private ArrayList<String> strikeThroughText;


    public TaskAdapter(Context context, ArrayList<Task> objects) {
        super(context,R.layout.task_row_item, objects);
        this.context =context;
        this.taskList = objects;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        if(convertView == null){
            LayoutInflater layoutInflater = LayoutInflater.from(context);
            convertView = layoutInflater.inflate(R.layout.task_row_item,null);

        }
        Task task = getItem(position);
        TextView descriptionView = (TextView) convertView.findViewById(R.id.task_description);
        descriptionView.setText(task.getTaskDescription());

        if(task.isDone()){
            descriptionView.setPaintFlags(descriptionView.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        }
        else{
            descriptionView.setPaintFlags(descriptionView.getPaintFlags() & (~Paint.STRIKE_THRU_TEXT_FLAG));
        }
        return convertView;
    }

    public ArrayList<Task> getList(){
        return taskList;
    }

    public void removeTask(int pos){
        taskList.remove(pos);
    }

}
