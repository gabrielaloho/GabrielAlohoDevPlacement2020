package io.gabrielaloho.cars;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class CarsAdapter extends RecyclerView.Adapter<CarsAdapter.CarHolder>{
    private List<Cars> cars = new ArrayList<>();
    private final Context context;


    public CarsAdapter(Context context){
        this.context = context;
    }
    @NonNull
    @Override
    public CarHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.car_item, parent, false);

        return new CarHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CarHolder holder, int position) {
        Cars car = cars.get(position);
        holder.title.setText(car.getFullName());
       /* switch (car.getGender()){
            case Male:
                holder.subTitle.setText("Male");
                holder.subTitle.setTextColor(context.getResources().getColor(R.color.gray));
            case Female:
                holder.subTitle.setText("Female");
                holder.subTitle.setTextColor(context.getResource s().getColor(R.color.black));
        }*/
        Picasso.get().load(car.getAvatar()).fit().centerCrop()
                .placeholder(R.drawable.profile)
                .error(R.drawable.profile)
                .into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return cars.size();
    }

    public void setCars(List<Cars> cars){
        this.cars = cars;
        notifyDataSetChanged();
    }


    public static class CarHolder extends RecyclerView.ViewHolder {
        private final TextView title;
        private final TextView subTitle;
        private final ImageView imageView;

        public CarHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            subTitle = itemView.findViewById(R.id.subtitle);
            imageView = itemView.findViewById(R.id.profile_image);
        }
    }
}
