package com.example.me74.booklist;

/**
 * Created by me74 on 12.07.2017.
 */

public class Book {


    /**
     * Title of the book
     */

    private String mTitle;

    /**
     * Authors of the book
     */

    private String[] mAuthors;

    /**
     * Web Reader URL of the book
     */
    private String mWebReaderUrl;

    /**
     * URL of the Thumbnail of the book
     */
    private String mThumbnailUrl;


    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param title        is the title of the book
     * @param authors      is the author(s) of the book
     * @param webReaderUrl is the Web Reader URL
     * @param thumbnailUrl is URL to the thumbnail
     */
    public Book(String title, String[] authors, String webReaderUrl, String thumbnailUrl) {
        mTitle = title;
        mAuthors = authors;
        mWebReaderUrl = webReaderUrl;
        mThumbnailUrl = thumbnailUrl;
    }


    /**
     * @return mTitle           returns the title of the book
     */
    public String getmTitle() {
        return mTitle;
    }

    /**
     * @return mAthors          returns the authors of the book
     */
    public String[] getmAuthors() {
        return mAuthors;
    }

    /**
     * @return mWebReaderUrl    returns the Web Reader URL of the book
     */
    public String getmWebReaderUrl() {
        return mWebReaderUrl;
    }

    /**
     * @return mThumbnailUrl    returns the thumbnail url of the book
     */
    public String getmThumbnailUrl() {
        return mThumbnailUrl;
    }

}

