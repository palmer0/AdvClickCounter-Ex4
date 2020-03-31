package es.ulpgc.eite.cleancode.advclickcounter.clicks;

import es.ulpgc.eite.cleancode.advclickcounter.app.AppMediator;
import es.ulpgc.eite.cleancode.advclickcounter.app.ClickToCounterState;
import es.ulpgc.eite.cleancode.advclickcounter.app.CounterToClickState;

public class ClickRouter implements ClickContract.Router {

  public static String TAG = ClickRouter.class.getSimpleName();

  private AppMediator mediator;

  public ClickRouter(AppMediator mediator) {
    this.mediator = mediator;
  }

  @Override
  public void passStateToPreviousScreen(ClickToCounterState state) {
    mediator.setPreviousClickScreenState(state);
  }

  @Override
  public CounterToClickState getStateFromPreviousScreen() {
    return mediator.getPreviousClickScreenState();
  }

  /*
  @Override
  public void navigateToNextScreen() {
    Context context = mediator.getApplicationContext();
    Intent intent = new Intent(context, ClickActivity.class);
    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    context.startActivity(intent);
  }


  @Override
  public ClickState getStateFromNextScreen() {
    return mediator.getNextClickScreenState();
  }


  @Override
  public void passStateToNextScreen(ClickState state) {
    mediator.setNextClickScreenState(state);
  }
  */


}
