package fr.epita.epilifetoday;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by antoine on 31/05/2017.
 */

public class FavoriteFragment extends Fragment {
    FavoriteInterface favoriteInterface;

    public FavoriteFragment() {

    }

    public interface FavoriteInterface {
        public void addFavorite();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return null;
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
    }


}
