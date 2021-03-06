import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.giwangnuelsyaputri.cobarecyclerview.R;

import java.util.ArrayList;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.ViewHolder> {
    private Context context;
    private ArrayList<RVModel> rvModels;

    public ArrayList<RVModel> getRvModels() {
        return rvModels;
    }

    public void setRvModels(ArrayList<RVModel> rvModels) {
        this.rvModels = rvModels;
    }

    public RVAdapter(Context context) {
        this.context = context;

    }

    @NonNull
    @Override
    public RVAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.item_list, viewGroup, false);
        return new ViewHolder(itemRow);
    }


    @Override
    public void onBindViewHolder(@NonNull RVAdapter.ViewHolder viewHolder, int i) {
        Glide.with(context).load(getRvModels().get(i).getLogo()).into(viewHolder.ivLogo);
        viewHolder.tvName.setText(getRvModels().get(i).getName());
    }


    @Override
    public int getItemCount() {
        return getRvModels().size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView ivLogo;
        private TextView tvName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivLogo = itemView.findViewById(R.id.img);
            tvName = itemView.findViewById(R.id.txt);
        }
    }

}


