package es.ulpgc.eite.cleancode.advclickcounter.clicks;

public class ClickListModel implements ClickListContract.Model {

  public static String TAG = "AdvClickCounter.ClickListModel";

  private String data;

  public ClickListModel(String data) {
    this.data = data;
  }

  @Override
  public String getStoredData() {
    // Log.e(TAG, "getStoredData()");

    // TODO: add code if is necessary

    return data;
  }

  @Override
  public void onRestartScreen(String data) {
    // Log.e(TAG, "onRestartScreen()");

    // TODO: add code if is necessary
  }

  @Override
  public void onDataFromNextScreen(String data) {
    // Log.e(TAG, "onDataFromNextScreen()");

    // TODO: add code if is necessary
  }

  @Override
  public void onDataFromPreviousScreen(String data) {
    // Log.e(TAG, "onDataFromPreviousScreen()");

    // TODO: add code if is necessary
  }
}
