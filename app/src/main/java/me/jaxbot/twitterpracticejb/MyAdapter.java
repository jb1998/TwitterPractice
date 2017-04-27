package me.jaxbot.twitterpracticejb;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by pc on 4/8/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {


    Context mContext;
    ArrayList<UserTimelineResponseClass> mtimeline = new ArrayList<>();
    public MyAdapter(ArrayList<UserTimelineResponseClass> mtimeline)
    {
        this.mtimeline=mtimeline;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View contactView = inflater.inflate(R.layout.my_item_look, parent, false);


        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }
    
    public MyAdapter(Context context,ArrayList<UserTimelineResponseClass> timeline)
    {
        this.mContext=context;
        this.mtimeline=timeline;
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.time.setText(mtimeline.get(position).created_at);
        holder.name.setText(mtimeline.get(position).user.name);
        holder.tweet.setText(mtimeline.get(position).text);
        Picasso.with(mContext).load(mtimeline.get(position).user.profile_image_url).into(holder.imageView1);
//       String str= mtimeline.get(position).entities.media.get(0).getMedia_url();
  //      Picasso.with(mContext).load(str).into(holder.imageView2);

    //    Log.d("mmm",mtimeline.get(position).created_at+" "+mtimeline.get(position).created_at);

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
