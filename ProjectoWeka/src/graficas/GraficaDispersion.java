package graficas;

import java.util.Arrays;
import java.util.Vector;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.editor.ChartEditorFactory;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYIntervalSeriesCollection;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class GraficaDispersion {
    int asig[];
    double x[];
    double y[];
    
    public GraficaDispersion(int[] asig, double[] x, double[] y){
       this.asig = asig;
       this.x = x;
       this.y = y;
    }

    public GraficaDispersion() {
        
    }
    public ChartPanel generarGrafica(){
        
        XYDataset dataset=crearDataset();
        JFreeChart chart=ChartFactory.createScatterPlot("Area vs perimeter","Area", "Perimeter", dataset);
        ChartPanel cp=new ChartPanel(chart);
        return cp; 
    }
    public XYDataset crearDataset(){
        
        XYSeriesCollection dataset=new XYSeriesCollection();
        XYSeries c1=new XYSeries("C1");
        XYSeries c2=new XYSeries("C2");
        XYSeries c3=new XYSeries("C3");
               
        for (int i = 0; i < 210; i++) {
            
            if(asig[i]==0){
                c1.add(x[i],y[i]);
            }
            else if(asig[i]==1){
                c2.add(x[i],y[i]);
            }
            else{
                c3.add(x[i],y[i]);
            }
        }
        dataset.addSeries(c1);
        dataset.addSeries(c2);
        dataset.addSeries(c3);
        
        return dataset; 
    }
    
}
