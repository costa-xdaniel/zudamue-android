package st.zudamue.support.android.component.fragment;

import android.support.v4.app.Fragment;

import java.util.Map;

/**
 * Created by xdaniel on 04/03/17.
 *
 * @author Daniel Costa <costa.xdaniel@gmail.com>
 */

public class BaseFragment extends Fragment implements CallbackFragmentManager.BaseFragment {


    private CallbackFragmentManager callbackManager = new CallbackFragmentManager( this );

    @Override
    public CallbackFragmentManager getCallback() {
        if( this.callbackManager == null )
            this.callbackManager = new CallbackFragmentManager( this );
        return this.callbackManager;
    }

    @Override
    public Map<String, Object> callback(CallbackFragmentManager.FragmentCallback callback) {
        return this.getCallback().callback( callback );
    }
}
