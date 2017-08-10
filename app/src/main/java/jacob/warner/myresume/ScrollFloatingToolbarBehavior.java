package jacob.warner.myresume;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;

import com.github.rubensousa.floatingtoolbar.FloatingToolbar;

/**
 * Created by Jacob on 8/6/2017.
 */

public class ScrollFloatingToolbarBehavior extends CoordinatorLayout.Behavior<FloatingToolbar> {

    ScrollFloatingToolbarBehavior() {
        super();
    }

    ScrollFloatingToolbarBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, FloatingToolbar child, View directTargetChild, View target, int nestedScrollAxes) {
        if (child.isShowing()) {
            child.onAnimationFinished();
            child.hide();
        }
        return super.onStartNestedScroll(coordinatorLayout, child, directTargetChild, target, nestedScrollAxes);
    }
}
