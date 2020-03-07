package tw.org.iii.leo.leo03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private ListView lv;
    private SimpleAdapter simpleAdapter;
    private ArrayList<HashMap<String,String>> data = new ArrayList<>();
    private String[] from = {"f1","f2","f3"};
    private int[] to = {R.id.item_title,R.id.item_content,R.id.item_date};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.listView);
        initListView();
    }

    private void initListView(){
        for(int i = 0; i<100;i++) {


            HashMap<String, String> row0 = new HashMap<>();
            row0.put(from[0], "value" + i);
            row0.put(from[1], "xxxxx" + i);
            row0.put(from[2], "2020-03-07 10:20:30");
            data.add(row0);
        }
        //調變器 由他整合資料
        simpleAdapter = new SimpleAdapter(this,data,R.layout.item,from , to);
        lv.setAdapter(simpleAdapter);

    }

}
