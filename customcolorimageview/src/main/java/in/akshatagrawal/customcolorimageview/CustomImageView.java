package in.akshatagrawal.customcolorimageview;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by Akshat Agrawal on 16/10/17.
 *
 * @use CustomColorImage is used to set different color
 * tint to single image view
 */

@SuppressLint("AppCompatCustomView")
public class CustomImageView extends ImageView {
    Context context;

    public CustomImageView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public CustomImageView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public CustomImageView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        this.context = context;
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.CustomImageView);
        int color = typedArray.getColor(R.styleable.CustomImageView_c_color, 0);
        setTintColor(color);
        typedArray.recycle();
    }

    public void setTintColor(int color) {
        if (color != -1) {
            Drawable drawable1 = getDrawable();
            drawable1 = DrawableCompat.wrap(drawable1);
            DrawableCompat.setTint(drawable1.mutate(), color);
            setImageDrawable(drawable1);
        }
    }
}