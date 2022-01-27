package org.gdal.gdal;

public final class ExtendedDataTypeClass {
  public final static ExtendedDataTypeClass GEDTC_NUMERIC = new ExtendedDataTypeClass("GEDTC_NUMERIC");
  public final static ExtendedDataTypeClass GEDTC_STRING = new ExtendedDataTypeClass("GEDTC_STRING");
  public final static ExtendedDataTypeClass GEDTC_COMPOUND = new ExtendedDataTypeClass("GEDTC_COMPOUND");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static ExtendedDataTypeClass swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + ExtendedDataTypeClass.class + " with value " + swigValue);
  }

  private ExtendedDataTypeClass(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private ExtendedDataTypeClass(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private ExtendedDataTypeClass(String swigName, ExtendedDataTypeClass swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static ExtendedDataTypeClass[] swigValues = { GEDTC_NUMERIC, GEDTC_STRING, GEDTC_COMPOUND };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

