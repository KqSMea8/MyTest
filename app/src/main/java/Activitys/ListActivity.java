package Activitys;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListActivity extends Activity {

    ListView mlistView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mlistView = new ListView(this);

        ArrayAdapter<String> adp = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, getData());
        mlistView.setAdapter(adp);

        setContentView(mlistView);
    }

    protected String[] getData()
    {
        return new String[] {"请填写你自己的列表内容"};
    }
}
