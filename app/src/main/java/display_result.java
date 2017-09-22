import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import lw.bookshare.R;
import lw.bookshare.get_User_ph;

import static lw.bookshare.R.id.bookTitle;

/**
 * Created by User on 22-09-2017.
 */

public class display_result extends ArrayAdapter<get_User_ph> {
    private Activity context;
    private List<get_User_ph> displaybooks;

    public display_result (Activity context, List<get_User_ph> displaybooks){
        super(context, R.layout.my_lib,displaybooks);
        this.context=context;
        this.displaybooks =displaybooks;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();

        View listViewItem = inflater.inflate(R.layout.my_lib,null,true);

        TextView b = (TextView) listViewItem.findViewById(bookTitle);
        TextView bookAuthor = (TextView) listViewItem.findViewById(R.id.bookAuthor);

        get_User_ph Display1 = displaybooks.get(position);
        bookTitle.setText(Display1.getUsername());
        bookAuthor.setText(Display1.getx());

        return listViewItem;
    }
}

}
