package umg.deltadax.mruv.utility;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;

import umg.deltadax.mruv.R;

public class LoadingDialog {

	/**
	 * @author josepablocabreragarcia It creates a Loading Dialog
	 */
	static ProgressDialog pgProgressDialog;
	int progress;
	static Context ctx;

	public static void setContext(Context context) {
		ctx = context;
	}

	/**
	 * Starts the loading dialog
	 * 
	 * @author josepablocabreragarcia
	 */
	public static void showSpinnerLoading(String titulo) {

		try {
			if (titulo == null)
				titulo = ctx.getString(R.string.loading);

			pgProgressDialog = new ProgressDialog(ctx);
			pgProgressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
			pgProgressDialog.setMessage(titulo);
			pgProgressDialog.setCanceledOnTouchOutside(false);
			pgProgressDialog.setCancelable(false);

			if (!((Activity) ctx).isFinishing()) {
				pgProgressDialog.show();
			}

		} catch (Exception e) {

		}

	}

	/**
	 * Stops the loading dialog
	 * 
	 * @author josepablocabreragarcia
	 */
	public static void stopSpinnerLoading() {
		if (pgProgressDialog != null) {
			pgProgressDialog.dismiss();
		}
	}
}
