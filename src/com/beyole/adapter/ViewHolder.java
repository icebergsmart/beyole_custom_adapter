package com.beyole.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * ͨ�õ�viewholder
 * 
 * @date 2016/01/20
 * @author Iceberg
 * 
 */
public class ViewHolder {

	private final SparseArray<View> views;
	private View convertView;
	private int mPosition;

	private ViewHolder(Context context, ViewGroup parent, int layoutId, int position) {
		this.mPosition = position;
		this.views = new SparseArray<View>();
		convertView = LayoutInflater.from(context).inflate(layoutId, parent, false);
		convertView.setTag(this);
	}

	/**
	 * �õ�viewholder����
	 * 
	 * @param context
	 * @param conveView
	 * @param parent
	 * @param layoutId
	 * @param position
	 * @return
	 */
	public static ViewHolder get(Context context, View conveView, ViewGroup parent, int layoutId, int position) {
		if (conveView == null) {
			return new ViewHolder(context, parent, layoutId, position);
		} else {
			return (ViewHolder) conveView.getTag();
		}
	}

	/**
	 * ͨ���ؼ���id��ȡview��û�������views
	 * 
	 * @param viewId
	 * @return
	 */
	public <T extends View> T getView(int viewId) {
		View view = views.get(viewId);
		if (view == null) {
			view = convertView.findViewById(viewId);
			views.put(viewId, view);
		}
		return (T) view;
	}

	public View getConvertView() {
		return convertView;
	}

	/**
	 * ΪTextView�����ַ���
	 * 
	 * @param viewId
	 * @param text
	 * @return
	 */
	public ViewHolder setText(int viewId, String text) {
		TextView textView = getView(viewId);
		textView.setText(text);
		return this;
	}

	/**
	 * ΪImageView����ͼƬ
	 * 
	 * @param viewId
	 * @param drawableId
	 * @return
	 */
	public ViewHolder setImageResource(int viewId, int drawableId) {
		ImageView imageView = getView(viewId);
		imageView.setImageResource(drawableId);
		return this;
	}

	/**
	 * ΪImageView����ͼƬ
	 * 
	 * @param viewId
	 * @param bitmap
	 * @return
	 */
	public ViewHolder setImageBitmap(int viewId, Bitmap bitmap) {
		ImageView imageView = getView(viewId);
		imageView.setImageBitmap(bitmap);
		return this;
	}

	public int getPosition() {
		return mPosition;
	}
}
