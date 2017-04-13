package me.jaxbot.twitterpracticejb;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by pc on 4/8/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {


    Context mContext;
    ArrayList<TimeLine> mtimeline = new ArrayList<>();
    public MyAdapter(ArrayList<TimeLine> mtimeline)
    {
        this.mtimeline=mtimeline;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View contactView = inflater.inflate(R.layout.my_item_look, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }
    public MyAdapter(Context context,ArrayList<TimeLine> timeline)
    {
        this.mContext=context;
        this.mtimeline=timeline;
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

//        holder.imageView1.setImageResource(mtimeline.get(position).imageView1);

    }

    @Override
    public int getItemCount() {
        return mtimeline.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder
    {

        ImageView imageView1,imageView2 ;
        TextView time,tweet,name;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView1=(ImageView)itemView.findViewById(R.id.profileimage);
            imageView2=(ImageView)itemView.findViewById(R.id.tweetimage);
            time=(TextView) itemView.findViewById(R.id.timeTextView);
            tweet=(TextView)itemView.findViewById(R.id.tweet);
            name=(TextView)itemView.findViewById(R.id.username);

        }
    }
}
