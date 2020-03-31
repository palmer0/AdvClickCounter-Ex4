package es.ulpgc.eite.cleancode.advclickcounter.app;

import android.app.Application;

import es.ulpgc.eite.cleancode.advclickcounter.clicks.ClickState;
import es.ulpgc.eite.cleancode.advclickcounter.counters.CounterState;

public class AppMediator extends Application {

  private CounterState counterState;
  private ClickState clickState;

  @Override
  public void onCreate() {
    super.onCreate();

    counterState =new CounterState();
    clickState = new ClickState();
  }

  public CounterState getCounterState() {
    return counterState;
  }

  public ClickState getClickState() {
    return clickState;
  }

  public void setNextCounterScreenState(CounterToClickState state) {

  }

  public ClickToCounterState getNextCounterScreenState() {
    return null;
  }

  public void setPreviousClickScreenState(ClickToCounterState state) {

  }

  public CounterToClickState getPreviousClickScreenState() {
    return null;
  }
}
