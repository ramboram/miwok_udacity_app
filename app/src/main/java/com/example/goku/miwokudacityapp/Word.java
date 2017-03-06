package com.example.goku.miwokudacityapp;

/**
 * Created by goku on 26/01/17.
 */

public class Word {

    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    private int mAudioResource = NO_AUDIO_PROVIDED;

    private static final int NO_AUDIO_PROVIDED = -1;

    /**
     *
     * @param mDefaultTranslation
     * @param mMiwokTranslation
     */
    public Word(String mDefaultTranslation, String mMiwokTranslation){
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
    }

    /**
     *
     * @param mDefaultTranslation is the worlds in the language that the user
     * @param mMiwokTranslation is the word in the Miwok language
     * @param mImageResourceId is the drawable resource ID for the image asset
     */
    public Word(String mDefaultTranslation, String mMiwokTranslation, int mImageResourceId) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mImageResourceId = mImageResourceId;
    }

    /**
     * Constructor for set audio resource
     * @param mDefaultTranslation
     * @param mMiwokTranslation
     * @param mImageResourceId
     * @param mAudioResourceId
     */
    public Word(String mDefaultTranslation, String mMiwokTranslation, int mImageResourceId, int mAudioResourceId) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mImageResourceId = mImageResourceId;
        this.mAudioResource = mAudioResourceId;
    }

    public String getDefaultTranslation() {
        return this.mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return this.mMiwokTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public boolean hasAudio() {
        return mAudioResource != NO_AUDIO_PROVIDED;
    }

    public int getmAudioResourceId(){
        return mAudioResource;
    }

}
