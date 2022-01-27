package org.gdal.gdal;

public final class ViewshedMode {
  public final static ViewshedMode GVM_Diagonal = new ViewshedMode("GVM_Diagonal", gdalJNI.GVM_Diagonal_get());
  public final static ViewshedMode GVM_Edge = new ViewshedMode("GVM_Edge", gdalJNI.GVM_Edge_get());
  public final static ViewshedMode GVM_Max = new ViewshedMode("GVM_Max", gdalJNI.GVM_Max_get());
  public final static ViewshedMode GVM_Min = new ViewshedMode("GVM_Min", gdalJNI.GVM_Min_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static ViewshedMode swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + ViewshedMode.class + " with value " + swigValue);
  }

  private ViewshedMode(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private ViewshedMode(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private ViewshedMode(String swigName, ViewshedMode swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static ViewshedMode[] swigValues = { GVM_Diagonal, GVM_Edge, GVM_Max, GVM_Min };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

