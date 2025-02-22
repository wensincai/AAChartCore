package com.example.anan.AAChartCore.ChartsDemo.AdditionalContent;

import static com.example.anan.AAChartCore.ChartsDemo.chartcomposer.JSFunctionChartOptionsComposer.*;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.anan.AAChartCore.AAChartCoreLib.AAChartCreator.AAChartView;
import com.example.anan.AAChartCore.AAChartCoreLib.AAOptionsModel.AAOptions;
import com.example.anan.AAChartCore.R;

public class JSFormatterFunctionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_tooltip_with_jsfunction);
        Intent intent = getIntent();
        String chartType = intent.getStringExtra("chartType");

        AAOptions aaOptions = configureTheChartOptions(chartType);

        AAChartView aaChartView = findViewById(R.id.AAChartView);
        aaChartView.aa_drawChartWithChartOptions(aaOptions);

    }

    AAOptions configureTheChartOptions(String chartType) {
        switch (chartType) {
            case "customAreaChartTooltipStyleWithSimpleFormatString":
                return customAreaChartTooltipStyleWithSimpleFormatString();//简单字符串拼接
            case "customAreaChartTooltipStyleWithDifferentUnitSuffix":
                return customAreaChartTooltipStyleWithDifferentUnitSuffix();//自定义不同单位后缀
            case "customAreaChartTooltipStyleWithColorfulHtmlLabels":
                return customAreaChartTooltipStyleWithColorfulHtmlLabels();//自定义多彩颜色文字
            case "customLineChartTooltipStyleWhenValueBeZeroDoNotShow":
                return customLineChartTooltipStyleWhenValueBeZeroDoNotShow();//值为0时,在tooltip中不显示
            case "customBoxplotTooltipContent":
                return customBoxplotTooltipContent();
            case "customYAxisLabels":
                return customYAxisLabels();
            case "customYAxisLabels2":
                return customYAxisLabels2();
            case "customStackedAndGroupedColumnChartTooltip":
                return customStackedAndGroupedColumnChartTooltip();
            case "customDoubleXAxesChart":
                return customDoubleXAxesChart();
            case "customArearangeChartTooltip":
                return customArearangeChartTooltip();
            case "customLineChartOriginalPointPositionByConfiguringXAxisFormatterAndTooltipFormatter":
                return customLineChartOriginalPointPositionByConfiguringXAxisFormatterAndTooltipFormatter();
            case "customTooltipWhichDataSourceComeFromOutSideRatherThanSeries":
                return customTooltipWhichDataSourceComeFromOutSideRatherThanSeries();

            case "customSpiderChartStyle":
                return customSpiderChartStyle();//自定义蜘蛛🕷🕸图样式
            case "customizeEveryDataLabelSinglelyByDataLabelsFormatter":
                return customizeEveryDataLabelSinglelyByDataLabelsFormatter();//通过 DataLabels 的 formatter 函数来实现单个数据标签🏷自定义
            case "customXAxisLabelsBeImages":
                return customXAxisLabelsBeImages();//自定义 X轴 labels 为一组图片
            case "customLegendItemClickEvent":
                return customLegendItemClickEvent();//自定义图例点击事件🖱
            case "customTooltipPostionerFunction":
                return customTooltipPostionerFunction();//自定义浮动提示框 Positioner 函数
            case "fixedTooltipPositionByCustomPositionerFunction":
                return fixedTooltipPositionByCustomPositionerFunction();//通过 Positioner 函数来实现一个位置固定的提示框
            case "customPlotAreaOutsideComlicatedTooltipStyle":
                return customPlotAreaOutsideComlicatedTooltipStyle();//通过 Positioner 函数来实现绘图区外的复杂浮动提示框样式
            case "disableColumnChartUnselectEventEffectBySeriesPointEventClickFunction":
                return disableColumnChartUnselectEventEffectBySeriesPointEventClickFunction();//通过 Series 的 Point 的选中事件函数来禁用条形图反选效果
            case "customAreasplineChartTooltipStyleByDivWithCSS":
                return customAreasplineChartTooltipStyleByDivWithCSS();//通过自定义 div 的 css 样式来自定义复杂效果的 tooltip 浮动提示框
            case "configureTheAxesLabelsFormattersOfDoubleYAxesChart":
                return configureTheAxesLabelsFormattersOfDoubleYAxesChart();//配置双 Y 轴图表的 Y 轴文字标签的 Formatter 函数 示例 1
            case "configureTheAxesLabelsFormattersOfDoubleYAxesChart2":
                return configureTheAxesLabelsFormattersOfDoubleYAxesChart2();//配置双 Y 轴图表的 Y 轴文字标签的 Formatter 函数 示例 2
            case "configureTheAxesLabelsFormattersOfDoubleYAxesChart3":
                return configureTheAxesLabelsFormattersOfDoubleYAxesChart3();//配置双 Y 轴图表的 Y 轴文字标签的 Formatter 函数 示例 3
            case "makePieChartShow0Data":
                return makePieChartShow0Data();//使饼图显示为 0 的数据
            case "customColumnChartXAxisLabelsTextByInterceptTheFirstFourCharacters":
                return customColumnChartXAxisLabelsTextByInterceptTheFirstFourCharacters();//通过截取前四个字符来自定义 X 轴 labels
            case "setCrosshairAndTooltipToTheDefaultPositionAfterLoadingChart":
                return setCrosshairAndTooltipToTheDefaultPositionAfterLoadingChart();//图表加载完成后, 在指定位置默认显示 crosshair 和 tooltip
            case "customColumnChartBorderStyleAndStatesHoverColor":
                return customColumnChartBorderStyleAndStatesHoverColor();//自定义📊柱状图的 border 样式和手指或鼠标 hover 时的显示效果
            case "generalDrawingChart":
                return generalDrawingChart();//自由绘图🎨
            case "advancedTimeLineChart":
                return advancedTimeLineChart();//高级时间线图

        }
        return customAreaChartTooltipStyleWithSimpleFormatString();
    }
}