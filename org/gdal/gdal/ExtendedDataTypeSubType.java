package org.gdal.gdal;

public final class ExtendedDataTypeSubType {
  public final static ExtendedDataTypeSubType GEDTST_NONE = new ExtendedDataTypeSubType("GEDTST_NONE", gdalJNI.GEDTST_NONE_get());
  public final static ExtendedDataTypeSubType GEDTST_JSON = new ExtendedDataTypeSubType("GEDTST_JSON", gdalJNI.GEDTST_JSON_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static ExtendedDataTypeSubType swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + ExtendedDataTypeSubType.class + " with value " + swigValue);
  }

  private ExtendedDataTypeSubType(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private ExtendedDataTypeSubType(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private ExtendedDataTypeSubType(String swigName, ExtendedDataTypeSubType swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static ExtendedDataTypeSubType[] swigValues = { GEDTST_NONE, GEDTST_JSON };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

