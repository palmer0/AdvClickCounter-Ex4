package es.ulpgc.eite.cleancode.advclickcounter.counters;

import android.content.Context;
import android.content.Intent;

import es.ulpgc.eite.cleancode.advclickcounter.app.AppMediator;
import es.ulpgc.eite.cleancode.advclickcounter.app.ClickToCounterState;
import es.ulpgc.eite.cleancode.advclickcounter.app.CounterToClickState;

public class CounterRouter implements CounterContract.Router {

  public static String TAG = CounterRouter.class.getSimpleName();

  private AppMediator mediator;

  public CounterRouter(AppMediator mediator) {
    this.mediator = mediator;
  }

  @Override
  public void navigateToNextScreen() {
    Context context = mediator.getApplicationContext();
    Intent intent = new Intent(context, CounterActivity.class);
    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    context.startActivity(intent);
  }

  @Override
  public void passStateToNextScreen(CounterToClickState state) {
    mediator.setNextCounterScreenState(state);
  }

  /*
  @Override
  public void passStateToPreviousScreen(CounterState state) {
    mediator.setPreviousCounterScreenState(state);
  }

  @Override
  public CounterState getStateFromPreviousScreen() {
    return mediator.getPreviousCounterScreenState();
  }
  */

  @Override
  public ClickToCounterState getStateFromNextScreen() {
    return mediator.getNextCounterScreenState();
  }
}
