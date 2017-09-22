package lw.bookshare;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Adish on 22/09/17.
 */

public class Booklist extends ArrayAdapter<get_User_ph> {
private Activity context;
    private List<get_User_ph> booksList;

    public Booklist (Activity context, List<get_User_ph> booksList){
        super(context, R.layout.my_lib,booksList);
                this.context=context;
                this.booksList=booksList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();

        View listViewItem = inflater.inflate(R.layout.my_lib,null,true);

        TextView bookTitle = (TextView) listViewItem.findViewById(R.id.bookTitle);
        TextView bookAuthor = (TextView) listViewItem.findViewById(R.id.bookAuthor);

        get_User_ph existingBookss = booksList.get(position);
        bookTitle.setText(existingBookss.getTitle());
        bookAuthor.setText(existingBookss.getAuthor());

        return listViewItem;
    }
}
