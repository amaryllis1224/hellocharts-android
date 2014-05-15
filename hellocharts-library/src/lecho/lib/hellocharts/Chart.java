package lecho.lib.hellocharts;

import lecho.lib.hellocharts.gestures.ChartTouchHandler;
import lecho.lib.hellocharts.model.ChartData;

public interface Chart {

	public ChartData getData();

	public LineChartRenderer getChartRenderer();

	public AxesRenderer getAxesRenderer();

	public ChartCalculator getChartCalculator();

	public ChartTouchHandler getTouchHandler();

}