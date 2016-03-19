package org.alk.xxlxpto.alksoundboard;

/**
 * Created by franc on 19/03/2016.
 */
public class Sound {
    private String mDescription;
    private int mSoundResourceId;
    private int mIconResourceId;

    public Sound(String description, int soundResourceId, int iconResourceId){
        mDescription = description;
        mSoundResourceId = soundResourceId;
        mIconResourceId = iconResourceId;
    }

    public Sound(String description, int soundResourceId){
        mDescription = description;
        mSoundResourceId = soundResourceId;
        mIconResourceId = R.mipmap.ic_launcher;
    }

    public void setDescription(String description) { mDescription = description; }
    public String getDescription() { return mDescription; }
    public void setSoundResourceId(int id) { mSoundResourceId = id; }
    public int getSoundResourceId() { return mSoundResourceId; }
    public void setIconResourceId(int id) { mIconResourceId = id; }
    public int getIconResourceId() { return mIconResourceId; }
}
