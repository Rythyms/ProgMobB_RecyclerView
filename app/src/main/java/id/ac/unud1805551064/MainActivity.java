package id.ac.unud1805551064;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<ListItem> listItems;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        listItems = new ArrayList<>();

            ListItem listItem = new ListItem(
                    "Iker Casillas ",
                    "Umur 38 Tahun, Bermain Untuk F.C. Porto Sebagai Kiper"
            );

            listItems.add(listItem);

            ListItem listItem1 = new ListItem(
                    "Marcelo Vieira ",
                    "Umur 31 Tahun, Bermain Untuk Real Madrid C.F. Sebagai Bek Kiri"
            );

            listItems.add(listItem1);

            ListItem listItem2 = new ListItem(
                    "Raphael Varane ",
                    "Umur 26 Tahun, Bermain Untuk Real Madrid C.F. Sebagai Bek Tengah"
            );

            listItems.add(listItem2);

            ListItem listItem3 = new ListItem(
                    "Pepe ",
                    "Umur 37 Tahun, Bermain Untuk F.C. Porto Sebagai Bek Tengah"
            );

            listItems.add(listItem3);

            ListItem listItem4 = new ListItem(
                    "Sergio Ramos ",
                    "Umur 34 Tahun, Bermain Untuk Real Madrid C.F. Sebagai Bek Kanan"
            );

            listItems.add(listItem4);

            ListItem listItem5 = new ListItem(
                    "Toni Kroos ",
                    "Umur 30 Tahun, Bermain Untuk Real Madrid C.F. Sebagai Gelandang Tengah"
            );

            listItems.add(listItem5);

            ListItem listItem6 = new ListItem(
                    "Casemiro ",
                    "Umur 28 Tahun, Bermain Untuk Real Madrid C.F. Sebagai Gelandang Tengah"
            );

            listItems.add(listItem6);

            ListItem listItem7 = new ListItem(
                    "Neymar ",
                    "Umur 28 Tahun, Bermain Untuk Paris Saint-Germain F.C. Sebagai Sayap Kiri"
            );

            listItems.add(listItem7);

        ListItem listItem8 = new ListItem(
                "Kevin De Bruyne ",
                "Umur 28 Tahun, Bermain Untuk Manchester City F.C. Sebagai Gelandang Serang"
        );

        listItems.add(listItem8);

        ListItem listItem9 = new ListItem(
                "Cristiano Ronaldo ",
                "Umur 35 Tahun, Bermain Untuk Juventus F.C. Sebagai Sayap Kanan"
        );

        listItems.add(listItem9);

        ListItem listItem10 = new ListItem(
                "Kylian Mbappe ",
                "Umur 21 Tahun, Bermain Untuk Paris Saint-Germain F.C. Sebagai Penyerang"
        );

        listItems.add(listItem10);


        adapter = new MyAdapter(listItems, this);

        recyclerView.setAdapter(adapter);
    }
}
