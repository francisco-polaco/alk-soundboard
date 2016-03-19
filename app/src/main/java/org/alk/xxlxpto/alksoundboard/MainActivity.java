package org.alk.xxlxpto.alksoundboard;

import android.app.ListActivity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends ListActivity {

    private ArrayList<Sound> mSounds;
    private SoundAdapter mAdapter;
    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //create a simple list
        mSounds = new ArrayList<Sound>();
        createSoundList();

        mAdapter = new SoundAdapter(this, R.layout.list_row, mSounds);
        setListAdapter(mAdapter);
    }



    protected void createSoundList(){
        /* I know that this method is simply horrible, however this app is a troll app and was written at 1 am.
        *  Plz write this code right
        */
        mSounds.add(new Sound(getResources().getString(R.string.altinus_channel_baixo), R.mipmap.ic_launcher, R.raw.altinus_channel_baixo));
        mSounds.add(new Sound(getResources().getString(R.string.ban), R.mipmap.ic_launcher, R.raw.ban));
        mSounds.add(new Sound(getResources().getString(R.string.bora_lol), R.mipmap.ic_launcher, R.raw.bora_lol));
        mSounds.add(new Sound(getResources().getString(R.string.duda_channel_baixo), R.mipmap.ic_launcher, R.raw.duda_channel_baixo));
        mSounds.add(new Sound(getResources().getString(R.string.duda_channel_baixo2), R.mipmap.ic_launcher, R.raw.duda_channel_baixo2));
        mSounds.add(new Sound(getResources().getString(R.string.engage), R.mipmap.ic_launcher, R.raw.engage));
        mSounds.add(new Sound(getResources().getString(R.string.facebook), R.mipmap.ic_launcher, R.raw.facebook));
        mSounds.add(new Sound(getResources().getString(R.string.ff20), R.mipmap.ic_launcher, R.raw.ff20));
        mSounds.add(new Sound(getResources().getString(R.string.forca), R.mipmap.ic_launcher, R.raw.forca));
        mSounds.add(new Sound(getResources().getString(R.string.just_fdd), R.mipmap.ic_launcher, R.raw.jhust_fdd));
        mSounds.add(new Sound(getResources().getString(R.string.kazix), R.mipmap.ic_launcher, R.raw.kazix));
        mSounds.add(new Sound(getResources().getString(R.string.pareces_sapo), R.mipmap.ic_launcher, R.raw.pareces_sapo));
        mSounds.add(new Sound(getResources().getString(R.string.puta_de_ward), R.mipmap.ic_launcher, R.raw.puta_de_ward));
        mSounds.add(new Sound(getResources().getString(R.string.quit), R.mipmap.ic_launcher, R.raw.quit));
        mSounds.add(new Sound(getResources().getString(R.string.sai_dai), R.mipmap.ic_launcher, R.raw.sai_dai));
        mSounds.add(new Sound(getResources().getString(R.string.soundboard), R.mipmap.ic_launcher, R.raw.soundboard));
        mSounds.add(new Sound(getResources().getString(R.string.vira_bilha), R.mipmap.ic_launcher, R.raw.vira_bilha));
    }

    @Override
    protected void onStop() {
        super.onStop();
        mMediaPlayer.release();
        mMediaPlayer = null;
    }

    @Override
    public void onListItemClick(ListView parent, View v, int position, long id){
        mMediaPlayer = MediaPlayer.create(this, mSounds.get(position).getIconResourceId());
        mMediaPlayer.start();
    }

}
