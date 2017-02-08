package com.squareup.timessquare;

import java.util.Date;

/**
 * Adapter used to provide a layout for {@link CalendarCellView}.
 */
public interface DayViewAdapter {
    void makeCellView(CalendarCellView parent);

    void onDateSets(Date date, CalendarCellView view);
}
