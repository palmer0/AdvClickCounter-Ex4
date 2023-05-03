package es.ulpgc.eite.cleancode.advclickcounter.clicks;

import android.util.Log;

import java.lang.ref.WeakReference;

import es.ulpgc.eite.cleancode.advclickcounter.app.AppMediator;
import es.ulpgc.eite.cleancode.advclickcounter.app.ClickToCounterState;
import es.ulpgc.eite.cleancode.advclickcounter.app.CounterToClickState;

public class ClickListPresenter implements ClickListContract.Presenter {

  public static String TAG = "AdvClickCounter.ClickListPresenter";

  private WeakReference<ClickListContract.View> view;
  private ClickListState state;
  private ClickListContract.Model model;
  private AppMediator mediator;

  public ClickListPresenter(AppMediator mediator) {
    this.mediator = mediator;

  }

  @Override
  public void onStart() {
    Log.e(TAG, "onStart()");

    // initialize the state
    state = new ClickListState();

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
  public void onClickButtonPressed() {
    Log.e(TAG, "onClickButtonPressed()");

    // TODO: add code if is necessary
  }

  private void passStateToPreviousScreen(ClickToCounterState state) {
    mediator.setPreviousClickScreenState(state);
  }

  private CounterToClickState getStateFromPreviousScreen() {
    return mediator.getPreviousClickScreenState();
  }

  @Override
  public void injectView(WeakReference<ClickListContract.View> view) {
    this.view = view;
  }

  @Override
  public void injectModel(ClickListContract.Model model) {
    this.model = model;
  }

}
