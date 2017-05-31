package fr.epita.epilifetoday;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by antoine on 31/05/2017.
 */

public class AddFavFragment extends Fragment {
    AddFavFragment.AddFavInterface addFavInterface;

    public AddFavFragment() {

    }

    public interface AddFavInterface {
        public void back();
        public void select();
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
