package org.gdal.gdal;

public final class XMLNodeType {
  public final static XMLNodeType CXT_Element = new XMLNodeType("CXT_Element", gdalJNI.CXT_Element_get());
  public final static XMLNodeType CXT_Text = new XMLNodeType("CXT_Text", gdalJNI.CXT_Text_get());
  public final static XMLNodeType CXT_Attribute = new XMLNodeType("CXT_Attribute", gdalJNI.CXT_Attribute_get());
  public final static XMLNodeType CXT_Comment = new XMLNodeType("CXT_Comment", gdalJNI.CXT_Comment_get());
  public final static XMLNodeType CXT_Literal = new XMLNodeType("CXT_Literal", gdalJNI.CXT_Literal_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static XMLNodeType swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + XMLNodeType.class + " with value " + swigValue);
  }

  private XMLNodeType(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private XMLNodeType(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private XMLNodeType(String swigName, XMLNodeType swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static XMLNodeType[] swigValues = { CXT_Element, CXT_Text, CXT_Attribute, CXT_Comment, CXT_Literal };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

