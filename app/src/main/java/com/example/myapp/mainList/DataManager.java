package com.example.myapp.mainList;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapp.MainActivity;
import com.example.myapp.Program;
import com.example.myapp.R;

import java.util.ArrayList;
import java.util.List;


public class DataManager extends RecyclerView.Adapter<DataManager.RecyclerViewHolder>{
    public static List<Program> ProgramDataList;
    public Context context;

    public DataManager(List<Program> ProgramDataList, Context context) {
        this.ProgramDataList = ProgramDataList;
        this.context = context;
    }

    public void filterList(List<Program> filterllist) {
        ProgramDataList = filterllist;
        notifyDataSetChanged();
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder {
        ImageView mImage;
        TextView mName, mId, mTime, mDate;

        RecyclerViewHolder(View itemView) {
            super(itemView);
            mImage = (ImageView) itemView.findViewById(R.id.item_img);
            mId = (TextView) itemView.findViewById(R.id.item_id);
            mName = (TextView) itemView.findViewById(R.id.item_name);
            mTime = (TextView) itemView.findViewById(R.id.item_time);
            mDate = (TextView) itemView.findViewById(R.id.item_date);
        }
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.program_item, parent, false);
        return new RecyclerViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        Program program = ProgramDataList.get(position);

        holder.mImage.setBackgroundResource(setProgramImage.setImage(program.get(Program.Field.NAME)));
        holder.mName.setText(program.get(Program.Field.NAME));
        holder.mId.setText(program.get(Program.Field.ID));
        holder.mTime.setText(program.get(Program.Field.TIME));
        holder.mDate.setText(program.get(Program.Field.DATE));
    }

    @Override
    public int getItemCount() {
        return ProgramDataList.size();
    }
}
