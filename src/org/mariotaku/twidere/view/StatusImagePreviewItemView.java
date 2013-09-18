/*
 * 				Twidere - Twitter client for Android
 *
 *  Copyright (C) 2012-2013 Mariotaku Lee <mariotaku.lee@gmail.com>
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.mariotaku.twidere.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

public class StatusImagePreviewItemView extends ImageView {

	public StatusImagePreviewItemView(final Context context) {
		this(context, null);
	}

	public StatusImagePreviewItemView(final Context context, final AttributeSet attrs) {
		this(context, attrs, 0);
	}

	public StatusImagePreviewItemView(final Context context, final AttributeSet attrs, final int defStyle) {
		super(context, attrs, defStyle);
		setAdjustViewBounds(true);
		setScaleType(ScaleType.CENTER_CROP);
	}

	@Override
	protected void onMeasure(final int widthMeasureSpec, final int heightMeasureSpec) {
		final int width = MeasureSpec.getSize(widthMeasureSpec);
		final int hSpec = MeasureSpec.makeMeasureSpec(width, MeasureSpec.EXACTLY);
		super.onMeasure(widthMeasureSpec, hSpec);
		setMeasuredDimension(width, width);
	}

}
