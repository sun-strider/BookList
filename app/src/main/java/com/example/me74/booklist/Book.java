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

    private String mAuthors;

    /**
     * URL of the Thumbnail of the book
     */
    private String mThumbnailUrl;

    /**
     * Web Reader URL of the book
     */
    private String mInfoLinkUrl;


    /**
     * Constructs a new {@link Book} object.
     *
     * @param title        is the title of the book
     * @param authors      is the author(s) of the book
     * @param infoLinkUrl is the Web Reader URL
     * @param thumbnailUrl is URL to the thumbnail
     */
    public Book(String title, String authors, String thumbnailUrl, String infoLinkUrl) {
        mTitle = title;
        mAuthors = authors;
        mThumbnailUrl = thumbnailUrl;
        mInfoLinkUrl = infoLinkUrl;
    }


    /**
     * @return mTitle           returns the title of the book
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * @return mAthors          returns the authors of the book
     */
    public String getAuthors() {
        return mAuthors;
    }

    /**
     * @return mThumbnailUrl    returns the thumbnail url of the book
     */
    public String getThumbnailUrl() {
        return mThumbnailUrl;
    }

    /**
     * @return mInfoLinkUrl    returns the Web Reader URL of the book
     */
    public String getInfoLinkUrl() {
        return mInfoLinkUrl;
    }

}

