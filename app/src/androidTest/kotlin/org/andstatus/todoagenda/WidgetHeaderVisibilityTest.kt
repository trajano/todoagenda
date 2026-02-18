package org.andstatus.todoagenda

import android.view.View
import org.andstatus.todoagenda.layout.WidgetHeaderLayout
import org.junit.Assert.assertEquals
import org.junit.Test

class WidgetHeaderVisibilityTest {
    @Test
    fun hiddenLayoutShouldSetHeaderParentGone() {
        assertEquals(View.GONE, RemoteViewsFactory.headerParentVisibility(WidgetHeaderLayout.HIDDEN))
    }

    @Test
    fun nonHiddenLayoutsShouldSetHeaderParentVisible() {
        assertEquals(View.VISIBLE, RemoteViewsFactory.headerParentVisibility(WidgetHeaderLayout.ONE_ROW))
        assertEquals(View.VISIBLE, RemoteViewsFactory.headerParentVisibility(WidgetHeaderLayout.TWO_ROWS))
    }
}
