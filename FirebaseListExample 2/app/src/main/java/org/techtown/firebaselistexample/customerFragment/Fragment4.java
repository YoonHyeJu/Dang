package org.techtown.firebaselistexample.customerFragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.techtown.firebaselistexample.R;


public class Fragment4 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment4_chatroom_list, container, false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.chatfragment_recyclerview);

        return view;


    }
     class ChatRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

         @NonNull
         @Override
         public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
             return null;
         }

         @Override
         public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

         }

         @Override
         public int getItemCount() {
             return 0;
         }
     }
}
