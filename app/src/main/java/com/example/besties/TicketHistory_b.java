package com.example.besties;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class TicketHistory_b extends Fragment {
LinearLayout linearticket1;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.activity_ticket_history_b, container, false);
        LinearLayout linearticket1 = (LinearLayout )view.findViewById(R.id.linearticket1);
        linearticket1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Fragment fragment = null;
                switch (view.getId()) {
                    case R.id.linearticket1:
                        fragment = new YourTicket_19();

                        break;

                }
                if (fragment != null) {
                    fragmentTransaction.replace(R.id.layoutContainer, fragment);
                    fragmentTransaction.commit();
                }
            }


        });
        return view;
    }

    private FragmentManager getSupportFragmentManager() {

        return null;
    }


}
