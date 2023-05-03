package es.ulpgc.eite.cleancode.advclickcounter.counters;

import android.util.Log;

import java.lang.ref.WeakReference;

import es.ulpgc.eite.cleancode.advclickcounter.app.AppMediator;
import es.ulpgc.eite.cleancode.advclickcounter.app.ClickToCounterState;
import es.ulpgc.eite.cleancode.advclickcounter.app.CounterToClickState;

public class CounterListPresenter implements CounterListContract.Presenter {

  public static String TAG = "AdvClickCounter.CounterListPresenter";

  private WeakReference<CounterListContract.View> view;
  private CounterListState state;
  private CounterListContract.Model model;
  private AppMediator mediator;

  public CounterListPresenter(AppMediator mediator) {
    this.mediator = mediator;

  }


  @Override
  public void onStart() {
    Log.e(TAG, "onStart()");

    // initialize the state
    state = new CounterListState();

    // TODO: add code if is necessary
  }

  @Override
  public void onRestart() {
    Log.e(TAG, "onRestart()");

    // TODO: add code if is necessary
  }

  @Override
  public void onResume() {
    Log.e(TAG, "onResume()");

    // TODO: add code if is necessary

  }

  @Override
  public void onBackPressed() {
    Log.e(TAG, "onBackPressed()");

    // TODO: add code if is necessary
  }

  @Override
  public void onPause() {
    Log.e(TAG, "onPause()");

    // TODO: add code if is necessary
  }

  @Override
  public void onDestroy() {
    Log.e(TAG, "onDestroy()");

    // TODO: add code if is necessary
  }

  @Override
  public void onCounterButtonPressed() {
    Log.e(TAG, "onCounterButtonPressed()");

    // TODO: add code if is necessary
  }

  private void passStateToNextScreen(CounterToClickState state) {
    mediator.setNextCounterScreenState(state);
  }

  private ClickToCounterState getStateFromNextScreen() {
    return mediator.getNextCounterScreenState();
  }


  @Override
  public void injectView(WeakReference<CounterListContract.View> view) {
    this.view = view;
  }

  @Override
  public void injectModel(CounterListContract.Model model) {
    this.model = model;
  }

}
