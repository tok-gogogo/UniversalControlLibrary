package tok_gogogo.htt.universalcontrollibrary;
import android.content.Context;
import android.widget.Toast;

/**
 * 吐司工具类
 *
 * @author tok_gogogo
 * @date 17/10/31
 */
public class ToastUtils {
    /**
     * 显示吐司
     *
     * @param context
     * @param str
     */
    public static void showToast(Context context, String str) {
        Toast.makeText(context, str, Toast.LENGTH_LONG).show();
    }

}
