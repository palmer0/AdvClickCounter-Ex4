package es.ulpgc.eite.cleancode.advclickcounter.counters;

import java.lang.ref.WeakReference;

import es.ulpgc.eite.cleancode.advclickcounter.app.ClickToCounterState;
import es.ulpgc.eite.cleancode.advclickcounter.app.CounterToClickState;

public interface CounterContract {

  interface View {
    void injectPresenter(Presenter presenter);

    void onDataUpdated(CounterViewModel viewModel);
  }

  interface Presenter {
    void injectView(WeakReference<View> view);

    void injectModel(Model model);

    void injectRouter(Router router);

    void onResume();

    void onStart();

    void onRestart();

    void onBackPressed();

    void onPause();

    void onDestroy();

    void onCounterButtonPressed();
  }

  interface Model {
    String getStoredData();

    void onDataFromNextScreen(String data);

    void onRestartScreen(String data);

    void onDataFromPreviousScreen(String data);
  }

  interface Router {
    void navigateToNextScreen();

    void passStateToNextScreen(CounterToClickState state);

    //CounterState getStateFromPreviousScreen();

    ClickToCounterState getStateFromNextScreen();

    //void passStateToPreviousScreen(CounterState state);
  }
}
