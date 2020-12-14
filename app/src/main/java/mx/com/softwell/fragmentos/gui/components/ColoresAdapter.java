package mx.com.softwell.fragmentos.gui.components;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


import mx.com.softwell.fragmentos.R;
import mx.com.softwell.fragmentos.model.Color;

public class ColoresAdapter extends RecyclerView.Adapter<ColoresAdapter.ViewHolder> {
private List<Color> colores;
private Context context;

    public ColoresAdapter(List<Color> colores) {
        this.colores = colores;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_colores,parent,false);
        context=parent.getContext();
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Color color=colores.get(position);
        String imgUri="@drawable/"+color.getImagen();
        int imgResurce=context.getResources().getIdentifier(imgUri,null,context.getPackageName());
        holder.imgColor.setImageResource(imgResurce);
        holder.lblNombre.setText(color.getNombre());
        holder.rbClasificacion2.setRating(color.getClasificacion());
        holder.lblApellidos.setText(color.getApellido());

    }

    @Override
    public int getItemCount() {
      return colores.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private View view;
        private AppCompatImageView imgColor;
        private TextView lblNombre;
        private AppCompatRatingBar rbClasificacion2;
        private TextView lblApellidos;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgColor=itemView.findViewById(R.id.gamev);
            lblNombre=itemView.findViewById(R.id.lvlTitulo);
            rbClasificacion2=itemView.findViewById(R.id.rbClasificacion2);
            lblApellidos=itemView.findViewById(R.id.lvlDescripcion);
            this.view=itemView;
        }
    }
}
