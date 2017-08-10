package com.ANC_TeamEagles.mypurse;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class ExpenditureFragment extends Fragment {

    public ExpenditureFragment() {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {View view = inflater.inflate(R.layout.expenditure_fragment, container, false);

        ArrayList<IncomeExpenditure> incomeList = new ArrayList<>();

        incomeList.add(new IncomeExpenditure("Food", "70,000", "7 Aug, 2017"));
        incomeList.add(new IncomeExpenditure("Credit", "15,000", "17 Aug, 2017"));

        ListView incomeListView = (ListView)view.findViewById(R.id.custom_listview);
        IncomeExpenditureAdapter listAdapter = new IncomeExpenditureAdapter(getActivity(), R.layout.income_expenditure_listitem, incomeList);
        incomeListView.setAdapter(listAdapter);
        return view;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();

    }

}
