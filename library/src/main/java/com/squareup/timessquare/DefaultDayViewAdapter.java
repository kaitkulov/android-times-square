package com.squareup.timessquare;

import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.TextView;

import java.util.Date;

public class DefaultDayViewAdapter implements DayViewAdapter {
  @Override
  public void makeCellView(CalendarCellView parent) {
      TextView textView = new TextView(
              new ContextThemeWrapper(parent.getContext(), R.style.CalendarCell_CalendarDate));
      textView.setDuplicateParentStateEnabled(true);
      parent.addView(textView);
      parent.setDayOfMonthTextView(textView);
  }

    @Override
    public void onDateSets(Date date, CalendarCellView view) {

    }
}
