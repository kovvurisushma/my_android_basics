package svecw.sushma.recycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    MainActivity context;
    int image[];
    String data[];

    public RecyclerViewAdapter(MainActivity mainActivity, int[] image, String[] data) {
        this.context = mainActivity;
        this.image = image;
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.one_row,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.one_row_imageView.setImageResource(image[position]);
        holder.one_row_textView.setText(data[position]);
    }

    @Override
    public int getItemCount() {
        return image.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView one_row_imageView;
        TextView one_row_textView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            one_row_imageView = itemView.findViewById(R.id.image_view);
            one_row_textView = itemView.findViewById(R.id.text_view);

        }
    }
}
