package com.example.me74.booklist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by me74 on 12.07.2017.
 */

public class BookAdapter extends ArrayAdapter {

    private String mAuthors = "";

    /**
     * Constructs a new {@link BookAdapter}.
     *
     * @param context of the app
     * @param books   is the list of books, which is the data source of the adapter
     */
    public BookAdapter(@NonNull Context context, List<Book> books) {
        super(context, 0, books);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.book_list_item, parent, false);
        }

        // Find the book at the given position in the list of books
        Book currentBook = (Book) getItem(position);


        // Find the TextView with view ID authors
        TextView authorsView = (TextView) listItemView.findViewById(R.id.authors);
        // Build the authors string
        for (int index = 0; index < currentBook.getmAuthors().length; index++) {
            if (index + 1 == currentBook.getmAuthors().length) {
                mAuthors = mAuthors + currentBook.getmAuthors()[index];
            } else {
                mAuthors = mAuthors + currentBook.getmAuthors()[index] + ", ";
            }
        }
        // Display the author(s) of the current book in that TextView
        authorsView.setText(mAuthors);


        // Find the TextView with view ID title
        TextView titleView = (TextView) listItemView.findViewById(R.id.title);
        // Display the title of the current book in that TextView
        titleView.setText(currentBook.getmTitle());


        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }
}
