package org.gdal.gdal;

public final class ViewshedOutputType {
  public final static ViewshedOutputType GVOT_NORMAL = new ViewshedOutputType("GVOT_NORMAL", gdalJNI.GVOT_NORMAL_get());
  public final static ViewshedOutputType GVOT_MIN_TARGET_HEIGHT_FROM_DEM = new ViewshedOutputType("GVOT_MIN_TARGET_HEIGHT_FROM_DEM", gdalJNI.GVOT_MIN_TARGET_HEIGHT_FROM_DEM_get());
  public final static ViewshedOutputType GVOT_MIN_TARGET_HEIGHT_FROM_GROUND = new ViewshedOutputType("GVOT_MIN_TARGET_HEIGHT_FROM_GROUND", gdalJNI.GVOT_MIN_TARGET_HEIGHT_FROM_GROUND_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static ViewshedOutputType swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + ViewshedOutputType.class + " with value " + swigValue);
  }

  private ViewshedOutputType(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private ViewshedOutputType(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private ViewshedOutputType(String swigName, ViewshedOutputType swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static ViewshedOutputType[] swigValues = { GVOT_NORMAL, GVOT_MIN_TARGET_HEIGHT_FROM_DEM, GVOT_MIN_TARGET_HEIGHT_FROM_GROUND };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

